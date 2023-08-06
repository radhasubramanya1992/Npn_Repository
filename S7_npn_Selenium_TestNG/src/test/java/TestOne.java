import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestOne
{

@Test(dependsOnMethods = {"testTempExample"}, priority=2, groups = {"basic"},alwaysRun = true)
@Parameters({"username","password"})
public void TestOneExample(String username,String password)
{
	System.out.println("This is Test One");
	System.out.println("The username is:"+username);
	System.out.println("The password is:"+password);
	
}

@Test(priority=1, groups = {"basic","advanced"})
public void testTempExample()
{
	Assert.assertTrue(false);
	System.out.println("This is Test Temp");
}
}
