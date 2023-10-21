package assignmentLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notification");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.switchTo().activeElement().sendKeys("pune");
		
		//driver.findElement(By.xpath("//a[text()='26']")).click();
		//driver.findElement(By.xpath("//a[contains(@class,'tns-c19-13')[2]]S")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@aria-label,'Menu Meals')]")).click();
	}

}
