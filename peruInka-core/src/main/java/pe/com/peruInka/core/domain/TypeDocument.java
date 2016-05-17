package pe.com.peruInka.core.domain;

public class TypeDocument extends BaseType {

	private static final long serialVersionUID = 1L;

	public enum Status {
		DOCUMENT_DNI("DOCUMENT_DNI"), DOCUMENT_LE("DOCUMENT_LE"), DOCUMENT_PAST("DOCUMENT_PAST"), DOCUMENT_C_EXTRA(
				"DOCUMENT_C_EXTRA");

		private String statusCode;

		private Status(String s) {
			statusCode = s;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}

}
