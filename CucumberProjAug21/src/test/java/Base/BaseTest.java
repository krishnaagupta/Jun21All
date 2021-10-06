package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.CommonUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected static WebDriver driver;
	static CommonUtils common = new CommonUtils();
	
	public synchronized  static WebDriver getDriver() {
	if(driver==null) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
		return driver;
	}
	
	public static void launchapplication() throws IOException {
		String url = common.getApplicationProperty("url");
		driver = getDriver();
		driver.get(url);
		
	}
}
