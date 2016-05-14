package com.seva.Persistence;

import java.util.List;

import com.seva.models.ItemDTO;
/***
 * 
 * @author Joshua
 *@Since 28-04-2016
 */
public interface MenuDAO {

	List<ItemDTO> getItems();
}
