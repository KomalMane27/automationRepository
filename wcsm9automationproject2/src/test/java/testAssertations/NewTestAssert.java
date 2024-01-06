package testAssertations;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTestAssert {
  @Test
  public void assertMethod() {
	  Reporter.log("Launch Browsers", true);
	  Reporter.log("launch WebApplication by using url", true);
	  Reporter.log("Verify and Validate the loginPage",true);
	  //apply soft assert
	  SoftAssert sa= new SoftAssert();
	  sa.assertEquals(true, false);
	  Reporter.log("Login performed!!!", true);
	  Reporter.log("Verify and Validate the HomePage",true);
	  //apply hard assert
	  Assert.assertEquals(true, false);
	  Reporter.log("User Created!!",true);
	  Reporter.log("Task Created!!",true);
	  sa.assertAll();
  }
}
