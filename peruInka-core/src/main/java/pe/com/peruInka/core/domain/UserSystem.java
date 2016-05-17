package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

public class UserSystem extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userName;
	private String userPassword;
	private Date dateIni;
	private Date dateFin;
	private String status;
	private Long personId;
	
	
}
