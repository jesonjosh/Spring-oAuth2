package com.seva.Persistence.impl;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.seva.Persistence.AbstractDAO;
import com.seva.Persistence.MenuDAO;
import com.seva.framework.annotation.Log;

/***
 * 
 * @author Joshua
 *@Since 28-04-2016
 */

@Repository
public class MenuDAOImpl extends AbstractDAO implements MenuDAO{
	
	@Log
	private static Logger logger;
	public int getCustomerId(){
		logger.info("<<--- Entry getCustomer()--->>");
		int custId = 0;
		Session session = sessionFactory.getCurrentSession();
		session.createSQLQuery("select id from menu");
		logger.info("<<--- Exit getCustomer()--->>");
		return 0;
	}

}
