package com.seva.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.seva.models.ShopTableDTO;
import com.seva.services.ShopService;

/***
 * 
 * @author Joshua
 *@Since 28-04-2016
 */
@RestController
@RequestMapping("/api")
public class ShopResource {
	
	@Autowired
	ShopService shopService;
	
	@RequestMapping(value = "/shop/table", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ShopTableDTO>> getShopTables() {
		return new ResponseEntity<List<ShopTableDTO>>(shopService.getShopTables(), HttpStatus.OK);

	}

}
