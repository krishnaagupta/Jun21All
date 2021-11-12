package TestCases;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import RUtils.ResponsePOJO;
import RUtils.DataPOJO;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.MatcherAssert.assertThat; 
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.Matchers.*;


public class TestCase1 {
	@BeforeMethod
	public static void baeUri() {
		RestAssured.baseURI = "https://reqres.in/";
	}

	public 	static ObjectMapper mapper = getDefaultObjectMapper();

	public static ObjectMapper getDefaultObjectMapper() {
		ObjectMapper defaultObjMapper =new ObjectMapper();
		return defaultObjMapper;
	}

	//https://www.youtube.com/watch?v=Hv_a3ZBSO_g
	// above site for parsing json
	public static JsonNode parse(String src) throws IOException {
		return mapper.readTree(src);
	}
	// POJO
	public static <A> A fromJson(JsonNode node, Class<A> clazz){
		try {
			return mapper.treeToValue(node, clazz);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	//@Test
	// HamCreastMatecher for assertions details check google docs webservices

	public static void t1HAmcrest() throws IOException {

		RestAssured.basePath="/api/users";
		ValidatableResponse res= RestAssured.given().get().then()
				.body("data[4].first_name", Matchers.equalTo("Charles"));

	}
	//https://www.youtube.com/watch?v=Hv_a3ZBSO_g   // for pojo 
	@Test // json to hasmap
	public static void Jsontomap() throws JsonParseException, JsonMappingException, IOException {
		RestAssured.basePath="/api/users";
		Response res= RestAssured.given().get();
		String body=res.asPrettyString();
		JsonNode node= parse(body);
		System.out.println("node="+node.toString());
		
		Map<String,Object> result =
				new ObjectMapper().readValue(body, HashMap.class);
		System.out.println("hashmap"+result);
		
		List<Object> data = (List<Object>) result.get("data");
		
		Map<String, String> data1 = (Map)(data.get(0));
		System.out.print("data1.emap="+data1.get("email"));

	//	ResponsePOJO response = 
				new ObjectMapper().readValue(body, ResponsePOJO.class);
		
		//System.out.println("1st->"+ response.data[0].email);	
		//System.out.println("1st->"+ response.data.get(0));	
				
		//System.out.print("one val--"+data1[0].charAt(0));
		
	}

	//@Test
	public static void t1POJO() throws IOException {

		RestAssured.basePath="/api/users";
		Response res= RestAssured.given().get();

		int code= res.statusCode();
		Headers resheader=res.getHeaders();
		long restime=res.getTime();
		List<Header> restlist = resheader.asList();
		System.out.println("code"+ code+"---"+resheader+"--"+ restime);
		String body=res.asPrettyString();

		//System.out.println("body"+ res.asPrettyString());

		JsonNode node= parse(body);
		JsonNode result = node.get("data");

		//System.out.println("result"+result.get(4));
		//System.out.println("email----+"+result.get(4).get("email"));
		//assertThat(result.get(4).get("email"),"charles.morris@reqres.in");
		// accessing the data through the POJO   
		// createing a POJO object
		//JsonNode node1= parse(body);
		System.out.println("node--"+node);
		ResponsePOJO pojo= fromJson(node,ResponsePOJO.class);
		System.out.println("pojo--"+pojo.data[4].first_name);

	}



	//@Test
	public static void t2() {
			
		RestAssured.basePath="/api/users";
		String reqBody="{\n"
				+ "    \"name\": \"amhvyjfjh\",\n"
				+ "    \"job\": \"ghschfj\"\n"
				+ "}";
		Response res=RestAssured.given()
				.contentType(ContentType.JSON).log().all().body(reqBody).post();
		System.out.println("code--"+res.statusCode());
		System.out.println("Header--"+res.headers());
		System.out.println("Body-"+res.body().asPrettyString());
		//res.body().as(Jackson)
		

	}
	//@Test
	public static void t2Loggingfileandconsole() throws FileNotFoundException {
		PrintStream log= new PrintStream(new FileOutputStream("test1.txt"));
		RestAssured.basePath="/api/users";
		String reqBody="{\n"
				+ "    \"name\": \"amhvyjfjh\",\n"
				+ "    \"job\": \"ghschfj\"\n"
				+ "}";
		Response res=RestAssured.given().filter(RequestLoggingFilter.logRequestTo(log))
				.filter(ResponseLoggingFilter.logResponseTo(log))
				.contentType(ContentType.JSON).log().all().body(reqBody).post();
		System.out.println("code--"+res.statusCode());
		System.out.println("Header--"+res.headers());
		System.out.println("Body-"+res.body().asPrettyString());
		//res.body().as(Jackson)
		

	}
	@Test
	public static void seleralizedatatoJSON() {
		ArrayList<DataPOJO> d1 = new ArrayList();
		d1.add(new DataPOJO("kk", "gg", 6, "kk.h@gmail.com", "sdsd"));
		ResponsePOJO p1= new ResponsePOJO(5,2,6,9,d1);
		//int page,int per_page,int total, int total_pages,DataPOJO [] data
		System.out.println(p1);
	}

	//@Test
	public static void t3Del() {
		RestAssured.basePath="/api/users/670";
		Response res=RestAssured.given().delete();
		System.out.println("code--"+res.statusCode());
		System.out.println("Header--"+res.headers());
		System.out.println("Body-"+res.body().asPrettyString());
	}

	//@Test
	public void testHamcrest() {
		RestAssured.basePath="/api/users";
		ValidatableResponse res=RestAssured.given().get().then().assertThat()
				.statusCode(200)
				//.header("token", "blahblavsd")
				.body("data[0].first_name", Matchers.equalTo("George"));

		
	}
	//	Response res=RestAssured.given().contentType(contentType).body("{\"password\": \"krishnaa123\",\"username\": \"krishnaa.gupta@gmail.com\"}").post();
	//	System.out.println("response="+res.asPrettyString());
	//	System.out.println("status code="+statusCode);
	//	statusCode= res.getStatusCode();
	//	if (statusCode ==200 ||statusCode==201) {
	//		HashMap<String, Object> maps = res.jsonPath().get("[0]");
	//	     token = maps.get("token").toString();
	//	     userid = maps.get("userid").toString();
	//	}
	//	      statusCode= res.getStatusCode();
	//     

	//	public class TestCase1 {
	//		public static SoftAssert sa = new SoftAssert();
	//
	//		@BeforeMethod
	//		public static void baeUri() {
	//			RestAssured.baseURI = "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
	//		}
	//		@BeforeMethod
	//		public void CreateReport(Method sTestMethod) {
	//			ReusableCode.test = ReusableCode.extent.createTest(sTestMethod.getName());
	//		}
	//		@BeforeSuite
	//		public static void beforeClass() throws IOException, ParseException {
	//			ReusableCode.jsonSetup();
	//		}
	//		
	//		@BeforeTest
	//		public static void startReport() {
	//			ReusableCode.initialiseReport();
	//		}
	//
	//		
	//		@AfterTest
	//		public static void publishReport() {
	//			ReusableCode.extent.flush();
	//		}
	//
	//		//Helper methods for correct login
	//		public static int loginAPI(String url) throws IOException {
	//			RestAssured.baseURI=url;
	//			String bodyJson1="login";
	//			ReusableCode.login(ReusableCode.readFromPropertiesFile("login"), ReusableCode.readFromPropertiesFile("contentType"),bodyJson1);
	//			//System.out.println(ReusableCode.statusCode);
	//			return ReusableCode.statusCode;
	//		}
	//		
	//		public static Response getAPI(String url) throws IOException {
	//			Map<String,String>newMap=new HashMap();
	//			newMap.put("token",ReusableCode.token);
	//			//System.out.println("ReusableCode.token="+ReusableCode.token);
	//			//System.out.println("url="+url);
	//
	//			RestAssured.baseURI=url;
	//			Response res=RestAssured.given().contentType(ReusableCode.readFromPropertiesFile("contentType")).headers(newMap).get();
	//			//System.out.println("res="+res.prettyPrint());
	//			//System.out.println(res.jsonPath().getString("accountno").toString());
	//			//System.out.println("Get-Data"+res.getStatusCode()+res.statusLine());
	//			return res;
	//		}
	//		
	//		public static Response deleteAPI(String url,Object data) throws IOException {
	//			Map<String,String>newMap=new HashMap();
	//			newMap.put("token",ReusableCode.token);
	//			RestAssured.baseURI=url;
	//			Response res=RestAssured.given().contentType(ReusableCode.readFromPropertiesFile("contentType")).headers(newMap).body(data).delete();
	//			return res;
	//		}
	//
	//		public static Response postAPI(String url, Object data) throws IOException {
	//			Map<String,String>newMap=new HashMap();
	//			newMap.put("token",ReusableCode.token);
	//			//System.out.println("ReusableCode.token="+ReusableCode.token);
	//			//System.out.println("url="+url);
	//
	//			RestAssured.baseURI=url;
	//			
	//			Response res=RestAssured.given().contentType(ReusableCode.readFromPropertiesFile("contentType")).headers(newMap).body(data).post();
	//			return res;
	//		}
	//
	//		public static Response putAPI(String url, Object data) throws IOException {
	//			Map<String,String>newMap=new HashMap();
	//			newMap.put("token",ReusableCode.token);
	//			//System.out.println("ReusableCode.token="+ReusableCode.token);
	//			//System.out.println("url="+url);
	//
	//			RestAssured.baseURI=url;
	//			
	//			Response res=RestAssured.given().contentType(ReusableCode.readFromPropertiesFile("contentType")).headers(newMap).body(data).put();
	//			return res;
	//		}
	//		
	//		public static String getIDForAccount(Response result, String accountNo) {
	//			
	//			String id="";
	//			List<Object> allObjs = result.jsonPath().getList("$");
	//			for (Object row: allObjs) {
	//				Map<String, String> map = (Map<String, String>)row;
	//				Object currAccountNo = map.get("accountno");
	//				
	//				if (currAccountNo instanceof String && currAccountNo.equals(accountNo)) {
	//					id=map.get("id");
	//				}
	//			}
	//			return id;
	//		}
	//		
	//		public static Map<String, String> getMapForAccount(Response result, String accountNo) {
	//			
	//			Map<String, String> ret=new HashMap<>();
	//			List<Object> allObjs = result.jsonPath().getList("$");
	//			for (Object row: allObjs) {
	//				Map<String, String> map = (Map<String, String>)row;
	//				Object currAccountNo = map.get("accountno");
	//				
	//				if (currAccountNo instanceof String && currAccountNo.equals(accountNo)) {
	//					ret=map;
	//				}
	//			}
	//			return ret;
	//		}
	//		
	//		//Helper methods for wrong login (wrong password)
	//	/*	public static int wrongLoginAPI(String url) throws IOException {
	//			RestAssured.baseURI=url;
	//			//CreateTest("TC 001 Logging in verification.");
	//			ReusableCode.loginWrong(ReusableCode.readFromPropertiesFile("login"), ReusableCode.readFromPropertiesFile("contentType"));
	//			System.out.println(ReusableCode.statusCode);
	//			return ReusableCode.statusCode;
	//		}*/
	//		
	//		
	//	//***********************TESTCASES**********************************************************************************	
	//		// Testcase 1- logIn with proper username and password. And response 201 should be received
	//		@Test(priority=1)
	//		public static void testLogin1() throws IOException {
	//			String url=RestAssured.baseURI+ReusableCode.readFromPropertiesFile("login");
	//			int statusCode = loginAPI(url);
	//			sa.assertEquals(statusCode, 201);
	//			if (statusCode==201||statusCode ==200) {
	//			ReusableCode.test.info("Application is launched");}
	//			else {
	//				ReusableCode.test.info("Application is launch failed");	
	//			}
	//			sa.assertAll();
	//		}
	//		
	//		// Testcase 1- logIn with proper username and password.Application to be launched and data got from server > the status code 200 received
	//		@Test(priority=2)
	//		public static void testLoginWithGet2() throws IOException {
	//			
	//			// login validation
	//			String baseURI = RestAssured.baseURI;
	//			String url=baseURI+ReusableCode.readFromPropertiesFile("login");
	//			int statusCode = loginAPI(url);
	//			sa.assertEquals(statusCode, 201);
	//			if (statusCode==201||statusCode ==200) {
	//				ReusableCode.test.info("App launched");
	//			} else {
	//				ReusableCode.test.info("Appnot launched");	
	//			}
	//			
	//			// GET validation
	//			url=baseURI+ReusableCode.readFromPropertiesFile("getdata");
	//			Response result = getAPI(url);
	//			statusCode = result.getStatusCode();
	//			
	//			System.out.println("result="+result.asPrettyString());
	//			
	//			sa.assertEquals(statusCode, 200);
	//			if ((statusCode==201||statusCode ==200) && result.toString() != "") {
	//				ReusableCode.test.info("Data got");
	//			} else {
	//				ReusableCode.test.info("Data not displayed");
	//			}
	//		
	//			sa.assertAll();
	//		}
	//			
	//		//test Case to Add data
	//		@Test(priority=3)
	//		public static void testAddData3() throws IOException {
	//
	//			// login validation
	//			String baseURI = RestAssured.baseURI;
	//			String url=baseURI+ReusableCode.readFromPropertiesFile("login");
	//			int statusCode = loginAPI(url);
	//			sa.assertEquals(statusCode, 201);
	//			if (statusCode==201||statusCode ==200) {
	//				ReusableCode.test.info("App launched");
	//			} else {
	//				ReusableCode.test.info("Appnot launched");	
	//			}
	//			
	//			// GET validation
	//			url=baseURI+ReusableCode.readFromPropertiesFile("getdata");
	//			Response result=getAPI(url);
	//			statusCode = result.getStatusCode();
	//
	//			sa.assertEquals(statusCode, 201);
	//			if ((statusCode==201||statusCode ==200)&& result.toString() != "") {
	//				ReusableCode.test.info("Data got");
	//			} else {
	//				ReusableCode.test.info("Data not displayed");	
	//			}
	//			
	//			
	//			//Adddata validation
	//			url=baseURI+ReusableCode.readFromPropertiesFile("adddata");
	//			
	//			System.out.println("data="+ReusableCode.getValueFromJson("data"));
	//			JSONArray dataArr = (JSONArray)(ReusableCode.getValueFromJson("data"));
	//			JSONObject data = (JSONObject) dataArr.get(0);
	//
	//			Response res = postAPI(url, data);
	//			int retCode = res.getStatusCode();
	//			System.out.println("responsePOST="+res.asPrettyString());
	//			
	//			sa.assertEquals(retCode, 201);
	//			if (retCode==201||retCode ==200) {
	//				ReusableCode.test.info("Data added");
	//			} else {
	//				ReusableCode.test.info("Data not added");	
	//			}
	//		}
	//			
	//		//TestCase to Update/edit data
	//		@Test(priority=4)
	//		public static void testUpdateAPI4() throws IOException {
	//
	//			// login validation
	//			String baseURI = RestAssured.baseURI;
	//			String url=baseURI+ReusableCode.readFromPropertiesFile("login");
	//			int statusCode = loginAPI(url);
	//			sa.assertEquals(statusCode, 201);
	//			if (statusCode==201||statusCode ==200) {
	//				ReusableCode.test.info("App launched");
	//			} else {
	//				ReusableCode.test.info("Appnot launched");	
	//			}
	//
	//			JSONArray dataArr = (JSONArray)(ReusableCode.getValueFromJson("data"));
	//			JSONObject data = (JSONObject) dataArr.get(0);
	//			
	//			String accountNo = (String)(data.get("accountno"));
	//
	//			// GET validation
	//			url=baseURI+ReusableCode.readFromPropertiesFile("getdata");
	//			Response result = getAPI(url);
	//			statusCode = result.getStatusCode();
	//
	//			sa.assertEquals(statusCode, 201);
	//			if ((statusCode==201||statusCode ==200) && result.toString() != "") {
	//				ReusableCode.test.info("Data got");
	//			} else {
	//				ReusableCode.test.info("Data not displayed");	
	//			}
	//			String id=getIDForAccount(result, accountNo);
	//					
	//			System.out.println("id found="+id);
	//
	//			data.replace("salary", "6000");
	//			data.put("userid", ReusableCode.userid);
	//			data.put("id", id);
	//
	//			// update validation
	//			url=baseURI+ReusableCode.readFromPropertiesFile("updatedata");
	//			Response res = putAPI(url, data);
	//			int retCode = res.statusCode();
	//			
	//			System.out.println("Responsesddd="+res.asPrettyString());
	//			sa.assertEquals(retCode, 201);
	//			if (retCode==201||retCode ==200) {
	//				ReusableCode.test.info("Data added");
	//			} else {
	//				ReusableCode.test.info("Data not added");	
	//			}
	//
	//			
	//			if ((statusCode==201||statusCode ==200)&& result.toString()!="") {
	//				ReusableCode.test.info("Data got");
	//			} else {
	//				ReusableCode.test.info("Data not displayed");	
	//			}
	//
	//			// check if sal is updated
	//			Map<String, String> map=getMapForAccount(result,accountNo);
	//			String veriFySal=map.get("salary");
	//			System.out.println("salary" +map.get("salary"));
	//			if (veriFySal.equals("6000") ) {
	//				
	//				ReusableCode.test.info("sal updated ,Upadte pass.");
	//			}else{
	//			
	//			
	//				ReusableCode.test.info("sal not updated.");
	//			}
	//		}	
	//		//test Case to delete data
	//		@Test(priority=5)
	//		public static void testDeleteAPI4() throws IOException {
	//			// login validation
	//			String baseURI = RestAssured.baseURI;
	//			String url=baseURI+ReusableCode.readFromPropertiesFile("login");
	//			int statusCode = loginAPI(url);
	//			sa.assertEquals(statusCode, 201);
	//			if (statusCode==201||statusCode ==200) {
	//				ReusableCode.test.info("App launched");
	//			} else {	
	//				ReusableCode.test.info("Appnot launched");	
	//			}
	//
	//			JSONArray dataArr = (JSONArray)(ReusableCode.getValueFromJson("data"));
	//			JSONObject data = (JSONObject) dataArr.get(0);
	//			
	//			String accountNo = (String)(data.get("accountno"));
	//
	//			// GET validation
	//			url=baseURI+ReusableCode.readFromPropertiesFile("getdata");
	//			Response result = getAPI(url);
	//			statusCode = result.getStatusCode();
	//
	//			sa.assertEquals(statusCode, 201);
	//			if ((statusCode==201||statusCode ==200) && result.toString() != "") {
	//				ReusableCode.test.info("Data got");
	//			} else {
	//				ReusableCode.test.info("Data not displayed");	
	//			}
	//			String id=getIDForAccount(result, accountNo);
	//			//deleting data with user id and Id
	//			
	//			JSONObject data1 =new JSONObject();
	//			data1.put("userid", ReusableCode.userid);
	//			data1.put("id", id);		
	//			System.out.println("data"+ data1);
	//			Response result1 =deleteAPI(url, data1);
	//			System.out.println("result"+ result1);
	//		}
	//		
	//		//test Case to logout data
	//		@Test(priority=6)
	//		public static void testLogOutAPI5() throws IOException {
	//			
	//			String baseURI = RestAssured.baseURI;
	//			String url=baseURI+ReusableCode.readFromPropertiesFile("login");
	//			int statusCode = loginAPI(url);
	//			sa.assertEquals(statusCode, 201);
	//			if (statusCode==201||statusCode ==200) {
	//				ReusableCode.test.info("App launched");
	//			} else {
	//				ReusableCode.test.info("Appnot launched");	
	//			}
	//		
	//			JSONArray dataArr = (JSONArray)(ReusableCode.getValueFromJson("data"));
	//			JSONObject data = (JSONObject) dataArr.get(0);
	//			
	//			String accountNo = (String)(data.get("accountno"));
	//		
	//			// GET validation
	//			url=baseURI+ReusableCode.readFromPropertiesFile("getdata");
	//			Response result = getAPI(url);
	//			statusCode = result.getStatusCode();
	//		
	//			sa.assertEquals(statusCode, 201);
	//			if ((statusCode==201||statusCode ==200) && result.toString() != "") {
	//				ReusableCode.test.info("Data got");
	//			} else {
	//				ReusableCode.test.info("Data not displayed");	
	//			}
	//
	//			JSONObject data1 = new JSONObject();
	//			data1.put("token",null);
	//			url=baseURI+ReusableCode.readFromPropertiesFile("logout");
	//			Response res = postAPI(url, data1);
	//			int retCode = res.getStatusCode();
	//			System.out.println("responsePOST="+res.asPrettyString());
	//			
	//			sa.assertEquals(retCode, 201);
	//			if (retCode==201||retCode ==200) {
	//				ReusableCode.test.info("Succeccfully logged out");
	//			} else {
	//				ReusableCode.test.info("Logoutfailed");	
	//			}
	//		}
}
