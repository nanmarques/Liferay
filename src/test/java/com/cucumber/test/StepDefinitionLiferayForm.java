package com.cucumber.test;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

import com.liferay.automated.app.Navigation;
import com.liferay.automated.app.NavigatorFactory;
import com.liferay.automated.utils.BrowserDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class StepDefinitionLiferayForm 
{
	
	private static final Logger LOGGER = Logger.getLogger(StepDefinitionLiferayForm.class.getName());

	@Given("^I access the form$")
	public void i_access_the_form() throws Throwable 
	{
		NavigatorFactory.getNavigator().access_page();
	}

	@When("^Form page is displayed$")
	public void form_page_is_displayed() throws Throwable {
		NavigatorFactory.getNavigator().form_page_is_displayed();		
	}

	@Then("^I enter a name on page: \"([^\"]*)\"$")
	public void i_enter_valid_Name_on_page(String name) throws Throwable {
		NavigatorFactory.getNavigator().i_enter_valid_name_on_page(name);
	}

	@Then("^I enter a BirthDate on page: \"([^\"]*)\"$")
	public void i_enter_valid_BirthDate_on_page(String birthdate) throws Throwable {
		NavigatorFactory.getNavigator().i_enter_valid_birthdate_on_page(birthdate);
	}

	@Then("^I enter an Answer on page: \"([^\"]*)\"$")
	public void i_enter_valid_Answer_on_page(String answer) throws Throwable {
		NavigatorFactory.getNavigator().i_enter_valid_answer_on_page(answer);
	}

	@Then("^Click on Submit Button$")
	public void click_on_Submit_Button() throws Throwable {
		NavigatorFactory.getNavigator().click_on_submitbutton();
	}

	@Then("^Information sent page is displayed$")
	public void information_sent_page_is_displayed() throws Throwable {
		NavigatorFactory.getNavigator().information_sent_page_is_displayed();
	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
		BrowserDriver.close();
	}

	@Then("^I check that all fields are available$")
	public void i_check_that_all_fields_are_available() throws Throwable {
	    NavigatorFactory.getNavigator().i_check_that_all_fields_are_available();
	}
	
	@Then("^I check that the string party rock is available$")
	public void i_check_that_the_string_party_rock_is_available() throws Throwable {
	    NavigatorFactory.getNavigator().i_check_that_the_string_party_rock_is_available();
	}

	@Then("^I check that an error message is displayed for the name field$")
	public void i_check_that_an_error_message_is_displayed_for_the_name_field() throws Throwable {
	    NavigatorFactory.getNavigator().i_check_that_an_error_message_is_displayed_for_the_name_field();
	}

	@Then("^I check that an error message is displayed for the birthdate field$")
	public void i_check_that_an_error_message_is_displayed_for_the_birthdate_field() throws Throwable {
		NavigatorFactory.getNavigator().i_check_that_an_error_message_is_displayed_for_the_birthdate_field();
	}
	
	@Then("^I check that an error message is displayed for the answer field$")
	public void i_check_that_an_error_message_is_displayed_for_the_answer_field() throws Throwable {
		NavigatorFactory.getNavigator().i_check_that_an_error_message_is_displayed_for_the_answer_field();
	}

}
