package Selenium_Automation.Automation_0118;

import org.openqa.selenium.WebDriver;

public class IndustryPage 
{
	private WebDriver driver;
	CommonMethods commMethods;

	public IndustryPage(WebDriver driver,CommonMethods commMethods)
	{
		this.driver = driver;
		this.commMethods = commMethods;
	}
	public void clickIndustry()
	{
		driver.findElement(PageIdentifiers.industryLink).click();
	}
}

