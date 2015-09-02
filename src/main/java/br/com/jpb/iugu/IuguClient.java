package br.com.jpb.iugu;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.codehaus.jackson.annotate.JsonProperty;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.client.jaxrs.engines.ApacheHttpClient4Engine;

public final class IuguClient {

	private final String apiToken;
	private final ApiVersion apiVersion;
	private final IuguEndpoint iuguEndpoint;
	private List<Object> pathParameters = Collections.emptyList();
	private Map<String, Object> queryParameters = Collections.emptyMap();

	private IuguClient(ApiVersion apiVersion, String apiToken,
			IuguEndpoint iuguEndpoint) {
		Objects.requireNonNull(apiToken,
				"Api Token is required to perform Iugu operations.");
		Objects.requireNonNull(iuguEndpoint,
				"Endpoint must be specified to perform Iugu operations.");
		this.apiToken = apiToken;
		this.apiVersion = ApiVersion.V1;
		this.iuguEndpoint = iuguEndpoint;
	}

	public static IuguClient build(String token, IuguEndpoint iuguEndpoint) {
		return new IuguClient(ApiVersion.V1, token, iuguEndpoint);
	}

	public IuguClient withPathParameters(List<Object> pathParameters) {
		this.pathParameters = pathParameters == null ? Collections.emptyList()
				: pathParameters;
		return this;
	}

	public IuguClient withQueryParameters(Map<String, Object> queryParameters) {
		this.queryParameters = queryParameters == null ? Collections.emptyMap()
				: queryParameters;
		return this;
	}

	public <T> T call(GenericType<T> returnGenericType) {
		Response response = makeRequest();
		if (returnGenericType == null) {
			return null;
		}
		return response.readEntity(returnGenericType);
	}

	public <T> T call(Class<T> returnType) {
		Response response = makeRequest();
		if (returnType == null) {
			return null;
		}
		return response.readEntity(returnType);
	}

	private Response makeRequest() {
		ResteasyClient client = buildClient();
		ResteasyWebTarget target = client.target(
				apiVersion.getFullUrl(iuguEndpoint.getUrl(pathParameters)));
		for (Entry<String, Object> entry : queryParameters.entrySet()) {
			target = target.queryParam(entry.getKey(), entry.getValue());
		}
		Response response = target.request(MediaType.APPLICATION_JSON)
				.method(iuguEndpoint.getHttpMethod());
		return response;
	}

	private ResteasyClient buildClient() {
		HttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
		CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
		credentialsProvider.setCredentials(AuthScope.ANY,
				new UsernamePasswordCredentials(apiToken, ""));
		CloseableHttpClient httpClient = HttpClientBuilder.create()
				.setConnectionManager(cm)
				.setDefaultCredentialsProvider(credentialsProvider).build();

		ApacheHttpClient4Engine engine = new ApacheHttpClient4Engine(
				httpClient);

		ResteasyClient client = new ResteasyClientBuilder().httpEngine(engine)
				.build();
		return client;
	}

	public static void main(String[] args) {
		Map<String, Object> queryParams = new HashMap<>();
		queryParams.put("userId", 1L);
		System.out.println(IuguClient.build("abc", IuguEndpoint.POSTS)
				.withQueryParameters(queryParams)
				.call(new GenericType<List<U>>() {
				}));
	}

	public static class U {
		@JsonProperty("userId")
		private long user_id;
		private long id;
		private String title;
		private String body;

		public long getUser_id() {
			return user_id;
		}
		
		public void setUser_id(long user_id) {
			this.user_id = user_id;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getBody() {
			return body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		@Override
		public String toString() {
			return "U [userId=" + user_id + ", id=" + id + ", title=" + title
					+ ", body=" + body + "]";
		}

	}

}