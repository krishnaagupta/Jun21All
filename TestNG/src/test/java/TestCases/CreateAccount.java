package TestCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToParentFrame;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.BaseTest;
import Listeners.ExtentTestManager;
import Listeners.TestListen;
import Pages.CreateAccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import Utils.CommonUtils;
@Listeners(TestListen.class)
public class CreateAccount extends BaseTest {
	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	CreateAccountPage cp;

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
		cp= new CreateAccountPage(driver);
	}
	@AfterMethod
	public void CloseReport() throws InterruptedException {
		//driver.close();
	}	

	//Select user menu for <username> drop down
	//@Test
	public  void tc10() throws InterruptedException, IOException {
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
		common.clickOn(driver, cp.accountClick, 2);
		System.out.println("alert0");
		Assert.assertTrue(driver.getTitle().equals(common.getApplicationproperity("accounthomepage")));

		if (driver.getTitle().contains(common.getApplicationproperity("accounthomepage"))) {
			ExtentTestManager.getTest().log(Status.INFO, "account home page");
			log.info("account home page seen ");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "account home page not shown");
			log.error("account home page not shown");

		}

		common.clickOn(driver, cp.noThanks, 2);
		System.out.println("no thanks clicked");
		common.clickOn(driver, cp.sendToSalesforce, 4);


		common.clickOn(driver, cp.newClick, 5);
		ExtentTestManager.getTest().log(Status.INFO, "new button clicked");
		log.info("new button clicked ");

		common.sendKeys(driver, cp.accountName, 4, "kk");
		Select select= new Select(cp.accounttype);
		String optionToselect="Technology Partner";
		select.selectByValue(optionToselect);
		String optionSelected=select.getFirstSelectedOption().getText();	
		Assert.assertEquals(optionToselect, optionSelected);

		Select select1= new Select(cp.customerpriority);
		String optionToselect1="High";
		select1.selectByValue(optionToselect1);
		String optionSelected1=select1.getFirstSelectedOption().getText();
		Assert.assertEquals(optionToselect1, optionSelected1);

		common.clickOn(driver, cp.saveClick, 5);


	}
	//@Test
	public  void tc11() throws InterruptedException, IOException {
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
		common.clickOn(driver, cp.accountClick, 2);
		System.out.println("alert0");
		Assert.assertTrue(driver.getTitle().equals(common.getApplicationproperity("accounthomepage")));

		if (driver.getTitle().contains(common.getApplicationproperity("accounthomepage"))) {
			ExtentTestManager.getTest().log(Status.INFO, "account home page");
			log.info("account home page seen ");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "account home page not shown");
			log.error("account home page not shown");

		}

		common.clickOn(driver, cp.noThanks, 2);

		common.clickOn(driver, cp.sendToSalesforce, 4);

		common.clickOn(driver, cp.createNewView, 4);
		System.out.println("tittle"+ driver.getTitle());
		//Assert.assertTrue(driver.getTitle().equals(" Create New View ~ Salesforce - Developer Edition"));
		String view="jj8";
		String uniqueview="jj9";
		common.sendKeys(driver, cp.viewName, 3, view);
		common.sendKeys(driver, cp.viewUniquename, 3,uniqueview);
		common.clickOn(driver, cp.clickSave, 5);
		common.waiting(driver, cp.savedview, 3);
		System.out.println("save clicked");
		Select select =new Select(cp.savedview);
		String addedview=select.getFirstSelectedOption().getText();
		Assert.assertEquals(view, addedview);
		ExtentTestManager.getTest().log(Status.PASS, "View saved Test11 pass");
		log.info("View saved Test 11 pass ");
	}
	//@Test
	public  void tc12() throws InterruptedException, IOException {
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
		common.clickOn(driver, cp.accountClick, 2);
		System.out.println("alert0");
		Assert.assertTrue(driver.getTitle().equals(common.getApplicationproperity("accounthomepage")));

		if (driver.getTitle().contains(common.getApplicationproperity("accounthomepage"))) {
			ExtentTestManager.getTest().log(Status.INFO, "account home page");
			log.info("account home page seen ");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "account home page not shown");
			log.error("account home page not shown");

		}

		common.clickOn(driver, cp.noThanks, 2);

		common.clickOn(driver, cp.sendToSalesforce, 4);

		common.clickOn(driver, cp.editClick, 4);

		String view="k9";
		String uniqueview="kk11";
		common.sendKeys(driver, cp.viewName, 3, view);
		common.sendKeys(driver, cp.viewUniquename, 3,uniqueview);
		//common.clickOn(driver, cp.clickSave, 5);
		//WebElement ele= driver.findElement(By.xpath("//*[@id=\"fcol1\"]/option[2]"));
		//	common.clickOn(driver, ele, 5);
		//common.waiting(driver, cp.accountName1, 3);
		Thread.sleep(3000);

		Select select= new Select(cp.accountName1);
		String Selectvalue="ACCOUNT.NAME";
		select.selectByValue(Selectvalue);
		//select.selectByVisibleText("Account name");
		String Selectedvalue=select.getFirstSelectedOption().getText();
		System.out.println("text-->"+Selectedvalue);
		Assert.assertEquals("Account Name", Selectedvalue);
		ExtentTestManager.getTest().log(Status.INFO, "Account name selected");
		System.out.println("Account name selected ");



		Select select1= new Select(cp.opertaor);
		String Selectvalue1="c";
		select1.selectByValue(Selectvalue1);
		String Selectedvalue1=select1.getFirstSelectedOption().getText();
		Assert.assertEquals("contains", Selectedvalue1);
		ExtentTestManager.getTest().log(Status.INFO, "operator selected");
		log.info("operator selected ");

		String value="a";
		common.sendKeys(driver, cp.value, 0, value);
		Assert.assertEquals(value, cp.value.getAttribute("value"));
		ExtentTestManager.getTest().log(Status.INFO, "value added");
		log.info("Value added ");

		common.clickOn(driver, cp.save1, 2);



		//		@FindBy(xpath="//*[@id=\"00B5f000005ea7y_listSelect\"]")
		//		public  WebElement savedview;


	}
	//@Test
	public  void tc13() throws InterruptedException, IOException {	
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
		common.clickOn(driver, cp.accountClick, 2);
		Assert.assertTrue(driver.getTitle().equals(common.getApplicationproperity("accounthomepage")));

		if (driver.getTitle().contains(common.getApplicationproperity("accounthomepage"))) {
			ExtentTestManager.getTest().log(Status.INFO, "account home page");
			log.info("account home page seen ");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "account home page not shown");
			log.error("account home page not shown");

		}
		common.clickOn(driver, cp.noThanks, 2);

		common.clickOn(driver, cp.sendToSalesforce, 4);
		WebElement ele1= driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a"));
		ele1.click();
		//*[@id="toolsContent"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a
		//common.clickOn(driver, cp.mergeAccount, 10);
		//System.out.println("merge click");
		//common.sendKeys(driver, cp.findAcctTest, 2, "vg");
		
		common.waiting(driver, cp.findAcctTest, 10);
		cp.findAcctTest.sendKeys("kk");
		
		common.clickOn(driver, cp.findAcctSubmit, 2);
		// code to check if a an element is clicked
//		public static boolean isClicked(WebElement element)
//		{ 
//		    try {
//		        WebDriverWait wait = new WebDriverWait(yourWebDriver, 5);
//		        wait.until(ExpectedConditions.elementToBeClickable(element));
//		        element.click();
//		        return true;
//		    } catch(Exception e){
//		        return false;
//		    }
//		}
		
		//if cp.datarRow1.
		//common.clickOn(driver, cp.datarRow1, 2);
		//common.clickOn(driver, cp.datarRow2, 2);
		common.clickOn(driver, cp.nextSubmit1, 2);
		Thread.sleep(4000);
		common.clickOn(driver, cp.mergeSubmit, 2);
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		driver.switchTo().parentFrame();
	}
	
	@Test
	public  void tc14() throws InterruptedException, IOException {	
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
		common.clickOn(driver, cp.accountClick, 2);
		System.out.println("alert0");
		Assert.assertTrue(driver.getTitle().equals(common.getApplicationproperity("accounthomepage")));

		if (driver.getTitle().contains(common.getApplicationproperity("accounthomepage"))) {
			ExtentTestManager.getTest().log(Status.INFO, "account home page");
			log.info("account home page seen ");
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "account home page not shown");
			log.error("account home page not shown");

		}
		common.clickOn(driver, cp.noThanks, 2);
		common.clickOn(driver, cp.sendToSalesforce, 4);
		
		common.clickOn(driver, cp.AccountreportClick, 4);
		

		WebElement ele1= driver.findElement(By.xpath( " //*[@id=\"ext-gen148\"]"));
		ele1.click();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementsByClassName("x-combo-list-item").click()");
		common.clickOn(driver, cp.createdatedropdown, 7);
		 //cp.createdatedropdown.click();
		//Thread.sleep(3000);
		 common.clickOn(driver, cp.fromDate, 4);
		common.clickOn(driver, cp.fromtodayDate, 4);
		common.clickOn(driver, cp.toDate, 4);
		common.clickOn(driver, cp.today_Date, 4);
		common.clickOn(driver,cp.saveButton, 4);
		String parentWindowHandle = driver.getWindowHandle();
		common.sendKeys(driver, cp.reportName, 3, "3");
		common.sendKeys(driver, cp.reportUniqueName, 3, "4");
		common.clickOn(driver, cp.saveandrunBtn, 9);
		//driver.switchTo().window(parentWindowHandle);
		
		//ExtentTestManager.getTest().addScreenCaptureFromPath(common.takeScreenshot());
	}
	@Test
	public  void tc15() throws InterruptedException, IOException {	
	
	}
	
}

