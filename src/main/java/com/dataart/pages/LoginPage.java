package com.dataart.pages;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://localhost:8080/auth/login")
@At("http://localhost:8080/auth/login")
public class LoginPage extends PageObject {

	@FindBy(id = "j_username")
	private WebElementFacade userNameTextField;

	@FindBy(id = "j_password")
	private WebElementFacade passwordTextField;

	@FindBy(xpath = "//div[@class='form']/form/input")
	WebElementFacade loginButton;

	@FindBy(css = ".welcome")
	WebElementFacade welcomeMsg;

	@FindBy(css = ".flash")
	WebElementFacade flashMsg;

	public void enterLoginAndPassword(String userName, String password) {
		userNameTextField.clear();
		passwordTextField.clear();
		userNameTextField.sendKeys(userName);
		passwordTextField.sendKeys(password);

	}

	public void clickLogin() {
		loginButton.click();

	}

	public String getWelcomeMessage() {

		
		return welcomeMsg.getText();

	}

	public String getFlashMessage() {

		System.out.println(flashMsg.getText());
		return flashMsg.getText();

	}

}
