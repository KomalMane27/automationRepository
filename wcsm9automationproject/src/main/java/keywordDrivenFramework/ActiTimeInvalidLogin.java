package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();//to launch the browser and close the browser
		bt.openBrowser();
		Flib flib = new Flib();//to read the data from excel file
		int rc = flib.rowCount("./src/main/resources/ActiTimeTestData.xlsx","invalidcreds");
		for(int i=1;i<=rc;i++)
		{
		String invalidUsn = flib.readDataFromExcel("./src/main/resources/ActiTimeTestData.xlsx","invalidcreds", 0, 0);
		String invalidpwd=flib.readDataFromExcel("./src/main/resources/ActiTimeTestData.xlsx","invalidcreds", 0, 1);
		//identify username text box
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys(invalidUsn);
		//identify password textbox
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys(invalidpwd);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
	
		}
		bt.closeBrowser();
		
	}

}
