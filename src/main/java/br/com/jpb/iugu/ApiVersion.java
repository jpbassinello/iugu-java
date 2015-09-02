package br.com.jpb.iugu;

public enum ApiVersion {

//	V1("https://api.iugu.com/v1");
	V1("http://jsonplaceholder.typicode.com");

	private final String url;

	private ApiVersion(String url) {
		this.url = url;
	}

	public String getFullUrl(String endpoint) {
		if (endpoint == null) {
			return url;
		}
		String ep = endpoint.startsWith("/") ? endpoint : "/" + endpoint;
		return url + ep;
	}

}