package com.seva.services.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seva.Persistence.TicketDAO;
import com.seva.entity.Ticket;
import com.seva.entity.TicketItem;
import com.seva.entity.TicketTableNum;
import com.seva.entity.User;
import com.seva.models.ItemDTO;
import com.seva.models.ShopTableDTO;
import com.seva.models.TicketDTO;
import com.seva.services.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDAO ticketDAO;
	
	@Override
	public List<TicketDTO> getTickets() {
		return ticketDAO.getTickets();
	}

	@Override
	public TicketDTO saveTicket(TicketDTO ticketDTO) {
		Ticket ticketEntity = new Ticket();
			Calendar currentTime = Calendar.getInstance();
			ticketEntity.setCreateDate(currentTime.getTime());
			ticketEntity.setCreationHour(currentTime.get(Calendar.HOUR_OF_DAY));
			ticketEntity.setActiveDate(currentTime.getTime());
			// Setting the delivery date as 10 min from ticket creatin time
			currentTime.add(Calendar.MINUTE, 10);
			ticketEntity.setDeliveeryDate(currentTime.getTime());
			ticketEntity.setDeliveryAddress(ticketDTO.getDeliveryAddress());
			ticketEntity.setNumberOfGuests(Integer.valueOf(ticketDTO.getGuest_count()));
			if(ticketDTO.getTicket_type() == null){
				ticketEntity.setTicketType("DINE IN");
			}else{
				ticketEntity.setTicketType(ticketDTO.getTicket_type());
			}
			// TODO: hardcoded the user for now
//			User user = new User();
//			user.setUserId(1);
//			ticketEntity.setUser2(user);
			
			copyTicketEntityProp(ticketDTO, ticketEntity);
			
//			ticketEntity.setAdvanceAmount(Double.valueOf(ticketDTO.getAdvanceAmount()));
//			ticketEntity.setClosingDate(formatter.parse(ticketDTO.getClosingDate()));
//			ticketEntity.setCustomerPickeup(customerPickeup);
//			ticketEntity.setDeliveryCharge(deliveryCharge);
//			ticketEntity.setDeliveryExtraInfo(deliveryExtraInfo);
//			ticketEntity.setDrawerResetted(drawerResetted);
//			ticketEntity.setDueAmount(dueAmount);
//			ticketEntity.setGratuities(gratuities);
//			ticketEntity.setIsReOpened(isReOpened);
//			ticketEntity.setIsTaxExempt(isTaxExempt);
//			ticketEntity.setPaid(paid);
//			ticketEntity.setPaidAmount(paidAmount);
//			ticketEntity.setRefunded(refunded);
//			ticketEntity.setServiceCharge(serviceCharge);
//			ticketEntity.setSettled(settled);
//			ticketEntity.setShift(shift);
//			ticketEntity.setStatus(status);
//			ticketEntity.setSubTotal(subTotal);
//			ticketEntity.setTerminal(terminal);
//			ticketEntity.setTicketDiscounts(ticketDiscounts);
//			ticketEntity.setTicketProperties(ticketProperties);
//			ticketEntity.setTicketType(ticketType);
//			ticketEntity.setTotalDiscount(totalDiscount);
//			ticketEntity.setTotalPrice(totalPrice);
//			ticketEntity.setTotalTax(totalTax);
//			ticketEntity.setTransactions(transactions);
//			ticketEntity.setUser1(user1);
//			ticketEntity.setUser2(user2);
//			ticketEntity.setUser3(user3);
//			ticketEntity.setVoided(voided);
//			ticketEntity.setVoidReason(voidReason);
//			ticketEntity.setWasted(wasted);
			
			ticketEntity = ticketDAO.saveTicket(ticketEntity);
			ticketDTO.setId(String.valueOf(ticketEntity.getId()));
			
			Set<TicketTableNum> ticketTableNumbers = new HashSet<>(); 
			for(ShopTableDTO shopTableDTO : ticketDTO.getShopTables()){
				TicketTableNum ticketTableNum = new TicketTableNum();
				ticketTableNum.setTableId(Integer.valueOf(shopTableDTO.getId()));
				ticketTableNum.setTicket(ticketEntity);
				ticketTableNumbers.add(ticketTableNum);
			}
//			ticketEntity.setTicketTableNums(ticketTableNumbers);
			ticketDAO.saveTicketTableNum(ticketTableNumbers);
			
		return ticketDTO;
	}

	private void copyTicketEntityProp(TicketDTO ticketDTO, Ticket ticketEntity) {
		Set<TicketItem> tItems = new HashSet<>();
		for(ItemDTO itemDTO: ticketDTO.getItems()){
			TicketItem item = new TicketItem();
			item.setItemId(Integer.valueOf(itemDTO.getId()));
			item.setItemCount(Integer.valueOf(itemDTO.getItem_count()));
			item.setTicket(ticketEntity);
			tItems.add(item);
			
		}
		ticketEntity.setTicketItems(tItems);
	}
}
