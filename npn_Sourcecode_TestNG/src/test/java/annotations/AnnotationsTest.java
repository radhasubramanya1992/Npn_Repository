package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsTest {
  @Test
  public void AnnotationTest1() {
	  System.out.println("This is first test case");
  }
  @BeforeSuite
  public void BeforeSuiteTest() {
	  System.out.println("@BeforeSuite");
  }
  @AfterSuite
  public void AfterSuiteTest() {
	  System.out.println("@AfterSuite");
  }
  @BeforeClass
  public void BeforeClassTest()
  {
	  System.out.println("@BeforeClass");
  }
  @AfterClass
  public void AfterClassTest() {
	  System.out.println("@AfterClass");
  }
  @BeforeMethod
  public void BeforeMethodTest() {
	  System.out.println("@BeforeMethod");
  }
  @AfterMethod
  public void AfterMethodTest() {
	  System.out.println("@AfterMethod");
  }
  @org.testng.annotations.BeforeTest
  public void BeforeTest() {
	  System.out.println("@BeforeTest");
  }
  @org.testng.annotations.AfterTest
  public void AfterTest() {
	  System.out.println("@AfterTest");
  }
  @Test
  public void AnnotationTest2() {
	  System.out.println("This is the SECOND test case");
  }
}
