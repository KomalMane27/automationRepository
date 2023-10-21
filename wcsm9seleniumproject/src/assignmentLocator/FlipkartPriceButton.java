package assignmentLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPriceButton {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//handle hidden division popup
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		//
		driver.findElement(By.name("q")).sendKeys("mobiles");
		//identify search icon and click
		driver.findElement(By.xpath("//button[contains(@aria-label,'Search for Products, Brands and More')]")).click();
		//print the price of 2nd option
		
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		
	}

}
