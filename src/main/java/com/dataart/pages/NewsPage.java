package com.dataart.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://acc.icpc.org.ua")
@At("http://acc.icpc.org.ua")
public class NewsPage extends PageObject {

	@FindBy(xpath = "//*[@class='nav navbar-nav']/li/a")
	List<WebElement> mainMenuList;
	@FindBy(css = ".btn.btn-success.btn-lg")
	public WebElementFacade addNewsButton;
	@FindBy(css = "#uploadNewsImages")
	public WebElement uploadImage;
	@FindBy(xpath = "//input[@name='title']")
	public WebElementFacade titleField;
	@FindBy(css = ".cke_editable.cke_editable_themed.cke_contents_ltr>p")
	public WebElementFacade memoField;
	@FindBy(css = ".btn.btn-primary.save-news.btn-lg.pull-left")
	public WebElementFacade saveNewsButton;
	@FindBy(css = ".btn.btn-success.btn-lg")
	public WebElementFacade publishButton;
	@FindBy(xpath = "//*[@id='main']//h2/a[1]")
	public List<WebElement> newsTitles;
	@FindBy(css = ".btn.btn-danger")
	public List<WebElement> hideNewsList;
	@FindBy(xpath = "//button[@data-status='1']")
	public List<WebElement> publishNewsList;
	@FindBy(css = ".page-header.clearfix>small>a")
	public WebElementFacade previewLink;

	@FindBy(xpath = "//input[@type='file']")
	public WebElementFacade pictureForNews;
	@FindBy(css = ".page-header>h1")
	public WebElementFacade newsTitle;
	@FindBy(xpath="//*[@id='main']/div/p[2]")
	public WebElementFacade newsBody;
	@FindBy(css=".btn.btn-link")
	public List<WebElement> editList;
	@FindBy(xpath ="//h2[@class='news-title']/a[contains(@href,'/news/view')]")
	public List<WebElement> titleNewsList;

	public void goToNews() {
		mainMenuList.get(0).click();
	}

	public void goToNewWindow() {
		String parentWindow = getDriver().getWindowHandle();
		Set<String> handles = getDriver().getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				getDriver().switchTo().window(windowHandle);

			}
		}
	}

	public String getFirstNewsTitle() {
		return newsTitles.get(0).getText();
	}

	public String getNewsTitle() {
		System.out.println(newsTitle.getText());
		return newsTitle.getText();
	}
	public String getNewsBody(){
		System.out.println(newsBody.getText());
		return newsBody.getText();
	}
	public void loadImage(){
		upload("src/test/resources/images2.jpg").to(pictureForNews);
	}
}
