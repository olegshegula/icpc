package com.dataart.steps;

import org.junit.Assert;

import com.dataart.model.User;
import com.dataart.pages.RegistrationPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.junit.annotations.Qualifier;

public class UserRegistrationSteps extends ScenarioSteps {

	public UserRegistrationSteps(Pages pages) {
		super(pages);

	}

	RegistrationPage registrationPage;

	public String firstName;
	public String middleName;
	public String lastName;
	public String email;
	public String password;
	public String passwordRepeat;
	public String role;
	public String school;

	@Qualifier
    public String getQualifier() {
        return firstName;
    }
	@Step
	public void is_on_the_registration_page() {

		registrationPage.open();
	}

	@Step
	public void enter_all_correct_credentials() {
		registrationPage.enterCredentials();
	}

	@Step
	public void click_Sign_up() {

		registrationPage.clickSignUp();
	}

	@Step
	public void user_should_see_the_E_mail_confirmation_message(String message) {
		Assert.assertEquals(registrationPage.getConfirmationMessage(), message);

	}

	@Step
	public void user_should_see_the_warrning_messages_about_blank_fields(
			int numbers) {
		Assert.assertEquals(registrationPage.getNumberOfWarrnings(), numbers);

	}

	@Step
	public void user_should_see_the_Resend_email_button() {

		Assert.assertTrue(registrationPage.isResendButtonExist());
	}

	@Step
	public void enter_all_correct_credentials_form_file_source() {
		registrationPage.enterCredentialsFromCSV(firstName,middleName,lastName,email,password,passwordRepeat,role,school);
	}
	@Step
	public void enter_not_unique_credentials(){
		registrationPage.enterNotUniqueCredentials();
	}
	@Step
	public void user_should_see_DBerror_message(String message){
		Assert.assertEquals(registrationPage.getErrorDBMessage(),message);
		
	}
	@Step
	public void user_enter_all_correct_credentials(){
		registrationPage.userEnterAllCorrectCredentials();
	}
	@Step
	public void user_check_his_emailbox_and_click_on_the_confirmation_link(String email, String password){
		registrationPage.checkGmailAndGetLink(email, password);
	}
	
}
