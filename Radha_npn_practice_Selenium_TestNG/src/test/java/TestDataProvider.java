import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider 
{
@Test(dataProvider = "testData")
public void dataProvider(String username, String password)
{
	System.out.println("The username is:::"+username);
	System.out.println("The password is:::"+password);
}

@DataProvider(name="testData")
public  Object[][] myData()
{
	return new Object[][] {{"test1@test.com","pass1"},{"test2@test.com","pass2"},{"test3@test.com","pass3"}};
}
}
