package com.dataart.pages;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Thread.sleep;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.apache.commons.validator.UrlValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("http://acc.icpc.org.ua/auth/login")
@At("http://acc.icpc.org.ua/auth/login")
public class LoginPage extends PageObject {

	@FindBy(xpath = "//input[@type='email']")
	WebElementFacade userNameTextField;

	@FindBy(xpath = "//input[@type='password']")
	WebElementFacade passwordTextField;

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

	@FindBy(xpath = "//*[@href='https://github.com/uaoleg/icpc.org.ua']")
	WebElement githubLink;

	@FindBy(xpath = "//*[@href='http://www.dataart.ua']")
	WebElement daLink;

	@FindBy(xpath = "//*[@href='https://twitter.com/IcpcOrgUa']")
	WebElement twitterLink;

	@FindBy(xpath = "//*[@href='mailto:info@icpc.org.ua']")
	WebElement mailtoLink;
	
	@FindBy(xpath="//a[@href='/'][contains(text(), 'News')]")
	public static WebElement newsLink;
	
	@FindBy(xpath="//a[contains (text(),'Docs')]")
	public static WebElement docsLink;
	
	@FindBy(xpath="//a[@href='/team/list']")
	public static WebElement teamsLink;
	
	@FindBy(xpath="//a[@href='/results']")
	public static WebElement resultsLink;
	
	@FindBy(xpath="//a[@href='/qa']")
	public static WebElement qaLink;
	
	@FindBy(xpath="//a[@href='/docs/regulations']")
	public static WebElement regulationsDocsMenuItem;
	
	@FindBy(xpath="//*[@href='/docs/guidance'][contains(text(), 'Guidance')]")
	public static WebElement guidanceDocsMenuItem;
	
	@FindBy(xpath="//a[@class='document-title']")
	public static WebElement docsTitlesGeneralXpath;
        
        @FindBy (xpath="html/body/div[2]/div/div[5]/div[2]/a[1]")
        public static WebElement firstDocLink;
        
        @FindBy (xpath="//*[@href='/qa/ask']")
        public static WebElement askQuestionBtn;
	

	public final static String DA_PAGE_TITLE = "DataArt - разработка программного обеспечения на заказ. Вакансии программиста, работа для программиста в Петербурге, Воронеже.";

	public static final String GITHUB_PAGE_TITLE = "uaoleg/icpc.org.ua · GitHub";

	public static final String TWITTER_PAGE_TITLE = "icpc.org.ua (IcpcOrgUa) on Twitter";

	public static final String MAILTO_LINK_TEXT = "info@icpc.org.ua";
	
	public static final String EN_LANG_CHOOSE = "en";
	
	public static final String RU_LANG_CHOOSE = "ru";
	
	public static final String UK_LANG_CHOOSE = "uk";
	
	public final static String NEWS_PAGE_TITLE = "News - ICPC";
	
	public final static String TEAMS_PAGE_TITLE = "Team - ICPC";
	
	public final static String RESULTS_PAGE_TITLE = "Results - ICPC";
	
	public final static String QA_PAGE_TITLE = "Qa - ICPC";
        
        public final static String LOGIN_PAGE_TITLE = "Auth - ICPC";
	
	public final static String REGULATIONS_DOCS_PAGE_TITLE = "Docs - ICPC";
	
	public final static String GUIDANCE_DOCS_PAGE_TITLE = "Guidance Docs - ICPC";
	
	public final static String DOCS_TITLE_GENERAL_XPATH = "//a[@class='document-title']";
        
        public final static String GUIDANCE_DOCS_MENU_XPATH = "//*[@href='/docs/guidance'][contains(text(), 'Guidance')]";

	public void enterLoginAndPassword(String userName, String password) {

		$(userNameTextField).sendKeys(userName);
		//
		$(passwordTextField).sendKeys(password);

	}

	public void clickLogin() {
		loginButton.click();

	}

	public void dataartLinkClick() {
		daLink.click();
	}

	public void githubLinkClick() {
		githubLink.click();
	}

	public void twitterLinkClick() {
		twitterLink.click();
	}

	public void clickOnRegisterLink() {
		registerLink.click();
	}

	public void clickLogOut() {
		logOut.click();
	}
        
        public void clickAskQuestionBtn(){
            askQuestionBtn.click();
        }

	public String getWelcomeMessage() {

		return welcomeMsg.getText();

	}

	public String getHearer() {

		return $(pageHeader).getText();
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
        
        

	public String getInvalidFlashMessage() {

		System.out.println(flashMsg.getText());
		return flashMsg.getText();

	}

	public String getPageTitle() {

		System.out.println(this.getTitle());
		return this.getTitle();
		
	}

	public void chooseLanguage(String language) {

		Actions builder = new Actions(getDriver());
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		builder.moveToElement(chooseLang).build().perform();
		builder.moveToElement(
				getDriver()
						.findElement(
								By.xpath("//*[contains(@class, 'dropdown dropup language-select')]//*[@data-lang='"
										+ language + "']"))).click().perform();

	}

	public String getEmailLinkTest() {
		return mailtoLink.getText();

	}
	
	public void driverWaitForTitle(){
		  do {
	           try{sleep (500);} catch (InterruptedException e){};
	      } while (this.getPageTitle()== null || this.getPageTitle().equals(""));
	    }
	
	public boolean isElementPresent(WebElement element){
		return element.isDisplayed();
	}
	
	public void newsLinkClick(){
		newsLink.click();
	}
	
	public void teamLinkClick(){
		teamsLink.click();
	}
	
	public void resultLinkClick(){
		resultsLink.click();
	}
	
	public void qaLinkClick(){
		qaLink.click();
	}
        
        public void firstDocLinkClick(){
		firstDocLink.click();
	}
	
	public void chooseDocs(WebElement element) {

		Actions builder = new Actions(getDriver());
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		builder.moveToElement(docsLink).build().perform();
		element(element).waitUntilVisible();
		builder.moveToElement(element).click().perform();
	}
	//костыль для проверки тестов на необходимость wait
	public void driverWait(){
		 WebDriverWait waiting = new WebDriverWait(getDriver(), 30, 1000);
                 waiting.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LoginPage.GUIDANCE_DOCS_MENU_XPATH)));

		 }
	
	
	
	public static int isResourceAvailableByUrl(WebElement el) throws MalformedURLException, IOException {
                String USER_AGENT = "Mozilla/5.0";
                URL u = new URL(el.getAttribute("href"));
                System.out.println(u);
                HttpURLConnection huc = (HttpURLConnection)  u.openConnection(); 
                huc.setRequestMethod("GET"); 
                huc.setRequestProperty("User-Agent", USER_AGENT);
                huc.setRequestProperty("Accept-Language", "en-US,en;q=0.5");      
                huc.setDoOutput(true);
                DataOutputStream wr = new DataOutputStream(huc.getOutputStream());       
                wr.flush();
                wr.close();

                int responseCode = huc.getResponseCode();
                System.out.println("\nSending 'GET' request to URL : " + u);
                // System.out.println("Post parameters : " + urlParameters);
                System.out.println("Response Code : " + responseCode);
                return responseCode; 
         
}
    
          
            
            
            
            

}
    
	



