package Selenium0125;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest 
{
	WebDriver driver;
	//private - Package level access; protected - class level access; public - project level access
	private ContactusPage contactUsPage;
	private CommonMethods commonMethods;
	private IndustryPage industryPage;
	@BeforeClass
	public void setUp()
	{
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--headless");
		commonMethods = new CommonMethods(driver);
		contactUsPage = new ContactusPage(driver, commonMethods);
		industryPage = new IndustryPage(driver,commonMethods);
		commonMethods.navigateUrl(TestData.url);
		commonMethods.handleCookies();
	}
	
	@Test
	public void contactUsTest()
	{
		contactUsPage.clickContactUs();
		commonMethods.waitForElementToVisible(PageIdentifiers.submitBtn);
		commonMethods.scrollDown(PageIdentifiers.submitBtn);
		boolean isContactEnable = contactUsPage.contactUsEnable();
		Assert.assertTrue(isContactEnable,"The submit button in contact us page is not enabled");		
	}
	@Test
	public void industryTest()
	{
		commonMethods.waitForElementToVisible(PageIdentifiers.industryLink);
		industryPage.clickIndustry();
		String industryAct = commonMethods.getBrowserTitle();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(industryAct);
		Assert.assertTrue(industryAct.contains(TestData.industry),"The industry page is not opened correctly");
	System.out.println("hello");
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
