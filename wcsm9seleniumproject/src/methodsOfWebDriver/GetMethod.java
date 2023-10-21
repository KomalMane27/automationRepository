package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		// TO launch the chrome browser
   WebDriver driver = new ChromeDriver();
      //maximize the chrome browser
   driver.manage().window().maximize();
   
   driver.get("https://www.primevideo.com/");
   Thread.sleep(2000);
   driver.close();
	}

}
