package Tekatck;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
	
	static WebDriver driver;
	@Test
	public static void launchapp() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://qa-tekarch.firebaseapp.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);// implicitly wait
	}
	
}
