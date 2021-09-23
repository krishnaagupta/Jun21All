package Tekatck;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReuseMethod extends Base {
	static WebDriverWait wait ;
	
public  static void sendKeys(WebDriver driver, WebElement element,int timeout,String value)
{
	
	element.clear();
	new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(value);
}
public  static void clickOn(WebDriver driver, WebElement element,int timeout)
{
	new WebDriverWait(driver,timeout)
		.until(ExpectedConditions.visibilityOf(element));
	element.click();
}
public  static void mouseHover(WebDriver driver,WebElement element,int timeout) {
	new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
	Actions action =new Actions(driver);
	action.moveToElement(element).build().perform();
}

public static void wait(WebElement ele, int timeout) {
	new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(ele));
}
public static void displaytableinfo(List<WebElement> tablerow,List<WebElement> tablecol) {
	int rows=tablerow.size();
	int cols=tablecol.size();
	for (int i=1;i<=rows;i++) {
		for (int j=1;j<= cols;j++) {
			 System.out.println( driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).getText());
			
		}
	}
	
	/*Iterator <WebElement> it= tableinfo.iterator();
	System.out.println("table data");
	while(it.hasNext()) {
		System.out.print(it.next().getText());
		System.out.print("\t");
	}*/
}
public static void logout() {
	
}


}