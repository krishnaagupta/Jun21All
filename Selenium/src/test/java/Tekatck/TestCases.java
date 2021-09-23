package Tekatck;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCases extends Base  {
// test case 1 lauch the app with prpper credential
//@Test
public static void verifylogin() {
	launchapp();
	WebElement username=driver.findElement(By.xpath("//input[@id='email_field']"));
	ReuseMethod.sendKeys(driver,username,10,"admin123@gmail.com");
	WebElement pwd=driver.findElement(By.xpath("//input[@id='password_field']"));
	ReuseMethod.sendKeys(driver,pwd,10,"admin123");
	WebElement loginbtn=	driver.findElement(By.xpath("//*[@id=\"login_div\"]/button"));
	ReuseMethod.clickOn(driver, loginbtn, 10);
	//WebElement fradiobth=driver.findElement(By.xpath("//input[@id='radiobut'])[2]]"));
	//ReuseMethod.clickOn(driver, fradiobth, 10);
	// mouse hover switch to 1, get switch to expathand pass that to mouse hoover function
	WebElement switchhoovar=driver .findElement(By.xpath("//button[contains(text(),'Switch To')]"));
	ReuseMethod.mouseHover(driver,switchhoovar,10);
}
//@Test
public static void Hanblalert() {
	launchapp();
	WebElement username=driver.findElement(By.xpath("//input[@id='email_field']"));
	ReuseMethod.sendKeys(driver,username,10,"admin123@gmail.com");
	WebElement pwd=driver.findElement(By.xpath("//input[@id='password_field']"));
	ReuseMethod.sendKeys(driver,pwd,10,"admin123");
	WebElement loginbtn=	driver.findElement(By.xpath("//*[@id=\"login_div\"]/button"));
	ReuseMethod.clickOn(driver, loginbtn, 10);
}
@Test (enabled= true)
public static void HanblTable() {
	launchapp();
	driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
	WebElement username=driver.findElement(By.xpath("//input[@id='email_field']"));
	ReuseMethod.sendKeys(driver,username,10,"admin123@gmail.com");
	WebElement pwd=driver.findElement(By.xpath("//input[@id='password_field']"));
	ReuseMethod.sendKeys(driver,pwd,10,"admin123");
	WebElement loginbtn=	driver.findElement(By.xpath("//*[@id=\"login_div\"]/button"));
	ReuseMethod.clickOn(driver, loginbtn, 10);
	WebElement widgethoovar=driver .findElement(By.xpath("//button[contains(text(),'Widget')]"));
	ReuseMethod.mouseHover(driver,widgethoovar,10);
	WebElement table=	driver.findElement(By.xpath("//a[contains(text(),'Table')]"));
	ReuseMethod.clickOn(driver, table, 10);
	List<WebElement> tablerow=driver.findElements(By.xpath("//tbody/tr"));
	int rows=tablerow.size();
	List<WebElement> tablecolr=driver.findElements(By.xpath("//tbody/tr[1]/th"));
	int cols =tablecolr.size();
	//System.out.print("uyuyty--->"+rows+"ksjd"+cols);
	ReuseMethod.displaytableinfo(tablerow,tablecolr);

	
	
	
}


}