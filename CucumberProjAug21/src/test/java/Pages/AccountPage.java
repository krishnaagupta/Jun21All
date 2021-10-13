package Pages;

import org.openqa.selenium.By;

import Base.BasePage;
import Base.BaseTest;

public class AccountPage extends BasePage {
	//static WebDriver driver;
	public AccountPage() {
		super(driver =BaseTest.getDriver());
		//super(driver);
		//addObject("usermenu",By.xpath("	//*[@id=\"userNavLabel\"]"));
//		addObject("Password",By.xpath("//*[@id=\"password\"]"));
//		addObject("Login",By.xpath("//*[@id=\"Login\"]"));
	}	 

}
