package RUtils;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;

//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Reuse {
	public static Response response;
	public static String token, id, userid;
	public static int statusCode;
	public static String  sReportTime;
	public static ExtentReports extent=null; 
	public static ExtentHtmlReporter htmlReporter=null;
	public static ExtentTest test=null;
	//public static JSONObject jsonObject;
	
	public static void initialiseReport() {
		sReportTime=new SimpleDateFormat("yyyymmddhhmm").format(new Date());
		extent=new ExtentReports();
		htmlReporter=new ExtentHtmlReporter("target"+"//"+sReportTime+".html");
		extent.attachReporter(htmlReporter);
	}
	
	public static void login (String endPoint, String contentType,String bodyJson1) {
	
		//System.out.println("login="+getValueFromJson("login"));
		//"username": "krishnaa.gupta@gmail.com",
	     // "password": "krishnaa123"
		//Response res=RestAssured.given().contentType(contentType).body(getValueFromJson(bodyJson1)).post();
		Response res=RestAssured.given().contentType(contentType).body("{\"password\": \"krishnaa123\",\"username\": \"krishnaa.gupta@gmail.com\"}").post();
		System.out.println("response="+res.asPrettyString());
		System.out.println("status code="+statusCode);
		statusCode= res.getStatusCode();
		if (statusCode ==200 ||statusCode==201) {
			HashMap<String, Object> maps = res.jsonPath().get("[0]");
		     token = maps.get("token").toString();
		     userid = maps.get("userid").toString();
		}
		      statusCode= res.getStatusCode();
	     
	 }
	/*public static void loginWrong (String endPoint, String contentType,  String bodyjason) {
		String bodyjason="loginWrong";
		//System.out.println("login="+getValueFromJson("login"));
		Response res=RestAssured.given().contentType(contentType).body(getValueFromJson(bodyjason)).post();
		System.out.println("response="+res.asPrettyString());
		HashMap<String, Object> maps = res.jsonPath().get("[0]");
	     token = maps.get("token").toString();
	     userid = maps.get("userid").toString();
	     statusCode= res.getStatusCode();
	 }*/
	 public  static String readFromPropertiesFile(String keyword) throws IOException {
	     Properties properties = new Properties();
	     FileInputStream fls = new FileInputStream("/Users/krishnaagupta/eclipse-workspace/repos/Jun21All/RestAssuredAug21/src/test/java/Config/Endpoints.properties");
	     properties.load(fls);
	     return properties.getProperty(keyword);
	 }	
	 
	/* public static void jsonSetup() throws IOException, ParseException {
		 FileReader reader = new FileReader("src/test/resources/data.json"); 
		 JSONParser jsonParser = new JSONParser();
		 jsonObject = (JSONObject)(jsonParser.parse(reader));
	 }
	 
	
	 public static Object getValueFromJson(String key) {
		return jsonObject.get(key);
	 }*/
	 
	 
	    



}
