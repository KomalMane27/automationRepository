package assignmentLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions co = new ChromeOptions();

		co.addArguments("--disable-notifications");

		WebDriver driver=new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'desktop-searchBar')]")).sendKeys("kurti");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'desktop-submit')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Women')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'MALHAAR')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'ADA')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Rs. 556 to Rs. 1140')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Pink')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Home & Living')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'navi-link navi-pad ')]")).click();
		Thread.sleep(2000);

		driver.close();
	}

}
