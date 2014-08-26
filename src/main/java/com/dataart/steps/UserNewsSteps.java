package com.dataart.steps;

import java.awt.AWTException;
import java.awt.Robot;

import org.apache.log4j.helpers.Loader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.UploadFile;

import com.dataart.model.News;
import com.dataart.pages.NewsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class UserNewsSteps extends ScenarioSteps {

	NewsPage newsPage;

	@Step
	public void user_go_to_news_menu() {
		newsPage.goToNews();
	}

	@Step
	public void user_click_on_add_news_button() {
		newsPage.clickOn(newsPage.addNewsButton);
	}

	@Step
	public void user_enter_the_title() {
		News news = new News();
		news.setTitle("5 Popular Open Source Test Management Tools "
				+ (int) (Math.random() * 10000 + 1));		
		newsPage.typeInto(newsPage.titleField, news.getTitle());
	}

	@Step
	public void user_enter_enter_the_body() {

	 News news = new News();
		news.setBody(" As a substitute to the multiple applications that have been designed to manage either one or two steps of the testing process, QA teams are now dependent on the various test management tools. "
				+ (int) (Math.random() * 10000 + 1));		
		WebElement frame = getDriver().findElement(By.
				tagName("iframe"));
		newsPage.getDriver().switchTo().frame(frame);
		WebElement memo = getDriver().findElement(By.cssSelector("body"));
		memo.click();		
		memo.sendKeys(news.getBody());
		getDriver().switchTo().defaultContent();
		newsPage.saveNewsButton.click();
		waitABit(500);
		
	}
	@Step
	public void user_click_on_save_news_button(){
		newsPage.saveNewsButton.click();
		
		
	}
	@Step
	public void user_click_on_publish_button(){
		newsPage.clickOn(newsPage.publishButton);
	}
	@Step
	public void user_should_see_created_news_on_the_top_of_news_page(){
		System.out.println(newsPage.getFirstNewsTitle());
		Assert.assertTrue((newsPage.getFirstNewsTitle()).contains("5 Popular Open Source Test Management Tools")); 
	
	}
	@Step
	public void user_choose_a_picture(String name){
		//newsPage.upload("src/test/resources/images2.jpg").to(newsPage.pictureForNews);
		
		
		
		newsPage.pictureForNews.sendKeys(Loader.getResource("images2.jpg").getFile().substring(1).replace('/','\\'));
		
	}
}
