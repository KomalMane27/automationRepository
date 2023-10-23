package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptinMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/manes/OneDrive/Desktop/wcsm9webElement/singleSelectDropdown.html");
		WebElement dropDown1 = driver.findElement(By.id("idd"));//single select dropDown
		Select sel = new Select(dropDown1);//handle the dropdown
		Thread.sleep(2000);
		sel.selectByValue("v7");//select the option
		Thread.sleep(2000);
		WebElement firstOpt = sel.getFirstSelectedOption();//first selected option
		System.out.println(firstOpt.getText());//To get the option which is selected first
		
		//Multiselect dropdown
		Thread.sleep(2000);
		driver.navigate().to("file:///C:/Users/manes/OneDrive/Desktop/wcsm9webElement/multiSelectDropDown.html");
		WebElement dropDown2 = driver.findElement(By.id("idd"));//identify the dropDown
		Select sel2 = new Select(dropDown2);//handle the multi select dropDown
		//To select the multiple option from multi select dropDown
		for(int i=4;i<8;i++)
		{
			Thread.sleep(2000);
			sel2.selectByIndex(i);
			
		}
		//To get the option which is selected first
		Thread.sleep(2000);
		System.out.println(sel2.getFirstSelectedOption().getText());

	}

}
