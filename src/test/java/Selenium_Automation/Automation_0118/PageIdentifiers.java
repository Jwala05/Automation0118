package Selenium_Automation.Automation_0118;

import org.openqa.selenium.By;

public class PageIdentifiers 
{
	//contact us page locators
	public final static By contactUs = By.cssSelector("a.button.-small.btn-optional");
	public final static By submitBtn = By.xpath("//button[text()='Submit']");
	//industry page locators
	public final static By industryLink = By.xpath("//ul[@id='menu-primary']/li[2]/a");
}