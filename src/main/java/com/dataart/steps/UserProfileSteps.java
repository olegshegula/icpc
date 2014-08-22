package com.dataart.steps;

import org.jbehave.core.annotations.BeforeScenario;

import junit.framework.Assert;

import com.dataart.pages.ProfilePage;
import com.dataart.utils.Vars;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class UserProfileSteps extends ScenarioSteps{

	ProfilePage profilePage;
		
	@Step
	public void user_move_to_general_info_tab(){
		profilePage.clickOn(profilePage.mainInfoTab);
		Assert.assertTrue(profilePage.compatibleWithUrl(Vars.MAININFO_URL));
				
	}
	@Step
	public void user_enter_current_password(String password){
		profilePage.typeInto(profilePage.currentPasswordField, password);
	}
	@Step
	public void user_enter_new_password(String password){
		profilePage.typeInto(profilePage.passwordField, password);
	}
	@Step
	public void user_repeate_new_password(String password){
		profilePage.typeInto(profilePage.passwordRepeatField, password);
	}
	@Step
	public void user_click_change_password_button(){
		profilePage.clickOn(profilePage.changePasswordButton);
		
		profilePage.waitForWithRefresh();
	}
	@Step
	public void user_should_see_sucess_message(String message){
		Assert.assertEquals(profilePage.getSuccessMessage(),message);
	}
	
	@StepGroup
	public void the_user_changs_password_back(){
		user_move_to_general_info_tab();
		user_enter_current_password("1234567");
		user_enter_new_password("123456");
		user_repeate_new_password("123456");
		user_click_change_password_button();
	}
	@Step
	public void user_should_see_error_field_message(String message){
		Assert.assertEquals(message, profilePage.getErrorMessage());
	}
}
