package com.seva.Persistence.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.seva.Persistence.AbstractDAO;
import com.seva.Persistence.MenuDAO;
import com.seva.framework.annotation.Log;
import com.seva.models.ItemDTO;

/***
 * 
 * @author Joshua
 *@Since 28-04-2016
 */

@Repository
public class MenuDAOImpl extends AbstractDAO implements MenuDAO{
	
	@Log
	private static Logger logger;
	
	public List<ItemDTO> getItems(){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("SELECT mi.ID,mc.NAME as category_name,mg.NAME as group_name,mi.NAME as item_name,mi.PRICE "
				+ " FROM MENU_ITEM mi "
				+ " JOIN MENU_GROUP mg ON mi.GROUP_ID = mg.ID "
				+ " JOIN MENU_CATEGORY mc ON mg.CATEGORY_ID = mc.ID "
				+ " WHERE mi.VISIBLE = 1 and mc.VISIBLE = 1 and mg.VISIBLE = 1 "
				+ " ORDER BY mc.ID, mg.ID,mi.ID");
		List<Object> itemObjects = query.list();
		List<ItemDTO> itemDTOs = new ArrayList<>();
		for(Object object: itemObjects){
			Object[] item = (Object[])object;
			ItemDTO itemDTO = new ItemDTO();
			itemDTO.setId(String.valueOf(item[0]));
			itemDTO.setCategory_name(String.valueOf(item[1]));
			itemDTO.setGroup_name(String.valueOf(item[2]));
			itemDTO.setItem_name(String.valueOf(item[3]));
			itemDTO.setPrice(String.valueOf(item[4]));
			itemDTOs.add(itemDTO);
		}
		return itemDTOs;
		
	}

}
