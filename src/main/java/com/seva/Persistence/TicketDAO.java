package com.seva.Persistence;

import java.util.List;
import java.util.Set;

import com.seva.entity.Ticket;
import com.seva.entity.TicketTableNum;
import com.seva.models.TicketDTO;

public interface TicketDAO {
	
	/***
	 * @Method: To get the details of a ticket by ID
	 */
	Ticket getTicket(Long id);
	/***
	 * To get tickets
	 * @return
	 */
	List<TicketDTO> getTickets();
	
	/***
	 * To create/ update a ticket
	 * @param ticket
	 * @return
	 */
	public Ticket saveTicket(Ticket ticket);
	
	/***
	 * Method to reserve tables against a ticket
	 * @param ticketTableNum
	 * @return
	 */
	public Set<TicketTableNum> saveTicketTableNum(Set<TicketTableNum> ticketTableNumbers);

}
