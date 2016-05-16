package com.seva.Persistence.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.seva.Persistence.AbstractDAO;
import com.seva.Persistence.TicketDAO;
import com.seva.models.TicketDTO;

@Repository
public class TicketDAOImpl extends AbstractDAO implements TicketDAO {

	@Override
	public List<TicketDTO> getTickets() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery(" SELECT TKT.ID,TKT.CREATE_DATE,TKT.ACTIVE_DATE,TKT.CREATION_HOUR,"
		+ " TKT.PAID,TIT.ITEM_ID,TIT.ITEM_COUNT,"
		+ "	TIT.ITEM_QUANTITY,TIT.ITEM_NAME,TIT.GROUP_NAME,TIT.CATEGORY_NAME, TIT.ITEM_PRICE,"
		+ " TIT.ITEM_TAX_RATE,TIT.SUB_TOTAL,TIT.TOTAL_PRICE,TTN.TABLE_ID "
		+ " FROM TICKET AS TKT "
		+ " JOIN TICKET_ITEM AS TIT ON TKT.ID = TIT.TICKET_ID"
		+ " LEFT OUTER JOIN TICKET_TABLE_NUM AS TTN ON TTN.TICKET_ID = TKT.ID; ");
		List<Object> ticketObjects = query.list();
		List<TicketDTO> ticketDTOs = new ArrayList<>();
		for(Object object: ticketObjects){
			Object[] ticket = (Object[])object;
			TicketDTO ticketDTO = new TicketDTO();
			ticketDTO.setId(String.valueOf(ticket[0]));
			ticketDTO.setCreate_date(String.valueOf(ticket[1]));
			ticketDTO.setActive_date(String.valueOf(ticket[2]));
			ticketDTO.setCreated_hour(String.valueOf(ticket[3]));
			ticketDTO.setIs_paid(String.valueOf(ticket[4]));
			ticketDTO.setItem_id(String.valueOf(ticket[5]));
			ticketDTO.setItem_count(String.valueOf(ticket[6]));
			ticketDTO.setItem_quantity(String.valueOf(ticket[7]));
			ticketDTO.setItem_name(String.valueOf(ticket[8]));
			ticketDTO.setGroup_name(String.valueOf(ticket[9]));
			ticketDTO.setCategory_name(String.valueOf(ticket[10]));
			ticketDTO.setItem_price(String.valueOf(ticket[11]));
			ticketDTO.setItem_tax_rate(String.valueOf(ticket[12]));
			ticketDTO.setSub_total(String.valueOf(ticket[13]));
			ticketDTO.setTotal_price(String.valueOf(ticket[14]));
			ticketDTO.setTable_id(String.valueOf(ticket[15]));
			ticketDTOs.add(ticketDTO);
		}
		return ticketDTOs;
	}

}
