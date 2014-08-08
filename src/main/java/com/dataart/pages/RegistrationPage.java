package com.dataart.pages;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageObject {

	@FindBy(xpath = "//input[@value='Register']")
	WebElementFacade registerButton;
	@FindBy(xpath = "//input[@name='name']")
	WebElementFacade nameTextField;
	@FindBy(xpath = "//input[@name='fname']")
	WebElementFacade userFirstNameTextField;
	@FindBy(xpath = "//input[@name='lname']")
	WebElementFacade userLastNameTextField;
	@FindBy(xpath = "//input[@name='password']")
	WebElementFacade passwordTextField;
	@FindBy(xpath = "//input[@name='passwordConfirm']")
	WebElementFacade confirmPasswordTextField;
	@FindBy(xpath = "//select[@name='role']")
	WebElementFacade selectRole;
	@FindBy(css =".welcome")
	WebElementFacade welcomeMsg;

	public void registrationLinkClick() {
		registerButton.click();
	}

	public String getWelcomeMessage() {

		return welcomeMsg.getText();

	}	
	//	public void enterValidCredentials


}
