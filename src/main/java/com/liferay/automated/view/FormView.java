package com.liferay.automated.view;

import java.util.logging.Logger;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import com.liferay.automated.containers.FormContainer;
import com.liferay.automated.utils.BrowserDriver;

import net.bytebuddy.asm.Advice.Enter;


public class FormView {
	private static final Logger LOGGER = Logger.getLogger(FormView.class.getName());
	private static final FormContainer formContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), FormContainer.class);
	
	public static void isDisplayedCheck()
	{
		LOGGER.info("Checking if Form page is displayed");
		BrowserDriver.waitForElement(formContainer.nameInput);
		formContainer.nameInput.isDisplayed();
	}
	
	public static void isPartyRockDisplayed()
	{
		LOGGER.info("Checking if Party Rock String is available");
		BrowserDriver.waitForElement(formContainer.partyRock);
		formContainer.partyRock.isDisplayed();
		LOGGER.info("Message: "+ formContainer.partyRock.getText());
	}
	
	public static void isNameRequiredDisplayed()
	{
		LOGGER.info("Checking if Message for name field required is displayed");
		BrowserDriver.waitForElement(formContainer.nameRequired);
		formContainer.nameRequired.isDisplayed();
		LOGGER.info("Message required: "+ formContainer.nameRequired.getText());
	}
	
	public static void isBirthDateRequiredDisplayed()
	{
		LOGGER.info("Checking if Message for name field required is displayed");
		BrowserDriver.waitForElement(formContainer.birhDateRequired);
		formContainer.birhDateRequired.isDisplayed();
		LOGGER.info("Message required: "+ formContainer.birhDateRequired.getText());
	}
	
	public static void isAnswerRequiredDisplayed()
	{
		LOGGER.info("Checking if Message for name field required is displayed");
		BrowserDriver.waitForElement(formContainer.answerRequired);
		formContainer.answerRequired.isDisplayed();
		LOGGER.info("Message required: "+ formContainer.answerRequired.getText());
	}
	
	public static void areFieldsAvailable() 
	{
		LOGGER.info("Checking if all fields arre available");
		BrowserDriver.waitForElement(formContainer.nameInput);
		formContainer.nameInput.isDisplayed();
		BrowserDriver.waitForElement(formContainer.birthDateInput);
		formContainer.birthDateInput.isDisplayed();
		BrowserDriver.waitForElement(formContainer.answerInput);
		formContainer.answerInput.isDisplayed();
		formContainer.birthDateInput.isDisplayed();
		BrowserDriver.waitForElement(formContainer.submitButton);
		formContainer.submitButton.isDisplayed();
	}

	public static void fillName (String name)
	{
		LOGGER.info("Filling in form with name");
		formContainer.nameInput.sendKeys(name);
	}

	public static void fillBirthDate (String date)
	{
		LOGGER.info("Filling in form with brith date");
		formContainer.birthDateInput.sendKeys(date);
	}

	public static void fillAnswer (String answer)
	{
		LOGGER.info("Filling in form with answer");
		formContainer.answerInput.sendKeys(answer);
	}
	
	public static void clickSubmit ()
	{
		LOGGER.info("clicking on Submit Button");
		//It was necessary to wirte it 4 times to work
		formContainer.submitButton.click();
		formContainer.submitButton.click();
		formContainer.submitButton.click();
		formContainer.submitButton.click();
		
	}
	
}

