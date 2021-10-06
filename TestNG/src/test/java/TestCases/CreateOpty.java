package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
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
import Pages.CreateOptyPage;
import Pages.HomePage;
import Pages.LoginPage;
import Utils.CommonUtils;
@Listeners(TestListen.class)
public class CreateOpty extends BaseTest {

	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	CreateAccountPage cp;
	CreateOptyPage co;

	CommonUtils common=new CommonUtils();


	@BeforeMethod
	public void beforeTest() throws IOException, InterruptedException {
		driver =getDriver();
		//test = extent.createTest("Tc1");
		String url=common.getApplicationproperity("url");
		System.out.println("url--"+ url);
		driver.get(url);
		lp =new LoginPage(driver);
		hp =new HomePage(driver);
		cp= new CreateAccountPage(driver);
		co= new CreateOptyPage(driver);

		String username= common.getApplicationproperity("username");
		String password= common.getApplicationproperity("password");
		//ExtentTestManager.getTest().log(Status.INFO, "login --username,pwd entered");
		lp.logintoSFDC(username, password);


	}
	@AfterMethod
	public void CloseReport() throws InterruptedException {
		driver.close();
	}	

	//Select user menu for <username> drop down

	//@Test
	public  void tc15() throws InterruptedException, IOException {	


		common.clickOn(driver, co.OpportunityTab, 4);
		System.out.println("tittle"+ driver.getTitle());
		common.clickOn(driver, cp.noThanks, 2);
		common.clickOn(driver, cp.sendToSalesforce, 4);

		String str1=driver.getTitle();

		String display1="Oppoturnity screen  displayed";
		String display2="Oppoturnity screen not displayed";
		common.myassertequal(str1, common.getApplicationproperity("oppoturnityexpectedtittle"), display1, display2);

		String text= co.oppoturnityDropDown.getText();
		//System.out.println("drop down"+ text);
		String text2= common.getApplicationproperity("mydropdown")+"\n"
				+ common.getApplicationproperity("myclosing")+"\n"
				+ common.getApplicationproperity("myclosingthismonth")+"\n"
				+ common.getApplicationproperity("myopty")+"\n"
				+ common.getApplicationproperity("mynew")+"\n"
				+ common.getApplicationproperity("mynew1")+"\n"
				+ common.getApplicationproperity("myoptypipeline")+"\n"
				+ common.getApplicationproperity("myprivate")+"\n"
				+ common.getApplicationproperity("myrecent")+"\n"
				+common.getApplicationproperity("mywon");

		display1="The oppoturnity dropdown displayed correctly";
		display2="The oppoturnity not dropdown displayed correctly";

		common.myassertequal(text, text2, display1, display2);
	}
	
	//@Test
	public  void tc16() throws InterruptedException, IOException {	
		common.clickOn(driver, co.OpportunityTab, 4);
		System.out.println("tittle"+ driver.getTitle());
		common.clickOn(driver, cp.noThanks, 2);
		common.clickOn(driver, cp.sendToSalesforce, 4);

		String str1=driver.getTitle();

		String display1="Oppoturnity screen  displayed";
		String display2="Oppoturnity screen not displayed";
		common.myassertequal(str1, common.getApplicationproperity("oppoturnityexpectedtittle"), display1, display2);
		
		common.clickOn(driver, cp.newClick, 4);
		
		 str1=driver.getTitle();

		 display1="Oppoturnity edit screen  displayed";
		 display2="Oppoturnity edit screen not displayed";
		common.myassertequal(str1, common.getApplicationproperity("oppoturnityedittittle"), display1, display2);
		
		common.sendKeys(driver, co.oppoturnityName, 2, "kk");
		
		common.sendKeys(driver, co.accountName, 2, "kkr");
		
		common.sendKeys(driver, co.Probability, 2, "35");
		
		common.waiting(driver, co.closingDate, 3);
		common.clickOn(driver, co.closingDate, 4);
		
		Select select1=new Select(co.calmonthpicker);
		select1.selectByValue("10");
		
		Select select2=new Select(co.calyearpicker);
		select2.selectByValue("2021");
		
		common.clickOn(driver, co.datepicked, 0);
		
		
		
		Select select3=new Select(co.leadSource);
		select3.selectByIndex(2);
		
		
		common.sendKeys(driver, co.primarycampainsource, 2, "yy");
		
		common.clickOn(driver, co.saveButton, 0);
		

	}
	//@Test
	public  void tc17() throws InterruptedException, IOException {	
		
		common.clickOn(driver, co.OpportunityTab, 4);
		System.out.println("tittle"+ driver.getTitle());
		common.clickOn(driver, cp.noThanks, 2);
		common.clickOn(driver, cp.sendToSalesforce, 4);

		String str1=driver.getTitle();

		String display1="Oppoturnity screen  displayed";
		String display2="Oppoturnity screen not displayed";
		common.myassertequal(str1, common.getApplicationproperity("oppoturnityexpectedtittle"), display1, display2);
		
		common.clickOn(driver, co.oppoturnityPipeline, 4);
		 

		 display1="Oppoturnity pipeline screen  displayed";
		 display2="Oppoturnity pipeline screen not displayed";
		common.myassertcontains( driver.getTitle(), common.getApplicationproperity("oppoturnitypipeline"), display1, display2);
		
	}
	
	//@Test
		public  void tc18() throws InterruptedException, IOException {	
		
		common.clickOn(driver, co.OpportunityTab, 4);
		System.out.println("tittle"+ driver.getTitle());
		common.clickOn(driver, cp.noThanks, 2);
		common.clickOn(driver, cp.sendToSalesforce, 4);

		String str1=driver.getTitle();

		String display1="Oppoturnity screen  displayed";
		String display2="Oppoturnity screen not displayed";
		common.myassertequal(str1, common.getApplicationproperity("oppoturnityexpectedtittle"), display1, display2);
		
		common.clickOn(driver, co.oppoturnitystuck, 4);
		
		//stuckoppoturnity;

		 display1="Stuck Oppoturnity screen  displayed";
		 display2="Stuck Oppoturnity screen not displayed";
		 System.out.println("tittle"+ driver.getTitle());
		 System.out.println("tittle1"+ common.getApplicationproperity("oppoturnityexpectedtittle"));
		common.myassertequal(driver.getTitle(), common.getApplicationproperity("stuckoppoturnity"), display1, display2);
	}
	
	@Test
	public  void tc19() throws InterruptedException, IOException {	
		common.clickOn(driver, co.OpportunityTab, 4);
		System.out.println("tittle"+ driver.getTitle());
		common.clickOn(driver, cp.noThanks, 2);
		common.clickOn(driver, cp.sendToSalesforce, 4);

		String str1=driver.getTitle();

		String display1="Oppoturnity screen  displayed";
		String display2="Oppoturnity screen not displayed";
		common.myassertequal(str1, common.getApplicationproperity("oppoturnityexpectedtittle"), display1, display2);
		
		Select select=new Select(co.quaterlySummeryInterval);
		select.selectByValue("next1");
		String quaterlySummeryInterval =select.getFirstSelectedOption().getText();
		
		Select select1=new Select(co.quaterlySummeryInclude);
		select1.selectByValue("closed");
		String quaterlySummeryInclude =select1.getFirstSelectedOption().getText();
		
		common.clickOn(driver, co.runOn, 4);
		
		
		Select select3=new Select(co.quaterlySummeryInterval);
		//select.selectByValue("next1");
		String reportquaterlySummeryInterval =select3.getFirstSelectedOption().getText();
		
		Select select4=new Select(co.quaterlySummeryInclude);
		String reportquaterlySummeryInclude =select4.getFirstSelectedOption().getText();
		
		
		display1="Opportunity Report displayed";
		display2="Opportunity Report  not displayed";
		common.myassertequal(driver.getTitle(),common.getApplicationproperity("oppoturnityreport"),display1,display2);
		
		display1="quaterlySummeryInterval displayed";
		display2="quaterlySummeryInterval  not displayed";
		common.myassertcontains(quaterlySummeryInterval, reportquaterlySummeryInterval, display1, display2);
		
		display1="reportquaterlySummeryInclude displayed";
		display2="reportquaterlySummeryInclude  not displayed";
		common.myassertcontains(quaterlySummeryInclude, reportquaterlySummeryInclude, display1, display2);
		

		
	}
}

