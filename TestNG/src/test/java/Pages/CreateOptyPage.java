package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class CreateOptyPage extends BasePage {
	
		public CreateOptyPage(WebDriver driver) {
			super(driver);

		}
		// to close the prompt
		@FindBy(xpath="//div[@class='topLeft']//a[@title='Close']")
		public  WebElement closetab1;

		@FindBy(xpath="//div[@class='topLeft']//a[@title='Close']")
		public  WebElement closetab2;
		
		//TC-15-16
		@FindBy(xpath="//*[@id=\"Opportunity_Tab\"]/a")
		//@FindBy(xpath="//*[@id=\"Opportunity_Tab\"]")
		//@FindBy(id="Opportunity_Tab")
		public  WebElement OpportunityTab;

		
		@FindBy(xpath="//*[@id=\"fcf\"]")
		public  WebElement oppoturnityDropDown;
		
		@FindBy(xpath="//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
		public  WebElement oppoturnityNewClick;
		
		@FindBy(xpath="//*[@id=\"opp3\"]")
		public  WebElement oppoturnityName;
		
		@FindBy(xpath="//*[@id=\"opp12\"]")
		public  WebElement Probability;
		
		@FindBy(xpath="//*[@id=\"opp17\"]")
		public  WebElement primarycampainsource;
		
		//*[@id="opp17"]

		@FindBy(xpath="//*[@id=\"opp4_lkwgt\"]/img")
		public  WebElement accountName_old;
		
		@FindBy(xpath="//*[@id=\"opp4\"]")
		public  WebElement accountName;
		
		@FindBy(xpath="//table[@class=\"list\"]")
		public  WebElement table;
		
		@FindBy(xpath="//*[@id=\"resultsFrame\"]")
		public  WebElement framePath;
		
		@FindBy(xpath="//*[@id=\"opp11\"]")
		public  WebElement stageDropdown;
		
		@FindBy(xpath="//*[@id=\"opp6\"]")
		public  WebElement leadSource;
		
		@FindBy(xpath="//*[@id=\"opp9\"]")
		public  WebElement closingDate;
		
		@FindBy(xpath="//*[@id=\"calMonthPicker\"]")
		public  WebElement calmonthpicker;
		
		@FindBy(xpath="//*[@id=\"calYearPicker\"]")
		public  WebElement calyearpicker;
		
		@FindBy(xpath="//*[@id=\"calRow5\"]/td[2]")
		public  WebElement datepicked;
		

		@FindBy(xpath="//*[@id=\"bottomButtonRow\"]/input[1]")
		public  WebElement saveButton;
		//Tc-17
		//click on oppoturnity pipeline
		//@FindBy(xpath="//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a")
		@FindBy(xpath="//a[contains(text(),'Opportunity Pipeline')]")	

		public  WebElement oppoturnityPipeline;
		
		@FindBy(xpath="//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a")
		public  WebElement oppoturnitystuck;
		//tc-19
		
		
		@FindBy(xpath="//*[@id=\"quarter_q\"]")
		public  WebElement quaterlySummeryInterval;
		
		@FindBy(xpath="//*[@id=\"open\"]")
		public  WebElement quaterlySummeryInclude;	
			
		@FindBy(xpath="//*[@id=\"lead_summary\"]/table/tbody/tr[3]/td/input")
		public  WebElement runOn;			
		
		
		//@FindBy(xpath="//*[@id=\"quarter_c\"]")
		//public  WebElement quaterlyintervalreport;
			
				
}
