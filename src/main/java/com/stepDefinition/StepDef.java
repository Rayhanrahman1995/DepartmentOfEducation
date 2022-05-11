package com.stepDefinition;

import com.webPages.ChildCareFacility;
import com.webPages.EarlyChildhood;
import com.webPages.SearchField;
import com.webPages.TextValidation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef{
	
	 EarlyChildhood earlyChildhood=new EarlyChildhood(Base.driver);
	 ChildCareFacility childCareFacility=new ChildCareFacility(Base.driver);
	 TextValidation textValidation=new TextValidation(Base.driver);
	 SearchField searchField=new SearchField(Base.driver);
	
	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
	  System.out.println("Home Page Title: "+Base.driver.getTitle());
	}

	@When("user click on early childhood button")
	public void user_click_on_early_childhood_button() {
	 //   Base.earlyChildhood.earlyChildhoodButton();
		earlyChildhood.earlyChildhoodButton();
	}

	@When("user click on child care facility button")
	public void user_click_on_child_care_facility_button() {
	 //   Base.childCareFacility.childCareFacilityButton();
		childCareFacility.childCareFacilityButton();
	}

	@Then("user should able to see {string}")
	public void user_should_able_to_see(String string) {
	 //   Base.textValidation.childCareTextValidation(string);
		textValidation.childCareTextValidation(string);
	}
	@When("user enter {string}")
	public void user_enter(String string) throws InterruptedException {
	    searchField.searchFieldBox(string);
	    Thread.sleep(3000);
	}

	@Then("user should see the text")
	public void user_should_see_the_text() {
	   searchField.displayText();
	}
}
