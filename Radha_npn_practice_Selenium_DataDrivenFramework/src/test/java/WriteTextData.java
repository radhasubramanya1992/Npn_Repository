import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

public class WriteTextData 
{
	@Test
public void writeTextData() throws IOException
{
	FileOutputStream fos = new FileOutputStream("src\\test\\resources\\WriteText.txt");
	
	String myStr = "had your dinner?";
	
	 byte[] b = myStr.getBytes();
	 fos.write(b);
	 fos.close();
}
}
