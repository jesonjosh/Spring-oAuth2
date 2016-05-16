package com.seva.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seva.Persistence.TicketDAO;
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

}
