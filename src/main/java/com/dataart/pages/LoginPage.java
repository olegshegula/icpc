package com.dataart.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://acc.icpc.org.ua/auth/login")
@At("http://acc.icpc.org.ua/auth/login")
public class LoginPage extends PageObject {

	@FindBy(xpath = "//input[@type='email']")
	private WebElementFacade userNameTextField;

	@FindBy(xpath = "//input[@type='password']")
	private WebElementFacade passwordTextField;

	@FindBy(xpath = "//button[@type='submit']")
	WebElementFacade loginButton;

	@FindBy(css = ".welcome")
	WebElementFacade welcomeMsg;

	@FindBy(css = ".alert.alert-danger")
	WebElementFacade flashMsg;
	
	@FindBy(css = ".form-group>b>a")
	WebElementFacade registerLink;
	
	@FindBy(xpath ="//*[@id='main']//a[text()='Logout']")
	WebElementFacade logOut;
	

	public void enterLoginAndPassword(String userName, String password) {
		userNameTextField.clear();
		passwordTextField.clear();
		userNameTextField.sendKeys(userName);
		passwordTextField.sendKeys(password);

	}

	public void clickLogin() {
		loginButton.click();

	}
	
	public void clickOnRegisterLink(){
		registerLink.click();
	}
	
	public void clickLogOut(){
		logOut.click();
	}

	public String getWelcomeMessage() {

		
		return welcomeMsg.getText();

	}

	public String getInvalidFlashMessage() {

		System.out.println(flashMsg.getText());
		return flashMsg.getText();

	}
	
	public String getPageTitle() {
		
		System.out.println(this.getTitle());
		return this.getTitle();
	}
	
	

}
