package Base;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static Logger log =Logger.getLogger(BasePage.class);

	public static WebDriver driver;
	/*public static String  sReportTime;
	public static ExtentReports extent=null; 
	public static ExtentHtmlReporter htmlReporter=null;
	public static ExtentTest test=null;*/
	@BeforeSuite
	public static void beforeSuite() {

		DOMConfigurator.configure("/Users/krishnaagupta/eclipse-workspace/repos/Jun21All/TestNG/src/test/java/log4j.xml");
		log.info("Test Start");
	}
/*	@BeforeTest
	public void setup() {
		Initializereports();
	}

	@AfterMethod
	@AfterTest
	public void tearDown() {
		extent.flush();
	}	*/


	/*public static void Initializereports() {
		sReportTime=new SimpleDateFormat("yyyymmddhhmm").format(new Date());
		extent=new ExtentReports();
		htmlReporter=new ExtentHtmlReporter(Utils.AppConstants.EXTENT_HTML_REPORT_PATH1+File.separator+sReportTime+".html");
		//System.out.println("reports-->"+Utils.AppConstants.EXTENT_HTML_REPORT_PATH1+File.separator);
		htmlReporter.config().setReportName("Salesforce Report");
		htmlReporter.config().setDocumentTitle("Automation report");
		extent.attachReporter(htmlReporter);
	}*/
	@AfterSuite
	public  static void afterSuite() {
		//log.info("Test end");
		
	}
	public WebDriver getDriver() {

		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		return driver;

	}
}
