package Base;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class BasePage {
	 public static WebDriver driver;
	public HashMap<String, By> ObjRep = new HashMap<String, By>();
	
	public BasePage(WebDriver driver) {
		this.driver  = driver;
	}
	
	public void addObject(String logicalName, By by){
		ObjRep.put(logicalName, by);
		
	}
	
	public void waitforElement(WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void enterIntoTextBox(String logicalName, String value) {
		WebElement element = getWebElement(logicalName);
		enterIntoTextBox(element,value);
		
	}
	
	
	
	
	private WebElement getWebElement(String logicalName) {
		WebElement element = null;
		By by = null;
		by = ObjRep.get(logicalName);
		element = driver.findElement(by);
		return element;
	}

	public void clickButton(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickButton(element);
		
	}
	
	public String getText(String logicalName) {
		WebElement element = getWebElement(logicalName);
		waitforElement (element);
		return (element.getText());
		
	}
	public String getval(String logicalName) {
		WebElement element = getWebElement(logicalName);
		waitforElement (element);
		return (element.getAttribute("value"));
		
	}
	public void clickRadioButton(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickRadioButton(element);
		
	} 
	
	public void verifyTextValue(String logicalName, String expectedaValue) {
		WebElement element = getWebElement(logicalName);
		verifyTextValue(element,expectedaValue);
	}

	
/*-------------------------------------------Private Methods----------------------*/
	
	

	private void verifyTextValue(WebElement element,String expectedaValue) {
		String ActualValue = element.getText();
		Assert.assertEquals(ActualValue, expectedaValue);
		
	}

	private void enterIntoTextBox(WebElement element, String value) {
		waitForElement(element);
		element.sendKeys(value);
	}
//	private String gettextval(WebElement element) {
//		waitForElement(element);
//		String val;
//		return val=element.getAttribute("value");
//	}
	
	private void clickButton(WebElement element) {
		waitForElement(element);
		element.click();
		
	}
	
	private void clickRadioButton(WebElement element) {
		waitForElement(element);
		element.click();
		
	}
	
	private void waitForElement(WebElement element) {
		WebDriverWait  wait = new WebDriverWait(driver, 20) ;
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	
	
	

}


