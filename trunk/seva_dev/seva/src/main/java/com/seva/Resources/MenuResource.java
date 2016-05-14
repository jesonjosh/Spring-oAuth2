package com.seva.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.seva.models.ItemDTO;
import com.seva.services.MenuService;
/***
 * 
 * @author Joshua
 *@Since 28-04-2016
 */
@RestController
public class MenuResource {

	@Autowired
	MenuService menuService;

	@RequestMapping(value = "/menu",method = RequestMethod.GET)
	@ResponseBody
	public List<ItemDTO> getItems() {
		return menuService.getItems();

	}
}
