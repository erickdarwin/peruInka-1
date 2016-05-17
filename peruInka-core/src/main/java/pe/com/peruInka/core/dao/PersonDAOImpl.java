package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Person;


public class PersonDAOImpl extends BaseDAOHibernate implements PersonDAO{

	public List<Person> findAllPerson(){
		return find(Person.class, "from Person");
	}
	
	
}
