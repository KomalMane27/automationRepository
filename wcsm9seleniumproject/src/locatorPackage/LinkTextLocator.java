package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/manes/OneDrive/Desktop/wcsm9webElement/Link.html");
		
		//identify Link by using linktextLocator
		driver.findElement(By.linkText("seleniumLink")).click();
	}

}
