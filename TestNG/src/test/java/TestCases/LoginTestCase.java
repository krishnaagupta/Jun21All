package TestCases;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;

import Base.BaseTest;
import Pages.LoginPage;
import Utils.CommonUtils;
// All log in realated test cases testcases  
public class LoginTestCase extends BaseTest{
	public static Logger log =Logger.getLogger(LoginTestCase.class);


	WebDriver driver;
	LoginPage lp;
	
	CommonUtils common=new CommonUtils();

	
	@BeforeMethod
	public void beforeTest() throws IOException {
		driver =getDriver();
		//test = extent.createTest("Tc1");
		String url=common.getApplicationproperity("url");
		System.out.println("url--"+ url);
		driver.get(url);
		lp =new LoginPage(driver);
	}
	
	
	@Test
	public  void tc1login() throws InterruptedException, IOException {
		String username= common.getApplicationproperity("username");
		String password= common.getApplicationproperity("password");
		lp.logintoSFDC(username, password);
		String usernamegettext=lp.userName.getText();
		//Assert.assertEquals(username, usernamegettext);
		
		System.out.println("user text "+usernamegettext);
		log.info("test 1");
		log.debug("hello");
		//test.info("tc1");
	}
}
