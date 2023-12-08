package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActitimeValidLogin extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		//launch the browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//to read the data from property file
		Flib flib = new Flib();
		
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties","Username"));
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties","Password"));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.closeBrowser();
	}
}
