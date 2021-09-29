package Utils;

import  Utils.AppConstants;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import Base.BaseTest;

public class CommonUtils {
	public static Logger log =Logger.getLogger(CommonUtils.class);

	//Reads a value from properity file
	public String getApplicationproperity(String key) throws IOException  {
		String value="";	
		Properties prop=new Properties();
		String filepath=AppConstants.USER_DIR+File.separator+AppConstants.APPLICATION_PROPERITIES;
		System.out.println(filepath);
		FileInputStream inputfile= new FileInputStream(filepath);
		try {
			prop.load(inputfile);
			value=prop.getProperty(key);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			inputfile.close();
		}
		System.out.println("value-->"+value);
		return value;

	}

	public String takeScreenshot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) BaseTest.driver;
		String addDate = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		String destinationPath = System.getProperty("user.dir")+"/HtmlReports/"+addDate + ".PNG";
		File srcfile = screenshot.getScreenshotAs(OutputType.FILE);
		File dstfile = new File(destinationPath);
		FileUtils.copyFile(srcfile, dstfile);
		//        test.addScreenCaptureFromPath(destinationPath);
		//        test.fail("Login to homepage failed");
		return destinationPath;
	}
//	public boolean waitForElementVisible(WebElement element) {
//		try {
//			WebDriverWait wait = new WebDriverWait(BaseTest.driver, 30);
//			wait.until(ExpectedConditions.visibilityOf(element));
//
//			return true;
//		} catch (Exception e) {
//			return false;
//		}
//	}

	public  static void selectdateByJs( WebDriver driver,WebElement element,String date)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
	}

	public  static void sendKeys(WebDriver driver, WebElement element,int timeout,String value)
	{
		element.clear();
		new WebDriverWait(driver,timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	public static void clickOn(WebDriver driver, WebElement element,int timeout) {
		new WebDriverWait(driver,timeout)
		.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	public static void waiting(WebDriver driver, WebElement element,int timeout) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
	}
	
	
}
