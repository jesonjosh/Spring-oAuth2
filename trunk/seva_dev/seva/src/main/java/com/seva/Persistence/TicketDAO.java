package com.seva.Persistence;

import java.util.List;

import com.seva.models.TicketDTO;

public interface TicketDAO {
	
	List<TicketDTO> getTickets();

}
