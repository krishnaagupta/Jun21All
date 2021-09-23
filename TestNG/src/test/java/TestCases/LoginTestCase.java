package TestCases;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;

import Base.BaseTest;
import Pages.LoginPage;
import Utils.CommonUtils;

public class LoginTestCase extends BaseTest{
	public static Logger log =Logger.getLogger(LoginTestCase.class);


	WebDriver driver;
	LoginPage lp=new LoginPage(driver);
	CommonUtils common=new CommonUtils();

	
	@BeforeMethod
	public void beforeTest() throws IOException {
		driver =getDriver();
		String url=common.getApplicationproperity("url1");
		System.out.println("url--"+ url);
		driver.get(url);

	}
	
	
	@Test
	public static void tc1login() {
		System.out.println("hi");
		log.info("test 1");
		log.debug("hello");
	}
}
