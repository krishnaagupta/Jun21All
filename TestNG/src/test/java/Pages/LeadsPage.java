package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class LeadsPage extends BasePage {
	
	public LeadsPage(WebDriver driver) {
		super(driver);
	}
	//tc-20
		@FindBy(xpath="//*[@id=\"Lead_Tab\"]/a")
		public  WebElement leadsClick;
	//tc-21
		
		@FindBy(xpath="//*[@id=\"fcf\"]")
		public  WebElement leadsDropDown;
		
		//tc-22
		//*[@id="00B5e000002ttky_listSelect"]
		@FindBy(xpath="//*[@id=\"00B5e000002ttky_listSelect\"]")
		
		//@FindBy(xpath="//select[@id=\"fcf\"]")
		public  WebElement leadsDropDown22;

		@FindBy(xpath="//*[@id=\"filter_element\"]/div/span/span[1]/input")
		public  WebElement goClick;
		
		//tc-23
		
		@FindBy(id="userNavButton")
		public  WebElement usernavgi;
		//tc-24
		
		@FindBy(xpath="//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
		public  WebElement newBtn;
		
		@FindBy(xpath="//*[@id=\"name_lastlea2\"]")
		public  WebElement lastName;

		@FindBy(xpath="//*[@id=\"lea3\"]")
		public  WebElement company;

		@FindBy(xpath="//*[@id=\"bottomButtonRow\"]/input[1]")
		public  WebElement save1;
		

		

}
