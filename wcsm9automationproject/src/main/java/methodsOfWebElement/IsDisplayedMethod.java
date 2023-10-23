package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	//Verify the log out link in home page of actitime
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://komalmane/login.do");
		
		//Identify username text box and pass admin
		driver.findElement(By.name("username")).sendKeys("admin");
		//Identify password text box and pass manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//Identify login button and click
		driver.findElement(By.id("loginButton")).submit();
		
		//Identify log out link for verify
		WebElement logoutLinkElement = driver.findElement(By.partialLinkText("Logout"));
		
		//check for logoutLinkElement is displayed or not
		boolean status = logoutLinkElement.isDisplayed();
		System.out.println(status);
		
	}

}
