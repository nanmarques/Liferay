package com.liferay.automated.app;

import com.liferay.automated.utils.BrowserDriver;
import com.liferay.automated.view.FormView;
import com.liferay.automated.view.SuccessfulView;

public class Navigation {
	
	public void access_page(){
		BrowserDriver.loadPage("https://forms.liferay.com/web/forms/shared/-/form/372406");
	}

	public void form_page_is_displayed(){
		FormView.isDisplayedCheck();
	}

	public void i_enter_valid_name_on_page(String  name){
		FormView.fillName(name);
	}

	public void i_enter_valid_birthdate_on_page(String  birthdate){
		FormView.fillBirthDate(birthdate);
	}

	public void i_enter_valid_answer_on_page(String  answer){
		FormView.fillAnswer(answer);
	}

	public void click_on_submitbutton(){
		FormView.clickSubmit();
	}
	
	public void information_sent_page_is_displayed(){
		SuccessfulView.isDisplayedCheck();
	}
	
	public void i_check_that_all_fields_are_available()
	{
		FormView.areFieldsAvailable();
	}
	
	public void i_check_that_the_string_party_rock_is_available()
	{
		FormView.isPartyRockDisplayed();
	}
	
	public void i_check_that_an_error_message_is_displayed_for_the_name_field()
	{
		FormView.isNameRequiredDisplayed();
	}
	
	public void i_check_that_an_error_message_is_displayed_for_the_birthdate_field()
	{
		FormView.isBirthDateRequiredDisplayed();
	}
	
	public void i_check_that_an_error_message_is_displayed_for_the_answer_field()
	{
		FormView.isAnswerRequiredDisplayed();
	}
}
