import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne 
{
@Test(dependsOnMethods = {"testTempExample"},priority = 2,alwaysRun = true,groups = {"basic"})
public void testOneExample()
{
	System.out.println("This is Test One");
}

@Test(priority = 1,groups = {"basic","advanced"})
public void testTempExample()
{
	//Assert.assertTrue(false);
	System.out.println("This is Test Temp");
}
}
