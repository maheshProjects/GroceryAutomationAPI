package com.base;

public class BaseClass {
	RequestSpecification reqSpec;
	Response response;

	// 1.Initialize the Rest Assured
	public void initRestAssured() {
		reqSpec = RestAssured.given();
	}

	// 2.path param
	public void pathParam(String key, String value) {
		reqSpec = reqSpec.pathParam(key, value);

	}

	// 3.query param
	public void queryParam(String key, String value) {
		reqSpec = reqSpec.queryParam(key, value);

	}

	// header
	public void usingHeader(String value1, String value2) {
		reqSpec = reqSpec.header(value1, value2);

	}

	// 4.using get
	public Response usingGet(String url) {
		response = reqSpec.get(url);
		return response;

	}

	// 5.using post
	public Response usingPost(String url) {
		response = reqSpec.post(url);
		return response;
	}

	// 6.using put
	public Response usingPut(String url) {
		response = reqSpec.put(url);
		return response;
	}

	// 7.using patch
	public void usingPatch(String url) {
		response = reqSpec.patch(url);

	}

	// 8.using delete
	public Response usingDelete(String url) {
		response = reqSpec.delete(url);
		return response;

	}

	// 9.get response code
	public int responseCode(Response response){
		int statusCode = response.getStatusCode();
		return statusCode;

	}

	// 10.get the body to console as String
	public String getBodyToConString() {

		String asString = response.asString();
		return asString;

	}

	// 11.get the body to console as pretty format
	public String getBodyToConPretty() {
		String asPrettyString = response.asString();
		return asPrettyString;

	}

	// 12.Basic authenfication
	public void addBasicAuth(String username, String password) {
		reqSpec = reqSpec.auth().preemptive().basic(username, password);

	}

	// 13. Add Header
	public void addHeader(String key, String value) {
		reqSpec = RestAssured.given().header(key, value);
	}

	public void addHeaders(Headers headers) {
		reqSpec = RestAssured.given().headers(headers);

	}

	public void addBody(Object object) {
		reqSpec.given().body(object);

	}

	public String getProjectPAth() {
		return System.getProperty("user.dir");

	}

	public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties = new Properties();

		properties.load(new FileInputStream(getProjectPAth() + "\\Config\\Config.properties"));

		Object object = properties.get(key);
		String value = (String) object;
		return value;

	}
}


