package TestCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Listeners.ExtentTestManager;
import Listeners.TestListen;
import Pages.HomePage;
import Pages.LoginPage;
import Utils.CommonUtils;
@Listeners(TestListen.class)
public class Home extends Base.BaseTest {
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
		//driver.close();
	}	

	//Select user menu for <username> drop down
	//@Test
	public  void tc5() throws InterruptedException, IOException {

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

		common.clickOn(driver, hp.usernavi,3);
		ExtentTestManager.getTest().log(Status.INFO, "User Dropdown clicked");
		log.info("User Dropdown clicked ");



		//WebElements list= driver.findElements(By.xpath(""));
		String text= hp.usernavi.getText();
		String text2= common.getApplicationproperity("myuserNavLabel")+"\n"
				+ common.getApplicationproperity("myprofile")+"\n"
				+ common.getApplicationproperity("mysetting")+"\n"
				+ common.getApplicationproperity("mydeveloperconsole")+"\n"
				+ common.getApplicationproperity("myswitchh")+"\n"
				+ common.getApplicationproperity("mylogout");

		System.out.println("webtext"+text);
		System.out.println("text1"+text2);


		if (text.equals(text2)){
			ExtentTestManager.getTest().log(Status.PASS, "DropDown Items Matching");
			log.error("DropDown Items Matching ");

		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "DropDown Items  not Matching");
			log.error("DropDown Items not Matching ");

		}
		Assert.assertEquals(text, text2);
	}

	//@Test
	// text case 9 --logout Select "Logout" option from user menu for <username> drop down
	public  void tc9() throws InterruptedException, IOException {
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

		common.clickOn(driver, hp.usernavi,3);
		ExtentTestManager.getTest().log(Status.INFO, "User Dropdown clicked");
		log.info("User Dropdown clicked ");

		common.clickOn(driver, hp.logOut,3);
		ExtentTestManager.getTest().log(Status.INFO, "logout clicked");
		log.info("Logout Clicked");

		if (driver.getTitle().contains(common.getApplicationproperity("logout.page"))) {
			ExtentTestManager.getTest().log(Status.INFO, "Test passed sales force page displayed");
			log.info("Test passed sales force page displayed ");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "Test passed sales force page  not displayed");
			log.error("Test passed sales force page displayed ");

		}
		Assert.assertTrue(driver.getCurrentUrl().contains(common.getApplicationproperity("logout.page")));
	}
	//@Test
	//Select "Developers Console" option from user menu for <username> drop down
	public  void tc8() throws InterruptedException, IOException {
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

		common.clickOn(driver, hp.usernavi,3);
		ExtentTestManager.getTest().log(Status.INFO, "User Dropdown clicked");
		log.info("User Dropdown clicked ");

		String parent=driver.getWindowHandle();

		common.clickOn(driver, hp.developerconsole,3);
		ExtentTestManager.getTest().log(Status.INFO, "Developer console clicked");
		log.info("Developer console clicked ");
		System.out.println("developerconsole"+driver.getTitle());

		if (driver.getTitle().contains(common.getApplicationproperity("developerconsoleHome"))) {
			ExtentTestManager.getTest().log(Status.INFO, "developer console Home page displayed");
			log.info("developer console Home page displayed");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "developer console Home page  not displayed");
			log.error("developer console Home page  not displayed");

		}
		Assert.assertTrue(driver.getTitle().contains(common.getApplicationproperity("developerconsoleHome")));

		String parentWindowHandle = driver.getWindowHandle();
		String popupWindowHandler = null;
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
			popupWindowHandler = iterator.next();
		}
		System.out.println("opo"+popupWindowHandler);
		driver.switchTo().window(popupWindowHandler);
		driver.close();
		driver.switchTo().window(parentWindowHandle);

		lp.logout();


	}
	//tc-7-Select "My settings" option from user menu for <username> drop down// calling tc 5
	@Test
	public  void tc7() throws InterruptedException, IOException {
		tc5();
		common.clickOn(driver, hp.setting, 2);
		ExtentTestManager.getTest().log(Status.INFO, "MySetting displayed");
		log.info("MySetting displayed");

		if (driver.getCurrentUrl().contains(common.getApplicationproperity("setup"))) {
			ExtentTestManager.getTest().log(Status.INFO, "set up page displayed");
			log.info("set up page displayed");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "set up page not displayed");
			log.error("set up page not displayed");

		}
		Assert.assertTrue(driver.getCurrentUrl().contains(common.getApplicationproperity("setup")));

		common.clickOn(driver, hp.personalSetting, 2);
		common.clickOn(driver, hp.logInHistroy, 2);
		ExtentTestManager.getTest().log(Status.INFO, "Personal link login histroy clicked");
		log.info("Personal link login histroy clicked");

		common.clickOn(driver, hp.displaylayout, 2);
		common.clickOn(driver, hp.customizeTab, 2);
		common.clickOn(driver, hp.customization, 2);
		
		Select select= new Select(hp.customization);
		select.selectByIndex(8);
		String text=select.getFirstSelectedOption().getText();

		if (text.equals(common.getApplicationproperity("selectoption"))) {
			ExtentTestManager.getTest().log(Status.INFO, "Right option selected");
			log.info("Right option selected");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "Right option not selected");
			log.error("Right option  not selected");

		}
		Assert.assertEquals(text, common.getApplicationproperity("selectoption"));
		
		Select select1= new Select(hp.selectReports);
		select.selectByValue("report");
		String text1=select.getFirstSelectedOption().getText();
		System.out.println("val"+ text1);

	}
}
