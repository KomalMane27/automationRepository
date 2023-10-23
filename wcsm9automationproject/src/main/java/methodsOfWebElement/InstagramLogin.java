package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("1234");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
