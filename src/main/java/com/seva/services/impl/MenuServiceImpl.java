package com.seva.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seva.Persistence.MenuDAO;
import com.seva.models.ItemDTO;
import com.seva.services.MenuService;
/***
 * 
 * @author Joshua
 *@Since 28-04-2016
 */
@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	MenuDAO menuDAO;
	@Override
	public List<ItemDTO> getItems() {
		return menuDAO.getItems();
	}

}
