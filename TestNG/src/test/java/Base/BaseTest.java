package Base;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static Logger log =Logger.getLogger(BasePage.class);

	private WebDriver driver;
	
	@BeforeSuite
	public static void beforeSuite() {

		DOMConfigurator.configure("/Users/krishnaagupta/eclipse-workspace/repos/Jun21All/TestNG/src/test/java/log4j.xml");
		log.info("Test end");
	}

	@AfterSuite
	public  static void afterSuite() {
		log.info("Test end");
	}
	public WebDriver getDriver() {

		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		return driver;

	}
}
