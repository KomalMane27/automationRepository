package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/accounts/login");
		 //identify usernameTB by using tagName 
	    driver.findElement(By.tagName("input")).sendKeys("1234567890");
	    Thread.sleep(2000);
	    
	    //identify passwordTB by using name 
	    driver.findElement(By.name("password")).sendKeys("A@2722");
	    Thread.sleep(2000);
	    driver.findElement(By.id("//div[text()='Log in']")).click();

		WebElement loginButtonElement = driver.findElement(By.xpath("//button[contains(@class,'_acan ')]"));
		boolean status = loginButtonElement.isEnabled();
		System.out.println(status);
		
	}
}
