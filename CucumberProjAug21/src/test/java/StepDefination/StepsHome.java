package StepDefination;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import Base.BasePage;
import Base.BaseTest;
import Pagefactory1.PageFactory;
import io.cucumber.datatable.DataTable;
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
	@Then("dropdown {string} displayed")
	public void dropdown_displayed(String string) {
	    System.out.println("String->"+string);
	}
	/*The DataTable object contains the tabular data from the data
	 *  table we defined in our scenario, as well as methods for 
	 *  transforming this data into usable information. Generally, 
	 *  there are three ways to transform a data table in Cucumber: 
	 *  (1) a list of lists, (2) a list of maps, and (3) a table transformer.
	https://www.baeldung.com/cucumber-data-tables
	 */


	
	@Given("User enters the following details")
	public void user_enters_the_following_details(DataTable dataTable) {
		List<List<String>> rows=dataTable.asLists();// be care full in selecing the return list properely
		System.out.println("code comes here");
		for (List<String> e : rows) {
			System.out.println("e->"+e);
		}
	}
	
	
	@Then("Click Close  the developer console")
	public void click_close_the_developer_console() {
		 String parentwin = driver.getWindowHandle();
		  String popupwin=null;
		  Set<String> wins =driver.getWindowHandles();
		Iterator<String> iterator= wins.iterator();
		while(iterator.hasNext()) {
			popupwin=iterator.next();
		}
		driver.switchTo().window(popupwin);
		driver.close();
		driver.switchTo().window(parentwin);
		}

	}

	
	
