package pe.com.peruInka.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.peruInka.core.domain.UserSystem;

public class UserDAOImplTest extends AbstractUnitTest {

	@Autowired
	protected UserDAO userDAO;

	public void testFindUserSystemByUserAndPassword() {
		UserSystem userSystem = userDAO.findUserSystemByUserAndPassword("ocalsin__", "ocalsin");
		System.out.println("userSystem " + userSystem);
	}
	

	public void testFindRoleByUserId() {
		
		String[] roles =  userDAO.findRoleByUserId(1L);
		System.out.println("roles :: "+roles.length);
		
	}

//	String[] findRoleByUserId(Long userId)
}
