package Base;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import common.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.*;

//@Listeners(common.Listeners.class)
public class Login  {


	//System.setProperty("webdriver.chrome.driver", "/Users/krishnaagupta/Downloads/chromedriver 3");
	//public static ExtentTest test;
	//Logger log= Logger.getLogger(getClass().getSimpleName());

	public static ExtentReports reports ;
	public static  ExtentTest logger;
	public static ExtentHtmlReporter htmlReporter=null;
	public static String  sReportTime;
	public static WebDriver driver=null;
	public static ExtentReports extent=null; 



	public static void initilizeReports() {// extent report step 1

		sReportTime=new SimpleDateFormat("yyyymmddhhmm").format(new Date());
		extent=new ExtentReports();
		//htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/reports"+sReportTime+".html");// system.getproperity ("user dir ") gives current project dir
		htmlReporter=new ExtentHtmlReporter("reports"+"/reports"+sReportTime+".html");// "reports is the folder in current project dir"
		extent.attachReporter(htmlReporter);

	}
	@BeforeTest
	public void setup() {
		initilizeReports();
	}
	//@BeforeMethod
	/*public void CreateReport(Method sTestMethod) {
		test = extent.createTest(sTestMethod.getName());
	}*/
	//@AfterTest
	//public void tearDown() {
	//	extent.flush();
	//}
	@Test()
	
	public static void test1() throws InterruptedException, IOException
	{

		ExtentTest test= extent.createTest("Test1","login test");

		WebDriverManager.chromedriver().setup();
		Logger log= Logger.getLogger("Login");
		driver =new ChromeDriver();
		driver.get("https://login.xero.com/identity/user/login");

		log4jproperities();
		log.info("hi started");
		log.info("started");
		


		WebElement userName= driver.findElement(By.xpath("//*[@id=\"xl-form-email\"]"));
		userName.clear();
		userName.sendKeys("krishnaa.gupta@yahoo.com");



		WebElement pwd= driver.findElement(By.xpath("//*[@id=\"xl-form-password\"]"));
		WebDriverWait wait=new WebDriverWait (driver,30);
		wait.until(ExpectedConditions.visibilityOf(pwd));
		pwd.clear();
		pwd.sendKeys("two2three3");

		String actual=pwd.getAttribute("value");// very important line  .. gettelt will not woek here .. so use get attribute("value")

		System.out.println("Actual"+actual);
		String expected ="two2three3";

		// First - set the wait parameters
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS) // set the timeout
				.pollingEvery(5, TimeUnit.SECONDS) // set the interval between every 2 tries     .ignoring(NoSuchElementException.class); // don't throw this exception
				// Then - declare the webElement and use a function to find it
				.ignoring(NoSuchElementException.class);
		WebElement	lonIn = wait1.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@id=\"xl-form-submit\"]"));
			}
		});


		lonIn.submit();
		Reporter.log("This the report which will report in test out /index.html ");// open the index.html in testoutput folder and click on report out put to see ur logs 
		// so Report log is seperate from log4j or extent rreport it it to lag info in the default Test NG reports 
		//https://www.youtube.com/watch?v=7w-fDuUQv20  -->	you tuble link
		test.addScreenCaptureFromPath(Utils.getScreenShot());
		test.info(" login clicked");
		extent.flush();
	}
	public static void log4jproperities() throws IOException {
		Properties prop= new Properties();
		FileInputStream fileln= new FileInputStream(System.getProperty("user.dir")+"/resources/log4j.properities");
		prop.load(fileln);
		PropertyConfigurator.configure(prop);
	}
}
