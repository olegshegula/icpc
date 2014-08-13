package com.dataart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.dataart.model.User;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://acc.icpc.org.ua/auth/signup")
public class RegistrationPage extends PageObject {

	@FindBy(name = "firstNameUk")
	// @FindBy(xpath =".//*[@id='main']/div/div[4]/div/div[2]/div/div[1]/input")
	WebElementFacade firstName;
	@FindBy(name = "middleNameUk")
	WebElementFacade middleName;
	@FindBy(name = "lastNameUk")
	WebElementFacade lastName;
	@FindBy(name = "email")
	WebElementFacade email;
	@FindBy(name = "password")
	WebElementFacade password;
	@FindBy(name = "passwordRepeat")
	WebElementFacade passwordRepeat;

	@FindBy(css = ".btn.btn-default [value='student']")
	WebElementFacade studentRole;

	@FindBy(css = ".select2-chosen")
	WebElementFacade schoolList;
	@FindBy(name = "recaptchaIgnore")
	WebElementFacade recaptchaIgnore;
	@FindBy(name = "rulesAgree")
	WebElementFacade rulesAgree;

	@FindBy(xpath = "//*[@id='main']//p[1]")
	WebElementFacade confirmMessage;
	@FindBy(css = ".signup.btn.btn-primary.btn-lg")
	WebElementFacade signUpButton;
	
	@FindBy(css = ".help-block")
	List<WebElementFacade> listOfWarrnings;

	public String getPageTitle() {

		System.out.println(getTitle());
		return getTitle();
	}

	public void enterCredentials() {
		User user = new User();

		user.setFirstNameField("Vasya");
		user.setMiddleNameField("Vasiliy");
		user.setLastNameField("Vasilievich");
		user.setEmailField("Den" + (int) (Math.random() * 10000 + 1)+"@mail.ru");
		user.setPasswordField("123123123");
		user.setPasswordRepeatField("123123123");
		user.setRole("student");
		user.setSchool("дн");

		$(firstName).type(user.getFirstNameField());
		$(middleName).type(user.getMiddleNameField());
		$(lastName).type(user.getLastNameField());
		$(email).type(user.getEmailField());
		$(password).type(user.getPasswordField());
		$(passwordRepeat).type(user.getPasswordRepeatField());
		Actions builder = new Actions(getDriver());
		builder.moveToElement(schoolList).click().build().perform();
		$(getDriver().findElement(By.xpath("//*[@id='select2-drop']//input")))
				.type(user.getSchool()).sendKeys(Keys.ENTER);

		$(recaptchaIgnore).click();
		$(rulesAgree).click();
	}

	public void clickSignUp() {

		$(signUpButton).click();
	}

	public String getConfirmationMessage() {
		return confirmMessage.getText();
	}
	
	public int getNumberOfWarrnings(){
		System.out.println(listOfWarrnings.size());
		return listOfWarrnings.size();
	}

}
