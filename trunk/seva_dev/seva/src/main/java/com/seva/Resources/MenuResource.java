package com.seva.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.seva.models.ItemDTO;
import com.seva.services.MenuService;
/***
 * 
 * @author Joshua
 *@Since 28-04-2016
 */
@RestController
@RequestMapping("/api")
public class MenuResource {

	@Autowired
	MenuService menuService;

	@RequestMapping(value = "/menu", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ItemDTO>> getItems() {
		return new ResponseEntity<List<ItemDTO>>(menuService.getItems(), HttpStatus.OK);

	}
}
