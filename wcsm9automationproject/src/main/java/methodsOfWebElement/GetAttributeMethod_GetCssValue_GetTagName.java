package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetAttributeMethod_GetCssValue_GetTagName {
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			//get the attribute value of username textbox i.e name attribute
			WebElement usnTB = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			String attributeValue = usnTB.getAttribute("class");
			System.out.println(attributeValue);
			
			//get the case property of username textbox i.e color
			String CssValue = usnTB.getCssValue("color");
			//String CssValue = usnTB.getCssValue("height");//width
			System.out.println(CssValue);
			
			//get the TagName of usernameText box
		    String TagName = usnTB.getTagName();
		    System.out.println(TagName);
		}
}
