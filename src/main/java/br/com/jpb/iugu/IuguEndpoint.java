package br.com.jpb.iugu;

import java.util.List;

import javax.ws.rs.HttpMethod;

public enum IuguEndpoint {

	POSTS("/posts", HttpMethod.GET),
	POST("/posts/%s", HttpMethod.GET);

	private String url;
	private String httpMethod;

	private IuguEndpoint(String url, String httpMethod) {
		this.url = url;
		this.httpMethod = httpMethod;
	}
	
	public String getUrl(List<Object> pathParameters) {
		if (pathParameters == null || pathParameters.isEmpty()) {
			return url;
		}
		return String.format(url, pathParameters.toArray());
	}
	
	public String getHttpMethod() {
		return httpMethod;
	}
	
	/*
	 * GET /posts GET /posts/1 GET /posts/1/comments GET /comments?postId=1 GET
	 * /posts?userId=1 POST /posts PUT /posts/1 PATCH /posts/1 DELETE /posts/1
	 */
}
