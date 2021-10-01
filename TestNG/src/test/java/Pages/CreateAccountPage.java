package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class CreateAccountPage extends BasePage {
	public CreateAccountPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(xpath="//*[@id=\"Account_Tab\"]/a")
	public  WebElement accountClick;

	@FindBy(xpath="//*[@id=\"acc6\"]")
	public  WebElement accounttype;

	@FindBy(xpath="//*[@id=\"00N5f000006eiJW\"]")
	public  WebElement customerpriority;


	@FindBy(xpath="//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
	public  WebElement newClick;

	@FindBy(xpath="//*[@id=\"acc2\"]")
	public  WebElement accountName;

	@FindBy(xpath="//*[@id=\"bottomButtonRow\"]/input[1]")
	public  WebElement saveClick;


	@FindBy(xpath="//*[@id=\"contactHeaderRow\"]/div[2]/h2")
	public  WebElement checkAccountName;

	@FindBy(xpath="//*[@id=\"lexNoThanks\"]")
	public  WebElement noThanks;
	@FindBy(xpath="//*[@id=\"lexSubmit\"]")
	public  WebElement sendToSalesforce;


	//Tc-11

	@FindBy(xpath="//*[@id=\"filter_element\"]/div/span/span[2]/a")
	public  WebElement createNewView;
	//@FindBy(xpath="//*[@id=\"filter_element\"]/div/span/span[2]/a[2]")
	//public  WebElement createNewView;

	@FindBy(xpath="//*[@id=\"fname\"]")
	public  WebElement viewName;

	@FindBy(xpath="//*[@id=\"devname\"]")
	public  WebElement viewUniquename;

	@FindBy(xpath="//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]")
	public  WebElement clickSave;

	@FindBy(xpath="//*[@id=\"fcf\"]/option")
	public  WebElement displayView;
	// tc-12
	@FindBy(xpath="//*[@id=\"fcf\"]/option[1]")
	public  WebElement dropDownClick;

	@FindBy(xpath="//*[@id=\"filter_element\"]/div/span/span[2]/a[1]")
	public  WebElement editClick;

	@FindBy(id="fname")
	public  WebElement viewName1;

	
	

	@FindBy(xpath="//*[@id=\"fcol1\"]")
	public  WebElement accountName1;

	@FindBy(xpath="//*[@id=\"fop1\"]")
	public  WebElement opertaor;	

	@FindBy(xpath="//*[@id=\"fval1\"]")
	public  WebElement value;	

	@FindBy(xpath="//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]")
	public  WebElement save1;	
	
	@FindBy(xpath="//*[@id=\"00B5f000005ea7y_listSelect\"]")
	public  WebElement savedview;	
	
	
	
	//tc-14

	@FindBy(xpath="//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a")
	public  WebElement AccountreportClick;
	
	@FindBy(xpath="//div[contains(text(),'Created Date')]")
	//@FindBy(xpath="//div[@class=\"x-combo-list-item x-combo-selected\"]")
	public  WebElement createdatedropdown;	
	

	@FindBy(xpath="//*[@id=\"ext-gen152\"]")
	public  WebElement fromDate;	

	@FindBy(xpath="//*[@id=\"ext-gen279\"]")
	public  WebElement fromtodayDate;	

	@FindBy(xpath="//*[@id=\"ext-gen154\"]")
	public  WebElement toDate;	

	@FindBy(xpath="//*[@id=\"ext-comp-1114\"]")
	public  WebElement today_Date;	

	@FindBy(xpath="//*[@id=\"ext-gen49\"]")
	public  WebElement saveButton;	

	@FindBy(xpath="//*[@id=\"saveReportDlg_reportNameField\"]")
	public  WebElement reportName;	

	@FindBy(xpath="//*[@id=\"saveReportDlg_DeveloperName\"]")
	public  WebElement reportUniqueName;	

	//@FindBy(xpath="//*[@id=\"ext-gen282\"]")
	@FindBy(xpath="//*[@id=\"ext-gen316\"]")
	//@FindBy(xpath="//*[@id=\"dlgSaveAndRun\"]")
	public  WebElement saveandrunBtn;	

	//*[@id="dlgSaveAndRun"]
	//tc-13
	//*[@id="toolsContent"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a
	@FindBy(xpath="//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a")
	public  WebElement mergeAccount;


	@FindBy(xpath="//*[@id=\"srch\"]")
	public  WebElement findAcctTest;

	@FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[2]")
	public  WebElement findAcctSubmit;

	@FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[1]")
	public  WebElement nextSubmit;


	@FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[2]")
	public  WebElement mergeSubmit;

	@FindBy(xpath="//*[@id=\"cid0\"]")
	public  WebElement datarRow1;

	@FindBy(xpath="//*[@id=\"cid1\"]")
	public  WebElement datarRow2;



	@FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[1]")
	public  WebElement nextSubmit1;

	@FindBy(xpath="//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[2]")
	public  WebElement merge;

	@FindBy(xpath="//*[@id=\"00B5e000002ttlQ_listSelect\"]")
	public  WebElement recentlyViewed;

	@FindBy(xpath="//*[@id=\"filter_element\"]/div/span/span[1]/input")
	public  WebElement go;

}	


