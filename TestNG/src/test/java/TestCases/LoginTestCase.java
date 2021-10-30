package TestCases;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Listeners.ExtentTestManager;
import Listeners.TestListen;

import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Utils.CommonUtils;
// All log in realated test cases testcases  


@Listeners(TestListen.class)	
public class LoginTestCase extends BaseTest{
	public static Logger log =Logger.getLogger(LoginTestCase.class);


	WebDriver driver;
	LoginPage lp;
	HomePage hp;

	CommonUtils common=new CommonUtils();


	@BeforeMethod
	public void beforeTest() throws IOException {
		driver =getDriver();
		//test = extent.createTest("Tc1");
		String url=common.getApplicationproperity("url");
		System.out.println("url--"+ url);
		driver.get(url);
		lp =new LoginPage(driver);
		hp =new HomePage(driver);
	}
	@AfterMethod
	public void CloseReport() throws InterruptedException {
		driver.close();
	}

	//Login To SalesForce -2 -with valid details
	@Test (priority=1)
	public  void tc2login() throws InterruptedException, IOException {

		String username= common.getApplicationproperity("username");
		String password= common.getApplicationproperity("password");
		ExtentTestManager.getTest().log(Status.INFO, "login --username,pwd entered");
		lp.logintoSFDC(username, password);

		if (driver.getCurrentUrl().contains(common.getApplicationproperity("Salesforce.HomePage"))) {
			ExtentTestManager.getTest().log(Status.INFO, "test passed");
			log.info("The login is successfull and URl is right ");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "URL not matching");
			log.error("The login is unsuccessfull and URl is not right ");

		}
		Assert.assertTrue(driver.getCurrentUrl().contains(common.getApplicationproperity("Salesforce.HomePage")));
		//ExtentTestManager.getTest().log(Status.INFO, "test passed");
	

	}
	@Test (priority=2)
	//Login To SalesForce -1-Login Error Message - 1
	public  void tc1login() throws InterruptedException, IOException {
		String username= common.getApplicationproperity("username");
		String password= "";
		ExtentTestManager.getTest().log(Status.INFO, "login --username,pwd entered");
		lp.logintoSFDC(username, password);

		System.out.println("err-->"+lp.errorMsg.getText());
		Assert.assertEquals(lp.errorMsg.getText(), common.getApplicationproperity("loginerrormsg"));

		if (lp.errorMsg.getText().equals(common.getApplicationproperity("loginerrormsg"))) {
			ExtentTestManager.getTest().log(Status.INFO, "Error message is correct");
			log.info("Error message is correct ");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "Error message is Wrong");
			
			log.error("Error message is Wrong ");

		}
	}

	// Test case -3 Test the remember username check box
	@Test (priority=3)
	public  void tc3login() throws InterruptedException, IOException {
		String username= common.getApplicationproperity("username");
		String password= common.getApplicationproperity("password");
		
		CommonUtils.sendKeys(driver,lp.userName ,5,username);
		CommonUtils.sendKeys(driver,lp.password ,5,password);
		ExtentTestManager.getTest().log(Status.INFO, "login --username,pwd entered");
		log.info("Username Password entered");

		CommonUtils.clickOn(driver,lp.rememberMe, 2);
		ExtentTestManager.getTest().log(Status.INFO, "Remember me is checked");
		log.info("Remember me is checked");

		CommonUtils.clickOn(driver,lp.login, 2);
		ExtentTestManager.getTest().log(Status.INFO, "login clicked");
		log.info("login clicked");
		System.out.println("home page->"+driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().contains(common.getApplicationproperity("Salesforce.HomePage")));

		if (driver.getCurrentUrl().contains(common.getApplicationproperity("Salesforce.HomePage"))) {
			ExtentTestManager.getTest().log(Status.INFO, "home page shown");
			log.info("The login is successfull and URl is right ");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "URL not matching");
			
			log.error("The login is unsuccessfull and URl is not right ");

		}

		CommonUtils.clickOn(driver,hp.usernavi, 5);
		CommonUtils.clickOn(driver,hp.logOut, 5);
		ExtentTestManager.getTest().log(Status.INFO, "logout clicked");
		log.info("logout clicked");
		Thread.sleep(2000);

		if (driver.getCurrentUrl().contains(common.getApplicationproperity("url"))) {
			ExtentTestManager.getTest().log(Status.INFO, "login page displayed");
			log.info("  log in URl is right ");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "URL not matching");
			log.error("login  URl is not right ");

		}
		// Assert the login page and user name
		Assert.assertTrue(driver.getCurrentUrl().contains(common.getApplicationproperity("Salesforce.HomePage")));

		Assert.assertEquals(lp.userName.getAttribute("value"), username);
		if (lp.userName.getAttribute("value").equals(username)) {
			ExtentTestManager.getTest().log(Status.INFO, "User name displayed and test is pass");
			log.info("User name displayed and test is pass ");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "User name is not displayed and test is fail");
			log.error("User name is not displayed and test is fail ");

		}
	}
@Test (priority=4)
	// test case 4a-Forgot Password- 4 A
	public  void tc4alogin() throws InterruptedException, IOException {
		CommonUtils.clickOn(driver,lp.forgotPassword, 2);
		ExtentTestManager.getTest().log(Status.INFO, "Forgot password clicked");
		log.info("Forgot password clicked ");
		//assert forgot password page
		//System.out.println("forgot pwd ->"+driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals(common.getApplicationproperity("forgotpassword.page")));

		if (driver.getTitle().equals(common.getApplicationproperity("forgotpassword.page"))) {
			ExtentTestManager.getTest().log(Status.INFO, "forgot password page is displayed");
			log.info(" forgot password page is displayed ");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "forgot password page is not  displayed");
			log.error("forgot password page is not  displayed ");

		}
		
		String username= common.getApplicationproperity("username");
		System.out.println("user name"+username);
		CommonUtils.sendKeys(driver,lp.email ,7,username);
		ExtentTestManager.getTest().log(Status.INFO, "login --username,entered");
		log.info("Username  entered");
		
		
		CommonUtils.clickOn(driver,lp.continueButton, 2);
		ExtentTestManager.getTest().log(Status.INFO, "continueButton clicked");
		log.info("continueButton clicked");
		
		if (driver.getCurrentUrl().contains(common.getApplicationproperity("email.page"))) {
			ExtentTestManager.getTest().log(Status.INFO, "Email sent");
			log.info("  email sent ");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "email not sent");
			log.error("email not sent ");

		}
		// Assert the login page and user name
		Assert.assertTrue(driver.getTitle().contains(common.getApplicationproperity("email.page")));

	}
	
	// tc-4b Forgot Password- 4 B
	@Test (priority=5)
	public  void tc4blogin() throws InterruptedException, IOException {
		String username= common.getApplicationproperity("wrongUser");
		String password= common.getApplicationproperity("wrongpwd");
		CommonUtils.sendKeys(driver,lp.userName ,5,username);
		CommonUtils.sendKeys(driver,lp.password ,5,password);
		ExtentTestManager.getTest().log(Status.INFO, "login --wrong username, wrong pwd entered");
		log.info(" wrong Username Password entered");


		CommonUtils.clickOn(driver,lp.login, 2);
		ExtentTestManager.getTest().log(Status.INFO, "login clicked");
		log.info("login clicked");
		
		String errorMsg=lp.errorMsg.getText();
		System.out.println("error--."+errorMsg);
		Assert.assertEquals(errorMsg, common.getApplicationproperity("errormsgtxt"));
		
		
	}
	
}
