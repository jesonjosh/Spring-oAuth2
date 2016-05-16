package com.seva.Persistence.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.seva.Persistence.AbstractDAO;
import com.seva.Persistence.UserDAO;
import com.seva.entity.User;
import com.seva.models.LoginDTO;

@Repository
public class UserDAOImpl extends AbstractDAO implements UserDAO {
	
	public LoginDTO fetchLoginCredentialsByLoginId(String loginId) {
		LoginDTO loginDTO = new LoginDTO();
		loginDTO.setUserId("123");
		loginDTO.setUserPassword("1111");
		loginDTO.setUser_authority("ROLE_APP");
		
//		Session session = sessionFactory.getCurrentSession();
//		Query query = session.createSQLQuery("select user_id,user_pass,first_name,last_name,active,n_user_type from users where user_id =:userId")
//											.addEntity(User.class)
//											.setParameter("userId", loginId);
//		User user = (User) query.uniqueResult();
//		if (user != null) {
//			loginDTO = new LoginDTO(); 
//			loginDTO.setUser_authority("ROLE_APP");
//			
//			loginDTO.setUserId(String.valueOf(user.getUserId()));
//			loginDTO.setUserPassword(user.getUserPass());
//			loginDTO.setCustomerName(user.getFirstName().concat(" ").concat(user.getLastName()));
//			
//		}
		return loginDTO;
	}
}
