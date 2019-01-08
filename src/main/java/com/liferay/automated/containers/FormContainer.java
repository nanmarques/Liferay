package com.liferay.automated.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FormContainer {
	
	@FindBy(how = How.XPATH, using = "//*[contains(@id, 'QualÉSeuNome')]")
    public WebElement nameInput;

	@FindBy(how = How.XPATH, using = "//*[@aria-label='Qual é a data do seu nascimento?']")
    public WebElement birthDateInput;

	@FindBy(how = How.XPATH, using = "//*[contains(@id, 'PorqueVocêIngressouNaÁreaDeTestes')]")
    public WebElement answerInput;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit') and not(@disabled)]")
    public WebElement submitButton;

	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'party rock')]")
    public WebElement partyRock;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div/div/div/div/div/form/div/div[2]/div/div/div[1]/div/div/div[1]/div[1]/div/div/div[2]")
    public WebElement nameRequired;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div/div/div/div/div/form/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/div/div/div[2]")
    public WebElement birhDateRequired;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div/div/div/div/div/div/form/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/div/div[2]")
    public WebElement answerRequired;
	
}