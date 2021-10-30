package TestCases;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import RUtils.Reuse;


public class TestCase1 {
	
		//public static SoftAssert sa = new SoftAssert();
	@BeforeMethod
		public static void baeUri() {
			RestAssured.baseURI = "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
			//RestAssured.baseURI="https://qa01-tekarch-accmanager.web.app/";
		}
		
		//Helper methods for correct login
		public static int loginAPI(String url) throws IOException {
			RestAssured.baseURI=url;
			String bodyJson1="login";
			
			Reuse.login(Reuse.readFromPropertiesFile("login"), Reuse.readFromPropertiesFile("contentType"),bodyJson1);
			//System.out.println(ReusableCode.statusCode);
			return Reuse.statusCode;
		}
		
		public static Response getAPI	(String url) throws IOException {
			Map<String,String>newMap=new HashMap();
			newMap.put("token",Reuse.token);


			RestAssured.baseURI=url;
			Response res=RestAssured.given().contentType(Reuse.readFromPropertiesFile("contentType")).headers(newMap).get();
;
			return res;
		}
	
	@Test(priority=1)
	public static void testLogin1() throws IOException {
		String url=RestAssured.baseURI+Reuse.readFromPropertiesFile("login");
		int statusCode = loginAPI(url);
		//sa.assertEquals(statusCode, 201);
		if (statusCode==201||statusCode ==200) {
			System.out.println("status"+statusCode);
		}
		else {
			System.out.println("status"+statusCode);
		}
			//Reuse.test.info("Application is launch failed");	
		}
		//sa.assertAll();
	
//testcase 2
@Test
public static void testLoginWithGet2() throws IOException {
	
	// login validation
	String baseURI = RestAssured.baseURI;
	String url=baseURI+Reuse.readFromPropertiesFile("login");
	int statusCode = loginAPI(url);
	//sa.assertEquals(statusCode, 201);
	if (statusCode==201||statusCode ==200) {
		System.out.println("pass" +statusCode);
	} else {
		System.out.println("fail" +statusCode);
	}
	
	// GET validation
	url=baseURI+Reuse.readFromPropertiesFile("getdata");
	Response result = getAPI(url);
	statusCode = result.getStatusCode();
	
	System.out.println("result="+result.asPrettyString());
	
	//sa.assertEquals(statusCode, 200);
	if ((statusCode==201||statusCode ==200) && result.toString() != "") {
		System.out.println("pass" +statusCode);
	} else {
		System.out.println("fail" +statusCode);
	}


}
}

