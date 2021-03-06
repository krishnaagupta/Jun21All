package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//*[@id=\"userNav\"]")
	public  WebElement usernavi;
	
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[5]")
	public  WebElement logOut;
	
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[3]")
	public  WebElement developerconsole;
	
	
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[2]")
	public  WebElement setting;
	
	@FindBy(id="PersonalInfo_font")
	public  WebElement personalSetting;
	
	@FindBy(xpath="//*[@id=\"LoginHistory_font\"]")
	public  WebElement logInHistroy;
	
	//@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[3]")
	//public  WebElement downloadLoginHistroy;
	
	@FindBy(xpath="//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a")
	public  WebElement downloadLoginlink;
	
	
	@FindBy(xpath="	//*[@id=\"userNavLabel\"]")
	public  WebElement userNavLabel;

	
	
	// display layout
	@FindBy(xpath="//*[@id=\"DisplayAndLayout\"]/a")
	public  WebElement displaylayout;
	
	@FindBy(id="CustomizeTabs_font")
	public  WebElement customizeTab;
	
	@FindBy(xpath="//*[@id=\"p4\"]/option[9]")
	public  WebElement customizeoption;
	
	@FindBy(xpath="//*[@id=\"duel_select_0\"]/option[72]")
	public  WebElement selectReports;
	
	@FindBy(xpath="//*[@id=\"duel_select_0_right\"]/img")
	public  WebElement addReport;
	
	@FindBy(xpath="//*[@id=\"report_Tab\"]")
	public  WebElement reportsTab;
	
	@FindBy(xpath="//*[@id=\"bottomButtonRow\"]/input[1]")
	public  WebElement HitSave;
	
	@FindBy(xpath="//*[@id=\"p4\"]")
	public  WebElement customization;
	
	@FindBy(xpath="//*[@id=\"duel_select_1\"]/option")
	public  WebElement selectedTabs;
	
	
	//Email set up
	
	@FindBy(xpath="//*[@id=\"EmailSetup\"]/a")
	public  WebElement email;
	
	@FindBy(xpath="//*[@id=\"EmailSettings_font\"]")
	public  WebElement myEmail;
	
	@FindBy(xpath="//*[@id=\"sender_name\"]")
	public  WebElement emailName;

	@FindBy(xpath="//*[@id=\"sender_email\"]")
	public  WebElement senderEmail;

	@FindBy(xpath="//*[@id=\"auto_bcc1\"]")
	public  WebElement radioButton;
	
	@FindBy(xpath="//*[@id=\"bottomButtonRow\"]/input[1]")
	public  WebElement saveButton;
	
	@FindBy(xpath="//*[@id=\"meSaveCompleteMessage\"]/table/tbody/tr/td[2]/div")
	public  WebElement successmsg;
	
	
	
	//calender
	@FindBy(xpath="//*[@id=\"CalendarAndReminders_font\"]")
	public  WebElement calender;
	
	@FindBy(xpath="//*[@id=\"Reminders_font\"]")
	public  WebElement reminder;

	@FindBy(xpath="//*[@id=\"testbtn\"]")
	public  WebElement openTest;
//test case 6
	
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[1]")
	public  WebElement myprofile;
	
	@FindBy(xpath="//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img")
	public  WebElement editbutton;
	
	@FindBy(xpath="//li[@id='aboutTab']")
	public  WebElement aboouttab;
	
	@FindBy(id="lastName")
	public  WebElement lastname1;
	
	@FindBy(xpath="//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]")
	public  WebElement saveclick;
	
	@FindBy(xpath="//*[@id=\"profileTab_sfdc.ProfilePlatformFeed\"]")
	public  WebElement feed1;
			
	@FindBy(xpath="//*[@id=\"publisherAttachTextPost\"]/span[1]")
	public  WebElement post1;

	@FindBy(xpath="//*[@id=\"cke_39_contents\"]/iframe")
	public  WebElement postXPath;

	@FindBy(xpath="\"/html[1]/body[1]\"")
	public  WebElement posttext;
	
	@FindBy(id="publishersharebutton")
	public  WebElement shareButton;
	

	//add a photo
	@FindBy(xpath="/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[2]/div[1]/div/a")
	public  WebElement photoHavour1;
	
	@FindBy(xpath="//*[@id=\"photoSection\"]/span[2]/img[1]")
	public  WebElement photoHavour;
	
	@FindBy(xpath="//*[@id=\"photoSection\"]/div")
	public  WebElement photoUpload;
	
	@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadInputFile']")
	public  WebElement PhotoChooseFile;

	@FindBy(xpath="//*[@id=\"j_id0:uploadFileForm:uploadBtn\"]")
	public  WebElement photoSave;

	@FindBy(xpath="//*[@id=\"j_id0:uploadFileForm\"]/div[3]/input[3]")
	public  WebElement photoCancel;

	@FindBy(xpath="//*[@id=\"j_id0:j_id7:save\"]")
	public  WebElement photoSaveFinal;
}
