import org.testng.annotations.Test;

public class TestTwo 
{
	
@Test(priority = 2,groups = "advanced")
public void testTwoExample()
{
	System.out.println("This is Test Two");
}
}
