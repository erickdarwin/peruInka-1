package pe.com.peruInka.core.domain;

public class StatusPerson extends BaseType {

	private static final long serialVersionUID = 1L;

	public enum Status {
		PERSON_ACT("PERSON_ACT"), PERSON_INACT("PERSON_INACT");

		private String statusCode;

		private Status(String s) {
			statusCode = s;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}

}
