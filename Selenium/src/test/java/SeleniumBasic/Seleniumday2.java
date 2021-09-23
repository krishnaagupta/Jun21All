package SeleniumBasic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumday2 {
	
	/*public static void selenium2() throws InterruptedException, AWTException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email_field']")).sendKeys("admin123@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_field']")).sendKeys("admin123");	
		//using Robert class
		Thread.sleep(2000);
		Robot r =new Robot();
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login_div\"]/button")).click();
		Thread.sleep(2000);
		//if  (!driver.findElement(By.xpath("(//span[@class='col-35'])[2]")).isSelected()){
		//driver.findElement(By.xpath("(//span[@class='col-35'])[2]")).click();
		boolean selected =driver.findElement(By.xpath("//*[@id=\"radiobut\"]")).isSelected();
		driver.findElement(By.xpath("(//input[@id='radiobut'])[2]")).click();
		System.out.println(selected);
	
		WebElement city=driver.findElement(By.xpath("//Select[@id='city']"));
				
		Select select1=new Select (city);
		select1.selectByValue("goa");
		
		//driver.close();
	}*/
}
