package pe.com.peruInka.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class PersonDAOImpTest extends AbstractUnitTest {

	@Autowired
	protected PersonDAO personDAO;
	// PersonDAO personDAO = new PersonDAO();
	
	public void testFindAllPerson(){
		System.out.println("==="+personDAO.findAllPerson());
	}

}
