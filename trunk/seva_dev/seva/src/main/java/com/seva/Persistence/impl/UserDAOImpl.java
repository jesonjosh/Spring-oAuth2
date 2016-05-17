package com.seva.Persistence.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.seva.Persistence.AbstractDAO;
import com.seva.Persistence.UserDAO;
import com.seva.models.LoginDTO;
import com.seva.models.UserPermissionDTO;

@Repository
public class UserDAOImpl extends AbstractDAO implements UserDAO {
	
	public LoginDTO fetchLoginCredentialsByLoginId(String loginId) {
		LoginDTO loginDTO = new LoginDTO();
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("SELECT usr.`AUTO_ID`,usr.`USER_ID`,usr.`USER_PASS`,usr.`FIRST_NAME`,usr.`LAST_NAME`,utype.`ID`, utype.`P_NAME` FROM `USERS` AS usr JOIN `USER_TYPE` AS utype ON usr.N_USER_TYPE = utype.ID WHERE usr.`user_id` =:userId")
				.setParameter("userId", loginId);
		Object[] userObj = (Object[]) query.uniqueResult();
		if (userObj != null) {
			loginDTO = new LoginDTO(); 
			loginDTO.setUserId(String.valueOf(userObj[1]));
			loginDTO.setUserPassword(String.valueOf(userObj[2]));
			loginDTO.setCustomerName(String.valueOf(userObj[3]).concat(" ").concat(String.valueOf(userObj[4])));
			loginDTO.setUser_authority_id(String.valueOf(userObj[5]));
			loginDTO.setUser_authority(String.valueOf(userObj[6]));
		}
		
//		Query permissionQuery = session.createSQLQuery("SELECT uup.elt AS permission FROM user_user_permission uup WHERE uup.permissionId = :userType")
//				.setParameter("userType", loginDTO.getUser_authority_id());
//		List<Object[]> permissionObjs = permissionQuery.list();
//		List<UserPermissionDTO> userPermissions = new ArrayList<>();
//		for(Object object: permissionObjs){
//			Object[] permission = (Object[])object;
//			UserPermissionDTO userPermissionDTO = new UserPermissionDTO();
//			userPermissionDTO.setPermission_name(String.valueOf(permission[0]));
//			userPermissions.add(userPermissionDTO);
//		}
//		loginDTO.setUserPermissions(userPermissions);
		return loginDTO;
	}
}
