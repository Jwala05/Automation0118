package Selenium_Automation.Automation_0118;

	import org.openqa.selenium.WebDriver;
	public class ContactusPage 
	{
		private WebDriver driver;
		private CommonMethods commonMethods;
		public ContactusPage(WebDriver driver,CommonMethods commonMethods)
		{
			this.driver = driver;
			this.commonMethods = commonMethods;
		}
		public void clickContactUs()
		{
			driver.findElement(PageIdentifiers.contactUs).click();				
		}
		public void waitForSubmitButton()
		{
			commonMethods.waitForElementToVisible(PageIdentifiers.submitBtn);
		}
		public void scrollToSubmit()
		{
			commonMethods.scrollDown(PageIdentifiers.submitBtn);
		}
		public boolean contactUsEnable()
		{
			return driver.findElement(PageIdentifiers.submitBtn).isEnabled();
		}
		

	}
