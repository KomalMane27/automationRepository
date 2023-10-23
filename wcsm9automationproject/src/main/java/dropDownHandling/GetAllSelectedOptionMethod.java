package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/manes/OneDrive/Desktop/wcsm9webElement/multiSelectDropDown.html");
		//Multiselect dropdown
		WebElement menu = driver.findElement(By.id("idd"));
		Select sel = new Select(menu);
		//select multiple option from menu dropdown
		for(int i=0;i<4;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		//read only the selected option from menu
		List<WebElement> allops = sel.getAllSelectedOptions();
		//by using for loop
/*		for(int i=0;i<allops.size();i++)
		{
			String op = allops.get(i).getText();
			Thread.sleep(2000);
			System.out.println(op);
		}*/
		//by using for each loop
		for(WebElement opt:allops)
		{
			String op = opt.getText();
			Thread.sleep(2000);
			System.out.println(op);
		}
		
	
	}

}
