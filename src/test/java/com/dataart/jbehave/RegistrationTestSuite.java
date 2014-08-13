package com.dataart.jbehave;

import net.thucydides.core.annotations.Steps;
import net.thucydides.jbehave.ThucydidesJUnitStories;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.dataart.steps.UserRegistrationSteps;

public class RegistrationTestSuite extends ThucydidesJUnitStories {
	@Steps
	UserRegistrationSteps userreg;

	@Given("the user is on the Registration page")
	public void givenTheUserIsOnTheLoginPage() {
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
	
	@Then ("user should see the Resend email button")
	public void userShouldSeeTheResendEmailButton(){
		
		userreg.user_should_see_the_Resend_email_button();
	}

}
