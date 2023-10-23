package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://komalmane/login.do");
		Thread.sleep(2000);
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		Thread.sleep(2000);
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys("manager");
		Thread.sleep(2000);
		
		//clear the username and password textbox
		usnTB.clear();
		passTB.clear();
		
		//click on check box
		driver.findElement(By.name("remember")).click();
		//click on the login button
		driver.findElement(By.id("loginButton")).click();
	}

}
