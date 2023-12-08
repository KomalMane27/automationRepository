package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//store all the module of homepage
	@FindBy(xpath = "//div[text()='Time-Track']/following-sibling::div/img")private WebElement Time_Track;
	@FindBy(xpath = "//div[text()='Tasks']/following-sibling::img")private WebElement Tasks;
	@FindBy(xpath = "//div[text()='Reports']/following-sibling::img")private WebElement Reports;
	@FindBy(xpath = "//div[text()='Users']/following-sibling::img")private WebElement Users;
	@FindBy(xpath = "//div[text()='Work Schedule']/following-sibling::img")private WebElement WorkSchedule;
	@FindBy(xpath = "//div[text()='Settings']/following-sibling::img")private WebElement Settings;
	@FindBy(partialLinkText = "Logout")private WebElement Logout;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getTime_Track() {
		return Time_Track;
	}
	public WebElement getTasks() {
		return Tasks;
	}
	public WebElement getReports() {
		return Reports;
	}
	public WebElement getUsers() {
		return Users;
	}
	public WebElement getWorkSchedule() {
		return WorkSchedule;
	}
	public WebElement getSettings() {
		return Settings;
	}
	public WebElement getLogout() {
		return Logout;
	}
	public void click_on_Time_Track_Module()
	{
		Time_Track.click();
	}
	public void click_on_Tasks()
	{
		Tasks.click();
	}
	public void click_on_Reports()
	{
		Reports.click();
	}
	public void click_on_User()
	{
		Users.click();
	}
	public void click_on_work_schedule()
	{
		 WorkSchedule.click();
	}
	public void click_on_setting()
	{
		Settings.click();
		
	}
	public void click_on_Logout()
	{
		Logout.click();
	}
	

}
