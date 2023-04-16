import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

public class WriteTextData 
{
@Test
public void writeTextData() throws IOException 
{
	FileOutputStream fos = new FileOutputStream("src\\test\\resources\\empty.txt");
	
	String myString = "Had your lunch?";
	
	byte b[] = myString.getBytes();
	fos.write(b);
	fos.close();
}
}
