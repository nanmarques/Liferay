package com.liferay.automated.view;

import java.util.logging.Logger;
import org.openqa.selenium.support.PageFactory;
import com.liferay.automated.containers.FormContainer;
import com.liferay.automated.containers.SuccessfulContainer;
import com.liferay.automated.utils.BrowserDriver;


public class SuccessfulView {
	private static final Logger LOGGER = Logger.getLogger(SuccessfulView.class.getName());
	private static final SuccessfulContainer successfulContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SuccessfulContainer.class);
	
	public static void isDisplayedCheck()
	{
		LOGGER.info("Checking if Successful page is displayed");
		BrowserDriver.waitForElement(successfulContainer.title);
		successfulContainer.title.isDisplayed();
		successfulContainer.subtitle.isDisplayed();
	}

}

