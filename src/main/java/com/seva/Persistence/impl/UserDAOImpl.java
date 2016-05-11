package com.seva.Persistence.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.seva.Persistence.AbstractDAO;
import com.seva.Persistence.UserDAO;
import com.seva.entity.Login;
import com.seva.models.LoginDTO;

@Repository
public class UserDAOImpl extends AbstractDAO implements UserDAO {
	
	public LoginDTO fetchLoginCredentialsByLoginId(String loginId) {
		LoginDTO loginDTO = null;
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("select from login where user_name=:userId");
		query.setParameter("userId", loginId);
		Login login = (Login) query.uniqueResult();
		if (login != null) {
			loginDTO = new LoginDTO(); 
			loginDTO.setUser_authority("ROLE_APP");
		}
		return loginDTO;
	}
}
