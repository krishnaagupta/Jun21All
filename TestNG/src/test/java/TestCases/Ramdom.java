package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Base.BaseTest;
import Pages.ContactsPage;
import Pages.CreateAccountPage;
import Pages.CreateOptyPage;
import Pages.HomePage;
import Pages.LeadsPage;
import Pages.LoginPage;
import Utils.CommonUtils;

public class Ramdom extends BaseTest {
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
		//@Test

}
