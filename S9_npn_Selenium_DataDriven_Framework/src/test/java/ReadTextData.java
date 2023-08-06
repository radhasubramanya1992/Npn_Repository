import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ReadTextData 
{
	@Test
public void readTextData() throws IOException
{
		FileInputStream fis = new FileInputStream("src\\test\\resources\\TestOne.txt");
		int i = 0;
		while((i = fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		fis.close();
}
}
