package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsClass {
  @Test
  public void annotation_TestMethod() {
	  
	  Reporter.log("Test1 annotation",true);
	    
  }
  @BeforeMethod
  public void annotation_BeforeMethod()
  {
	  Reporter.log("BeforeMethod annotation", true);
  }
  @BeforeClass
  public void annotation_BeforeClass() {
	  Reporter.log("BeforeClass annotation", true);
  }
  @AfterClass
  public void annotation_AfterClass() {
	  Reporter.log("AfterClass annotation", true); 
  }
  @BeforeTest
  public void annotation_BeforeTest() {
	  Reporter.log("BeforeTest annotation", true);
  }
  @AfterTest
  public void annotation_AfterTest() {
	  Reporter.log("afterTest annotation", true);
  }
  @AfterMethod
  public void annotation_AfterMethod() {
	  Reporter.log("afterMethod annotation", true);
  }
  @AfterSuite
  public void annotation_AfterSuite() {
	  Reporter.log("afterSuite annotation", true);
  }
  @BeforeSuite
  public void annotation_BeforeSuite() {
	  Reporter.log("BeforeSuite annotation", true);
  }
  @Test
  public void annotation_Test() {
	  Reporter.log("Test2 annotation", true);
  } 
}
