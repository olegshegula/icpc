package com.dataart.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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

	@FindBy(xpath = "html/body/nav/div/div/ul[2]/li/a")
	WebElementFacade chooseLang;

	@FindBy(xpath = "//*[@id='main']//td[2]")
	WebElementFacade pageHeader;
	
	
	@FindBy(xpath = "//*[@id='main']//a[text()='Logout']")
	WebElementFacade logOut;

	

	public void enterLoginAndPassword(String userName, String password) {
		//$(userNameTextField).clear();
		//$(passwordTextField).clear();
		$(userNameTextField).type(userName);
		$(passwordTextField).type(password);

	}

	public void clickLogin() {
		loginButton.click();

	}

	public void clickOnRegisterLink() {
		registerLink.click();
	}

	public void clickLogOut() {
		logOut.click();
	}

	public String getWelcomeMessage() {

		return welcomeMsg.getText();

	}

	public String getHearer() {

		return $(pageHeader).getText();
	}

	public String getInvalidFlashMessage() {

		System.out.println(flashMsg.getText());
		return flashMsg.getText();

	}

	public String getPageTitle() {

		System.out.println(this.getTitle());
		return this.getTitle();
	}

	public void chooseLanguage(String language)  {
		
		Actions builder = new Actions(getDriver());
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		builder.moveToElement(chooseLang).build().perform();
		builder.moveToElement(getDriver().findElement(By.xpath("//*[contains(@class, 'dropdown dropup language-select')]//*[@data-lang='"+language+"']"))).click().perform();
		
				
		}
		

	}


