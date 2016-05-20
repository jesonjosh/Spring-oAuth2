package com.seva.Persistence.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.seva.Persistence.AbstractDAO;
import com.seva.Persistence.ShopDAO;
import com.seva.models.ShopTableDTO;

@Repository
public class ShopDAOImpl extends AbstractDAO implements ShopDAO {

	@Override
	public List<ShopTableDTO> getShopTables() {
		
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("SELECT ID, NAME,DESCRIPTION,CAPACITY FROM SHOP_TABLE");
		List<Object> tableObjects = query.list();
		
		List<ShopTableDTO> shopTableDTOs = new ArrayList<>();
		for(Object object: tableObjects){
			Object[] sTables = (Object[])object;
			ShopTableDTO shopTableDTO = new ShopTableDTO();
			shopTableDTO.setId(String.valueOf(sTables[0]));
			shopTableDTO.setName(String.valueOf(sTables[1]));
			shopTableDTO.setDescription(String.valueOf(sTables[2]));
			shopTableDTO.setCapacity(String.valueOf(sTables[3]));
			
			shopTableDTOs.add(shopTableDTO);
		}
		return shopTableDTOs;
	}

}
