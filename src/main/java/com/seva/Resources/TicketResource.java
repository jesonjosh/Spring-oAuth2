package com.seva.Resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.seva.models.TicketDTO;
import com.seva.services.TicketService;

/***
 * 
 * @author Joshua
 * @Since 28-04-2016
 */

@RestController
@RequestMapping("/api")
public class TicketResource {
	
	@Autowired
	private TicketService ticketService;

	@RequestMapping(value = "/ticket", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TicketDTO>> getTicket() {
		List<TicketDTO> ticketDTOs = new ArrayList<>();
		ticketDTOs = ticketService.getTickets();
		return new ResponseEntity<List<TicketDTO>>(ticketDTOs, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/ticket", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TicketDTO> createTicket(@RequestBody TicketDTO ticketDTO) {
		return new ResponseEntity<TicketDTO>(ticketDTO, HttpStatus.OK);
	}

}
