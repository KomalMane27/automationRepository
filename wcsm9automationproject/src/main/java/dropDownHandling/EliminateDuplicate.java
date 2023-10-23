package dropDownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/manes/OneDrive/Desktop/wcsm9webElement/singleSelectDropdown.html");
		//identify dropdown and store it in ref variable
		WebElement menuDropDown = driver.findElement(By.id("idd"));
		//get all the options of menuDropDown
		Select sel = new Select(menuDropDown);
		List<WebElement> allops = sel.getOptions();
		//To eliminate duplicate we use HashSet
		HashSet<String> hs = new HashSet<String>();
		Thread.sleep(2000);
		//read the list by using for loop and eliminates duplicates
		for(int i=0;i<allops.size();i++)
		{
			WebElement op = allops.get(i);
			//get the text of webElement
			String dropDownOption = op.getText();
			Thread.sleep(2000);
			//add the dropDownOption into hashSet and remove duplicates from DropDown
			hs.add(dropDownOption);
			
		}
		Thread.sleep(2000);
		//read the options from hashset by using for each loop
		for(String opt:hs)
		{
			Thread.sleep(2000);
			System.out.println(opt);
		}
		
		
	}

}
