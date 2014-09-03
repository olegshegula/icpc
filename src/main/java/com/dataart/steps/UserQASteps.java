package com.dataart.steps;

import org.junit.Assert;



import com.dataart.model.Tag;
import com.dataart.pages.QaPage;
import com.dataart.utils.Table;
import com.dataart.utils.Vars;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class UserQASteps extends ScenarioSteps {
	QaPage qaPage;
	Tag newtag = new Tag();

	@Step
	public void is_on_the_qa_page() {

		qaPage.open();
	}
	@Step
	public void user_click_on_manage_tabs_button(){
		qaPage.clickOn(qaPage.manageTagsButton);
		qaPage.waitForTitleToAppear(Vars.QA_TITLE);
	}
	@Step
	public void user_click_on_create_tab_button(){
		qaPage.clickOn(qaPage.createTagButton);
		qaPage.waitForTitleToAppear(Vars.QA_CREATE_TAB_TITLE);
	}
	@Step
	public void user_enter_title_field(){
		newtag.setTitle("java"+(int) (Math.random() * 10000 + 1));
		qaPage.titleTagField.clear();
		qaPage.typeInto(qaPage.titleTagField, newtag.getTitle());
		
	}
	@Step
	public void user_enter_description_field(){
		newtag.setDescription("Some description"+(int) (Math.random() * 10000 + 1));
		qaPage.descriptionTagField.clear();
		qaPage.typeInto(qaPage.descriptionTagField, newtag.getDescription());
	}
	@Step
	public void user_click_save_button(){
		
		qaPage.clickOn(qaPage.saveButton);
	}
	@Step
	public void user_should_see_a_new_tag_with_name_and_description(){
		
		Assert.assertTrue(Table.isTagNameExistInTable(qaPage.tagsTable, newtag.getTitle()));
		Assert.assertTrue(Table.isTagDescriptionExistInTable(qaPage.tagsTable, newtag.getDescription()));
		
	}
	@Step
	public void user_click_on_delete_button(){
	 double pre = Table.getRowsNumber(qaPage.tagsTable);	 
		qaPage.clickOn(qaPage.deleteButtonList.get(0));
		waitABit(200);
		qaPage.clickOn(qaPage.confirmButton);
		waitABit(200);
		getDriver().navigate().refresh();
	 double post = Table.getRowsNumber(qaPage.tagsTable);	
	 Assert.assertTrue(pre>post);
	}
	@Step
	public void user_click_edit_button(){
		qaPage.clickOn(qaPage.editButtonList.get(0));
		waitABit(200);
		
	}
	@Step
	public void user_should_see_a_new_tag_with_name(){
		
		Assert.assertTrue(Table.isTagNameExistInTable(qaPage.tagsTable, newtag.getTitle()));
				
	}
	@Step
	public void user_should_see_warrning(String message){
		Assert.assertEquals(message,qaPage.warrningMessage.getText());
	}
	
	@Step
	public void user_clicks_on_Ask_question_button(){
		qaPage.askQuestionButton.click();
	}
	
}
