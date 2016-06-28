package pe.com.peruInka.core.dao;

import pe.com.peruInka.core.domain.UserSystem;

public interface UserDAO {

	UserSystem findUserSystemByUserAndPassword(String user, String password);

	String[] findRoleByUserId(Long userId);
}
