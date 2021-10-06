package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Base.BaseTest;

public class LoginPage extends BasePage {
	
	static WebDriver driver;
	
	public LoginPage() {
		super(driver =BaseTest.getDriver());
		//super(driver);
		addObject("Username",By.xpath("//*[@id=\"username\"]"));
		addObject("Password",By.xpath("//*[@id=\"password\"]"));
		addObject("Login",By.xpath("//*[@id=\"Login\"]"));
		
		
	}
	
	

	public void testmethod() {
		System.out.println("Overriding");
	}
}
