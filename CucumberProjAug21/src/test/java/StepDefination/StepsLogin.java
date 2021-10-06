package StepDefination;

import java.io.IOException;



import Base.BasePage;
import Base.BaseTest;
import Pagefactory1.PageFactory;
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
		

	}


	@When("User enters value into text box {string} {string}")

	public void user_enters_value_into_text_box(String Username, String Password) {
		page.enterIntoTextBox(Username,Password);
	}

	@Then("User click on {string} Button")
	public void user_click_on_button(String Login) {
		page.clickButton(Login);
	}
}
