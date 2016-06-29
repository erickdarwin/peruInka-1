package pe.com.peruInka.core.dao;

import java.util.List;

import org.hibernate.SQLQuery;

import pe.com.peruInka.core.domain.UserSystem;

public class UserDAOImpl extends BaseDAOHibernate implements UserDAO {

	public UserSystem findUserSystemByUserAndPassword(String user, String password) {
		String query = " from UserSystem WHERE userName = '" + user + "' ";
		query = query + " and userPassword = '" + password + " '";
		query = query + " AND STATUS = 'USER_ACT' ";
		return findFirst(UserSystem.class, query);
	}

	public String[] findRoleByUserId(Long userId) {

		String sql = " SELECT r.roleValue FROM accessrole ra JOIN role r ON (ra.rolId=r.id) "
				+ " WHERE ra.userSystemId= " + userId;

		
		SQLQuery query = getSession().createSQLQuery(sql);
		
		List<Object> list =query.list();
		
		String[] roles = new String[list.size()] ;

		for (int i = 0; i < list.size(); i++) {
			roles[i] = (String) list.get(i);
		}


		
		
		// String[] roles = { "ROLE_CLIENT", "ROLE_ADMIN", "ROLE_SECRE" };
		// String[] roles = { "ROLE_SECRE" };
//		String[] roles = { "ROLE_ADMIN" };

		return roles;
	}

}
