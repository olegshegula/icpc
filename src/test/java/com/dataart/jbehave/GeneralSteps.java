package com.dataart.jbehave;

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.StepFactory;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.junit.runner.RunWith;

import static net.thucydides.core.steps.StepData.withTestDataFrom;

import com.dataart.steps.UserLoginSteps;
import com.dataart.steps.UserRegistrationSteps;

public class GeneralSteps {

	@ManagedPages
	Pages pages;

	@Steps
	UserRegistrationSteps userreg;

	@Steps
	UserLoginSteps user;

	@Given("the user is on the Login page")
	public void givenTheUserIsOnTheLoginPage() {
		user.is_on_the_login_page();

	}

	@When("the user enters name: $userName and password: $password and click the 'login' button")
	public void whenTheUserEnterLoginAndPassword(String userName,
			String password) {
		user.enter(userName, password);
		user.click_login_button();

	}

	@Then("user should see a page title $message")
	public void userShouldSeeAPageTitleMessage(String message) {

		user.should_see_a_page_title(message);

	}

	@Then("user should see invalid flash message $message")
	public void userShouldSeeAFlashMessage(String message) {

		user.should_see_invalid_flash_message(message);

	}

	@When("the user click the login button")
	public void clickLoginButton() {

		user.click_login_button();
	}

	@Then("user loged out")
	public void clickLogoutLink() {

		user.click_logout_link();
	}

	@When("the user enters name: $username and click the 'login' button")
	public void userEntersLoginAndClicksButton(String userName) {
		user.enter(userName, "");
		user.click_login_button();
	}

	@When("the user enters password: $password and click the 'login' button")
	public void userEntersPasswordAndClicksButton(String password) {
		user.enter("", password);
		user.click_login_button();
	}

	@When("the user click on the Register now link")
	public void the_user_click_on_the_Register_now_link() {
		user.click_on_the_Register_now_link();
	}

	@When("the user click on the swich language button and choose $Русский")
	public void userClickOnTheSwichLanguageButtonAndChoose(String language) {

		user.click_on_the_swich_language_button_and_choose(language);
	}

	@Then("user should see the header $header")
	public void userShouldSeeTheHeader(String header) {

		user.user_should_see_the_header(header);
	}

	@When("the user click on the DA link")
	public void userClicksOnDALink() {
		user.user_clicks_on_DA_link();
	}

	@Then("user should be sent to DataArt page")
	public void verifyDAPage() {
		user.verify_DA_page();
	}

	@When("the user click on the GitHub link")
	public void userClicksOnGitHubLink() {
		user.user_clicks_on_GitHub_link();
	}

	@Then("user should be sent to GitHub's project page")
	public void verifyGithubPage() {
		user.verify_GitHub_page();
	}

	@When("the user click on the Twitter link")
	public void userClicksOnTwitterLink() {
		user.user_clicks_on_Twitter_link();
	}

	@Then("user should be sent to Twitter's project page")
	public void verifyTwitterPage() {
		user.verify_Twitter_page();
	}

	@Then("user should see correct project's email")
	public void verifyProjectEmail() {
		user.verify_project_email();
	}

	@Given("the user is on the Registration page")
	public void givenTheUserIsOnTheRegisterPage() {
		userreg.is_on_the_registration_page();

	}

	@When("enter all correct credentials")
	public void enterAllCorrectCredentials() {
		userreg.enter_all_correct_credentials();

	}

	@When("user click Sign up")
	public void clickSignUp() {
		userreg.click_Sign_up();
	}

	@Then("user should see the E-mail confirmation message $message")
	public void userShouldSeeTheEMailConfirmationMessage(String message) {

		userreg.user_should_see_the_E_mail_confirmation_message(message);
	}

	@Then("user should see $7 warrning messages about blank fields")
	public void userShouldSeeTheWarrningMessagesAboutBlankFields(int number) {

		userreg.user_should_see_the_warrning_messages_about_blank_fields(number);
	}

	@Then("user should see the Resend email button")
	public void userShouldSeeTheResendEmailButton() {

		userreg.user_should_see_the_Resend_email_button();
	}

	@When("enter all correct credentials form file source")
	public void userEnterAllCorrectCredentialsFormFileSource() throws Throwable {
		StepFactory factory = new StepFactory(pages);
		withTestDataFrom("/RegistrationData.csv").usingFactory(factory)
				.run(userreg).enter_all_correct_credentials_form_file_source();
		// userreg.user_should_see_the_Resend_email_button();
	}

	@When("enter not unique credentials")
	public void userEnterNotUniqueCredentials() {

		userreg.enter_not_unique_credentials();
	}

	@Then("user should see error message $message")
	public void userShouldSeeErrorMessage(String message) {
		userreg.user_should_see_DBerror_message(message);
	}

	@When("user enter all correct credentials")
	public void userEnterAllCorrectCredentials() {
		userreg.user_enter_all_correct_credentials();
	}

	@When("user check his emailbox $email $password and click on the confirmation link")
	public void userCheckHisEmailbox(String email, String password) {
		userreg.user_check_his_emailbox_and_click_on_the_confirmation_link(
				email, password);
	}

	@Then("user should see the verified E-mail confirmation message $message")
	public void userShouldSeeTheVerifiedEmailConfirmationMessage(String message) {
		userreg.user_should_see_the_verified_Email_confirmation_message(message);
	}

	@When("user click on go to login page link")
	public void userClickOnGoToLoginPageLink() {
		userreg.user_click_on_go_to_login_page_link();
	}

	@Then("user click on Resend email button and check email")
	public void user_click_Sign_up() {
		userreg.user_click_on_Resend_email_button();
	}

}
