package com.dataart.steps;

import org.junit.Assert;

import com.dataart.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class UserLoginSteps extends ScenarioSteps {

	LoginPage loginPage;

	@Step
	public void is_on_the_login_page() {

		loginPage.open();
	}

	@Step
	public void enter(String userName, String password) {

		loginPage.enterLoginAndPassword(userName, password);
	}

	@Step
	public void click_login_button() {

		loginPage.clickLogin();

	}

	@Step
	public void click_logout_link() {

		loginPage.clickLogOut();
	}

	@Step
	public void should_see_a_page_title(String message) {

		Assert.assertEquals(loginPage.getPageTitle(), message);

	}

	@Step
	public void should_see_invalid_flash_message(String message) {

		Assert.assertEquals(loginPage.getInvalidFlashMessage(), message);

	}

	@Step
	public void click_on_the_Register_now_link() {

		loginPage.clickOnRegisterLink();
	}

	@Step
	public void click_on_the_swich_language_button_and_choose(String language) {

		loginPage.chooseLanguage(language);

	}

	@Step
	public void user_should_see_the_header(String header) {

		Assert.assertEquals(loginPage.getHearer(), header);

	}

	@Step
	public void user_clicks_on_DA_link() {
		loginPage.dataartLinkClick();
	}

	@Step
	public void user_clicks_on_GitHub_link() {
		loginPage.githubLinkClick();
	}

	@Step
	public void user_clicks_on_Twitter_link() {
		loginPage.twitterLinkClick();
	}

	@Step
	public void verify_DA_page() {
		loginPage.goToNewWindow();
		waitABit(3000);
		Assert.assertEquals(LoginPage.DA_PAGE_TITLE,loginPage.getPageTitle());
	}

	@Step
	public void verify_GitHub_page() {
		loginPage.goToNewWindow();
		waitABit(5000);
		Assert.assertEquals(LoginPage.GITHUB_PAGE_TITLE,loginPage.getPageTitle());
	}

	@Step
	public void verify_Twitter_page() {
		loginPage.goToNewWindow();
		waitABit(3000);
		Assert.assertEquals(LoginPage.TWITTER_PAGE_TITLE,loginPage.getPageTitle());
	}

	@Step
	public void verify_project_email() {
		Assert.assertEquals(LoginPage.MAILTO_LINK_TEXT,loginPage.getEmailLinkTest());
	}
	@Step
	public void the_user_click_on_the_forget_password_link(){
		loginPage.clickOnForgetLink();
		
	}
	
	@StepGroup
	public void the_user_is_signed_in_with(String userName, String password){
		is_on_the_login_page();
		enter(userName,password);		
		click_login_button();
	}
	

}
