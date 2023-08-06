import org.testng.annotations.Test;

public class TestTwo 
{
	@Test(priority=1,groups = {"advanced"})
	public void TestTwoExample()
	{
		System.out.println("This is Test Two");
	}
}
