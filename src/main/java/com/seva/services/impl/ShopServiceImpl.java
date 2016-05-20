package com.seva.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seva.Persistence.ShopDAO;
import com.seva.models.ShopTableDTO;
import com.seva.services.ShopService;

/***
 * 
 * @author Joshua
 *@Since 28-04-2016
 */
@Service
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	ShopDAO shopDAO;
	
	public List<ShopTableDTO> getShopTables(){
		return shopDAO.getShopTables();
	}

}
