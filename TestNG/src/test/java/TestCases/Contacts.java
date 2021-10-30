package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseTest;
import Listeners.TestListen;
import Pages.ContactsPage;
import Pages.CreateAccountPage;
import Pages.CreateOptyPage;
import Pages.HomePage;
import Pages.LeadsPage;
import Pages.LoginPage;
import Utils.CommonUtils;
@Listeners(TestListen.class)
public class Contacts extends BaseTest {
	//WebDriver driver;
	LoginPage lp;
	HomePage hp;
	CreateAccountPage cp;
	CreateOptyPage co;
	LeadsPage le;
	ContactsPage ct;
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
		le= new LeadsPage(driver);
		ct= new ContactsPage(driver);

		String username= common.getApplicationproperity("username");
		String password= common.getApplicationproperity("password");
		//ExtentTestManager.getTest().log(Status.INFO, "login --username,pwd entered");
		lp.logintoSFDC(username, password);


	}
	@AfterMethod
	public void CloseReport() throws InterruptedException {
		//driver.close();
	}	
	@Test  (priority=1)
	public  void tc25() throws InterruptedException, IOException {	
		common.clickOn(driver, ct.contactsClick, 4);
		common.clickOn(driver, cp.noThanks, 2);
		common.clickOn(driver, cp.sendToSalesforce, 4);

		
		String display1="Contacts Page  displayed";
		String display2="Contacts Page not displayed";
		
		String tittle= driver.getTitle();
		String fromProprtity=common.getApplicationproperity("contactstittle");
		System.out.println("title->"+ tittle);
		System.out.println("title1->"+ fromProprtity);
		common.myassertequal(tittle,fromProprtity , display1, display2);
		
		common.clickOn(driver, ct.newClick, 4);
		common.sendKeys(driver, ct.lastName, 0, "Ct");
		common.sendKeys(driver, ct.accountName, 0, "kk");
		common.clickOn(driver, ct.Save, 4);
		//System.out.println("tittle->"+driver.getTitle());
		
		String  display3="Contacts Page  displayed";
		String display4="Contacts Page not displayed";
		System.out.println("propfile->"+common.getApplicationproperity("contactsave"));
		System.out.println("tittle"+driver.getTitle());
		System.out.println("display 1&2_"+display1+display2 );
		
		common.myassertcontains(driver.getTitle(), "Salesforce - Developer Edition", display1, display2);
		
		
	}
	@Test  (priority=2)
	public  void tc26() throws InterruptedException, IOException {	
		common.clickOn(driver, ct.contactsClick, 4);
		common.clickOn(driver, cp.noThanks, 2);
		common.clickOn(driver, cp.sendToSalesforce, 4);

		
		String display1="Contacts Page  displayed";
		String display2="Contacts Page not displayed";
		
		String tittle= driver.getTitle();
		String fromProprtity=common.getApplicationproperity("contactstittle");
		System.out.println("title->"+ tittle);
		System.out.println("title1->"+ fromProprtity);
		
		common.myassertequal(tittle,fromProprtity , display1, display2);
		common.clickOn(driver, ct.createNew,4 );
		
		common.sendKeys(driver, ct.viewName, 4,"kop");
		common.clickOn(driver, ct.viewUniName, 4);
		String text=ct.viewName.getAttribute("value");
		String text1=ct.viewUniName.getAttribute("value");
		common.myassertequal(text, text1, "View Name View Unique entered", "View Name View Unique not entered correctly");
		common.clickOn(driver, ct.saveSubmit, 4);
		System.out.println("tittle"+driver.getTitle());
	
		 display1="view created and saved";
		 display2="view not created and not saved";
		 common.myassertequal(driver.getTitle(),common.getApplicationproperity("createview") , display1, display2);
		
	}	
	@Test  (priority=3)
	public  void tc27() throws InterruptedException, IOException {
		common.clickOn(driver, ct.contactsClick, 4);
		common.clickOn(driver, cp.noThanks, 2);
		common.clickOn(driver, cp.sendToSalesforce, 4);

		
		String display1="Contacts Page  displayed";
		String display2="Contacts Page not displayed";
		
		String tittle= driver.getTitle();
		String fromProprtity=common.getApplicationproperity("contactstittle");
		System.out.println("title->"+ tittle);
		System.out.println("title1->"+ fromProprtity);
		common.myassertequal(tittle,fromProprtity , display1, display2);
		
		
		Select select =new Select(ct.recentlyViewed);
		select.selectByValue("2");
		String text= select.getFirstSelectedOption().getText();
		display1="recently created selected";
		display2="recently created not selected";
		common.myassertequal("Recently Created", text, display1, display2);
		
		System.out.println("tittle"+ driver.getTitle());//? assertions pending
		
	}
	@Test  (priority=4)
	public  void tc28() throws InterruptedException, IOException {
		common.clickOn(driver, ct.contactsClick, 4);
		common.clickOn(driver, cp.noThanks, 2);
		common.clickOn(driver, cp.sendToSalesforce, 4);

		
		String display1="Contacts Page  displayed";
		String display2="Contacts Page not displayed";
		
		String tittle= driver.getTitle();
		String fromProprtity=common.getApplicationproperity("contactstittle");
		common.myassertequal(tittle,fromProprtity , display1, display2);
		
		Select select =new Select(ct.viewselection);
		select.selectByVisibleText("My Contacts");
		String text= select.getFirstSelectedOption().getText();
		display1="My Contacts selected";
		display2="My contacts not selected";
		common.myassertequal("My Contacts", text, display1, display2);
		
		
	}
@Test  (priority=5)
	public  void tc29() throws InterruptedException, IOException {
		common.clickOn(driver, ct.contactsClick, 4);
		common.clickOn(driver, cp.noThanks, 2);
		common.clickOn(driver, cp.sendToSalesforce, 4);

		
		String display1="Contacts Page  displayed";
		String display2="Contacts Page not displayed";
		
		String tittle= driver.getTitle();
		String fromProprtity=common.getApplicationproperity("contactstittle");
		common.myassertequal(tittle,fromProprtity , display1, display2);
		common.clickOn(driver, ct.contactName,5);
		
		
	
	}
	@Test (priority=6)
	public  void tc30() throws InterruptedException, IOException {
		common.clickOn(driver, ct.contactsClick, 4);
		common.clickOn(driver, cp.noThanks, 2);
		common.clickOn(driver, cp.sendToSalesforce, 4);

		
		String display1="Contacts Page  displayed";
		String display2="Contacts Page not displayed";
		
		String tittle= driver.getTitle();
		String fromProprtity=common.getApplicationproperity("contactstittle");
		common.myassertequal(tittle,fromProprtity , display1, display2);
		common.clickOn(driver, ct.createNew,5);
		System.out.println("tittle111"+driver.getTitle());
		common.sendKeys(driver, ct.viewUniName, 0, "EFGH");
		
		common.clickOn(driver, ct.saveSubmit,5);
		
		String err= ct.errormessage.getText();
		
		 display1="Error message displayed";
		 display2="Error message not displayed";
		
		
		String errorproperity=common.getApplicationproperity("contacterror");
		common.myassertequal(err,errorproperity , display1, display2);
		
	}
	@Test
	public  void tc31() throws InterruptedException, IOException {
		
	}
}
