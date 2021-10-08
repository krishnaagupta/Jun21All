package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;
import Base.BaseTest;

public class LoginPage extends BasePage {
	
	//static WebDriver driver;
	
	public LoginPage() {
		super(driver =BaseTest.getDriver());
		//super(driver);
		addObject("Username",By.xpath("//*[@id=\"username\"]"));
		addObject("Password",By.xpath("//*[@id=\"password\"]"));
		addObject("Login",By.xpath("//*[@id=\"Login\"]"));
		addObject("Error1",By.xpath("//*[@id=\"error\"]"));
		addObject("Rememberme",By.xpath("//*[@id=\"rememberUn\"]"));
		addObject("usermenu",By.xpath("	//*[@id=\"userNavLabel\"]"));
		addObject("Logout",By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		addObject("forgotPassword",By.xpath("//*[@id=\"forgot_password_link\"]"));
		addObject("Userrememberme",By.xpath("//*[@id=\"idcard-identity\"]"));
		addObject("continueButton",By.xpath("//*[@id=\"continue\"]"));
		addObject("usernameforgotme",By.xpath("//*[@id=\"un\"]"));
		
	}




		
	

	

	public void testmethod() {
		System.out.println("Overriding");
	}
}
