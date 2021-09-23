package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSelenium {

	public static void main(String[] args) {
		/*
		System.setProperty("webdriver.chrome.driver", "/Users/krishnaagupta/Downloads/chromedriver 3");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");*/
		/*WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		driver.get("https://login.xero.com/identity/user/login");*/
		
		/*WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		String tittle=driver.getTitle();
		
		System.out.println(tittle);
		WebElement searchBox= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		searchBox.sendKeys("What is the day today\n");
		
		//driver.findElement(By.id("Value")).sendKeys(Keys.ENTER);
		WebElement  search= driver.findElement(By.className("btnK"));
		search.submit();*/


	}

}
