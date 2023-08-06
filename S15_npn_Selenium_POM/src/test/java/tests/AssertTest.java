package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest 
{
	SoftAssert verify = new SoftAssert();
@Test(priority=1)
public void AssertOne()
{
	System.out.println("Test one - Assert True");
	Assert.assertTrue(true);
	System.out.println("Test one - Assert False");
	Assert.assertFalse(true);
	System.out.println("Test one - Assert Equals");
	Assert.assertEquals("Ok", "Ok");
}

@Test(priority=2)
public void AssertTwo()
{
	System.out.println("Test two - Assert True");
	verify.assertTrue(true);
	System.out.println("Test two - Assert False");
	verify.assertFalse(true);
	System.out.println("Test two - Assert Equals");
	verify.assertEquals("Ok", "Ok");
	verify.assertAll();
}
}
