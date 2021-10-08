package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;
import Base.BaseTest;

public class HomePage extends BasePage {
	//static WebDriver driver;
	public HomePage() {
		super(driver =BaseTest.getDriver());
		//super(driver);
		addObject("usermenu",By.xpath("	//*[@id=\"userNavLabel\"]"));
//		addObject("Password",By.xpath("//*[@id=\"password\"]"));
//		addObject("Login",By.xpath("//*[@id=\"Login\"]"));
	}	
}
