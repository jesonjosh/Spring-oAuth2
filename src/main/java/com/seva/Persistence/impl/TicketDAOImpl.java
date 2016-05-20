package com.seva.Persistence.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.seva.Persistence.AbstractDAO;
import com.seva.Persistence.TicketDAO;
import com.seva.entity.Ticket;
import com.seva.models.ItemDTO;
import com.seva.models.TicketDTO;

@Repository
public class TicketDAOImpl extends AbstractDAO implements TicketDAO {

	/***
	 * @Method: To get all tickets
	 * 
	 */
	@Override
	public List<TicketDTO> getTickets() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery(
				" SELECT TKT.ID,TKT.CREATE_DATE,TKT.ACTIVE_DATE,TKT.CREATION_HOUR,TKT.PAID,TTN.TABLE_ID "
						+ " FROM TICKET AS TKT " + " LEFT OUTER JOIN TICKET_TABLE_NUM AS TTN ON TTN.TICKET_ID = TKT.ID"
						+ " WHERE TKT.CLOSING_DATE IS NULL; ");
		List<Object> ticketObjects = query.list();
		List<TicketDTO> ticketDTOs = new ArrayList<>();
		for (Object object : ticketObjects) {
			Object[] ticket = (Object[]) object;
			TicketDTO ticketDTO = copyProperties(ticket);

			Query itemQuery = session
					.createSQLQuery(
							"SELECT TIT.ITEM_ID,TIT.ITEM_COUNT,TIT.ITEM_NAME,TIT.GROUP_NAME,TIT.CATEGORY_NAME, TIT.ITEM_PRICE"
									+ " FROM TICKET_ITEM AS TIT " + " WHERE TIT.TICKET_ID =:ticket_id")
					.setParameter("ticket_id", ticketDTO.getId());
			List<Object> itemObjects = itemQuery.list();
			List<ItemDTO> itemDTOs = new ArrayList<>();
			for (Object itemObject : itemObjects) {
				Object[] item = (Object[]) itemObject;
				ItemDTO itemDTO = copyTicketItemsProp(item);

				itemDTOs.add(itemDTO);
			}
			ticketDTO.setItems(itemDTOs);
			ticketDTOs.add(ticketDTO);
		}
		return ticketDTOs;
	}

	/***
	 * @Method: To save/ update a ticket
	 */
	@Override
	public Ticket saveTicket(Ticket ticket) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(ticket);
		return ticket;
	}

	@Override
	public Ticket getTicket(Long id) {
		Session session = sessionFactory.getCurrentSession();
		Ticket ticket = (Ticket) session.load(Ticket.class, id);
		Hibernate.initialize(ticket.getTicketItems());
		Hibernate.initialize(ticket.getTicketDiscounts());
		Hibernate.initialize(ticket.getTransactions());
		return ticket;

	}

	private TicketDTO copyProperties(Object[] ticket) {
		TicketDTO ticketDTO = new TicketDTO();
		ticketDTO.setId(String.valueOf(ticket[0]));
		ticketDTO.setCreate_date(String.valueOf(ticket[1]));
		ticketDTO.setActive_date(String.valueOf(ticket[2]));
		ticketDTO.setCreated_hour(String.valueOf(ticket[3]));
		ticketDTO.setIs_paid(String.valueOf(ticket[4]));
		ticketDTO.setTable_id(String.valueOf(ticket[5]));
		return ticketDTO;
	}

	private ItemDTO copyTicketItemsProp(Object[] item) {
		ItemDTO itemDTO = new ItemDTO();
		itemDTO.setId(String.valueOf(item[0]));
		itemDTO.setItem_count(String.valueOf(item[1]));
		itemDTO.setItem_name(String.valueOf(item[2]));
		itemDTO.setGroup_name(String.valueOf(item[3]));
		itemDTO.setCategory_name(String.valueOf(item[4]));
		itemDTO.setPrice(String.valueOf(item[5]));
		return itemDTO;
	}

}
