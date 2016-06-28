package pe.com.peruInka.core.dao;

import pe.com.peruInka.core.domain.UserSystem;

public class UserDAOImpl extends BaseDAOHibernate implements UserDAO {

	public UserSystem findUserSystemByUserAndPassword(String user, String password) {
		String query = " from UserSystem WHERE userName = '" + user + "' ";
		query = query + " and userPassword = '" + password + " '";
		query = query + " AND STATUS = 'USER_ACT' ";
		return findFirst(UserSystem.class, query);
	}

	public String[] findRoleByUserId(Long userId) {
		String[] roles = { "ROLE_CLIENT", "ROLE_ADMIN", "ROLE_SECRE" };

		return roles;
	}

}
