package StepDefination;

import java.io.IOException;

import Base.BasePage;
import Base.BaseTest;
import Pagefactory1.PageFactory;
import io.cucumber.java.en.*;

public class StepsHome extends BaseTest {
	

	BasePage page;
	PageFactory pageFactory = new PageFactory();
	
	@Given("{string} is displayed")
	public void is_displayed(String pageName) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		System.out.println("PageName" +pageName);
		page=pageFactory.initialize(pageName);
		System.out.println("code is here" +pageName);
	}
	
	
}
