package StepDefination;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BasePage;
import Base.BaseTest;
import Pagefactory1.PageFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsLogin extends BaseTest {

	BasePage page;
	PageFactory pageFactory = new PageFactory();

	@Before
	public void setup () throws IOException {

		launchapplication();
	}


	@Given("User is on {string}")
	public void user_is_on(String pageName) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		//pageName="Users/krishnaagupta/eclipse-workspace/repos/Jun21All/CucumberProjAug21/src/test/java/Pages/LoginPage.java";
		System.out.println("PageName" +pageName);
		page=pageFactory.initialize(pageName);
		System.out.println("code is here" +pageName);

	}


	@When("User enters value into text box {string} {string}")

	public void user_enters_value_into_text_box(String Username, String Password) {
		
		page.enterIntoTextBox(Username,Password);
	}

	@Then("User click on {string} Button")
	public void user_click_on_button(String id) {
		
		System.out.println("code comes here->" +id);
		page.clickButton(id);
	}
	


	@Then("{string} to be Displayed")
	public void to_be_displayed(String id) throws InterruptedException {
		Thread.sleep(2000);
		//String text=page.getval(id);
		String text=page.getText(id);
		System.out.println("the error->"+text);
		//Assert.assertEquals(text, "kkg22@tekarch.com");
	}
	
	@Then("User click on {string} Checkbox")
	public void user_click_on_checkbox(String Rememberme) {
		page.clickButton(Rememberme);
	}

	@Then("link is displayed")
	public void link_is_displayed() {
	   String text1="https://login.salesforce.com/secur/forgotpassword.jsp";
	   String text2= driver.getCurrentUrl();
	   Assert.assertEquals(text1, text2);
	   //page.verifyTextValue(text1, text2);
	}


	
	@Given("User is on HomePage and goes to {string} clicks {string}")
	public void user_is_on_home_page_and_goes_to_clicks(String usermenu, String option) {
		page.clickButton(usermenu);
		page.clickButton(option);
	}
	//stepdefination for sceneriooutline
	@When("User enters value into text box {string}")
	public void user_enters_value_into_text_box(String UserName) {
		
		page.waitforElement(driver.findElement(By.xpath("//*[@id=\"username\"]")));
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("UserName");
		System.out.println("user name->"+ UserName);
	}

}
