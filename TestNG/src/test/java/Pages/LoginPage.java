package Pages;

import java.io.IOException;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import Base.BasePage;
import Base.BaseTest;
import Utils.CommonUtils;

public class LoginPage extends BasePage {
public LoginPage(WebDriver driver) {
		super (driver);
	}

@FindBy(xpath="//input[@id='username']")
//@FindBy(id= "id-identity")
public  WebElement userName;

@FindBy(id="password")
public  WebElement password;
@FindBy(xpath="//*[@id=\"Login\"]")
public  WebElement login;

@FindBy(xpath="//*[@id=\"rememberUn\"]")
public  WebElement rememberMe;

@FindBy(xpath="//*[@id=\"error\"]")
public  WebElement errorMsg;


@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[5]")
public  WebElement logOut;

@FindBy(xpath="//*[@id=\"idcard-identity\"]")
public  WebElement remembermeUserName;

@FindBy(xpath="//*[@id=\"forgot_password_link\"]")
public  WebElement forgotPassword;

@FindBy(id="un")
public  WebElement email;

@FindBy(id="continue")
public  WebElement continueButton;


@FindBy(xpath="//input[@id='un']")
public  WebElement usernameforgotme;

@FindBy(xpath="	//*[@id=\"userNavLabel\"]")
public  WebElement userNavLabel;

public void logintoSFDC(String username1, String password1) throws InterruptedException, IOException {
	
	CommonUtils.sendKeys(driver,userName ,5,username1);
	String usernamegettext=userName.getAttribute("value");
	Assert.assertEquals(usernamegettext, username1);
	
	CommonUtils.sendKeys( driver,password ,5,password1);
	Assert.assertEquals(password.getAttribute("value"), password1);

	CommonUtils.clickOn(driver,login, 2);
	
//	Assert.assertEquals(driver.getCurrentUrl(), usernamegettext,);
//	System.out.println("tittle-->"+urluu);

}
public void logout() {
	CommonUtils.clickOn(driver,userNavLabel ,3);
	CommonUtils.clickOn(driver,logOut ,3);
}

}
