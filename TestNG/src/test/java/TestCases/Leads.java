package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseTest;
import Listeners.TestListen;
import Pages.CreateAccountPage;
import Pages.CreateOptyPage;
import Pages.HomePage;
import Pages.LeadsPage;
import Pages.LoginPage;
import Utils.CommonUtils;
@Listeners(TestListen.class)
public class Leads extends BaseTest {

	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	CreateAccountPage cp;
	CreateOptyPage co;
	LeadsPage le;

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

		String username= common.getApplicationproperity("username");
		String password= common.getApplicationproperity("password");
		//ExtentTestManager.getTest().log(Status.INFO, "login --username,pwd entered");
		lp.logintoSFDC(username, password);


	}
	@AfterMethod
	public void CloseReport() throws InterruptedException {
		//driver.close();
	}	
	//@Test
	public  void tc20() throws InterruptedException, IOException {	
		common.clickOn(driver, le.leadsClick, 4);
		common.clickOn(driver, cp.noThanks, 2);
		common.clickOn(driver, cp.sendToSalesforce, 4);

		String display1="Leads Page  displayed";
		String display2="Leads Page not displayed";
		common.myassertequal(driver.getTitle(), common.getApplicationproperity("leadstittle"), display1, display2);


	}
	@Test
	public  void tc21() throws InterruptedException, IOException {	
		common.clickOn(driver, le.leadsClick, 4);
		common.clickOn(driver, cp.noThanks, 2);
		common.clickOn(driver, cp.sendToSalesforce, 4);

		String display1="Leads Page  displayed";
		String display2="Leads Page not displayed";
		common.myassertequal(driver.getTitle(), common.getApplicationproperity("leadstittle"), display1, display2);

		//common.clickOn(driver, le.leadsDropDown, 4);
		String leadsDropDown = le.leadsDropDown.getText();
		//String leadsDropDownexpectd=
		String leadsDropDownexpected= common.getApplicationproperity("leadsdropdown1")+"\n"
				+ common.getApplicationproperity("leadsdropdown2")+"\n"
				+ common.getApplicationproperity("leadsdropdown3")+"\n"
				+ common.getApplicationproperity("leadsdropdown4")+"\n"
				+ common.getApplicationproperity("leadsdropdown5")+"\n"
				+ common.getApplicationproperity("leadsdropdown6");


		display1="LeadsDropDown not Verified";
		display2="LeadsDropDown not Verified as the elements are differents";

		common.myassertequal(leadsDropDown, leadsDropDownexpected, display1, display2);

		lp.logout();


		display1="Logged out ";
		display2="Could not log out";
//		
		common.myassertcontains(driver.getCurrentUrl(), "logout", display1, display2);

	}

}
