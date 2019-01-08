package com.liferay.automated.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SuccessfulContainer {

	@FindBy(how = How.XPATH, using = "//*[@id=\"form-wrapper\"]/div/div/div/h1")
    public WebElement title;

	@FindBy(how = How.XPATH, using = "//*[@id=\"form-wrapper\"]/div/div/div/h5")
    public WebElement subtitle;

}