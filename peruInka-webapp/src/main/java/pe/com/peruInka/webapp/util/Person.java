package pe.com.peruInka.webapp.util;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
public class Person {

	private Long id;
	private String name;
	private String lastNameP;
	private String lastNameM;
	private String dni;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastNameP() {
		return lastNameP;
	}

	public void setLastNameP(String lastNameP) {
		this.lastNameP = lastNameP;
	}

	public String getLastNameM() {
		return lastNameM;
	}

	public void setLastNameM(String lastNameM) {
		this.lastNameM = lastNameM;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}