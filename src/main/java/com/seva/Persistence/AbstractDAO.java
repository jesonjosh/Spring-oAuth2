package com.seva.Persistence;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 
 * @author Joshua Joseph	
 * @since 28-04-2016
 */
public class AbstractDAO {

	/**
	 * jdbcTemplate
	 */
//	@Autowired
//	protected JdbcTemplate jdbcTemplate;

	/**
	 * sessionFactory
	 */
	@Autowired
	protected SessionFactory sessionFactory;
}
