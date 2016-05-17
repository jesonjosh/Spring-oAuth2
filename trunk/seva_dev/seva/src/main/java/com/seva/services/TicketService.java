package com.seva.services;

import java.util.List;

import com.seva.models.TicketDTO;

public interface TicketService {
	
	/***
	 * To get tickets
	 * @return
	 */
	List<TicketDTO> getTickets();
	/***
	 * To save a ticket and its items
	 * @param ticketDTO
	 * @return
	 */
	TicketDTO saveTicket(TicketDTO ticketDTO);
	
}
