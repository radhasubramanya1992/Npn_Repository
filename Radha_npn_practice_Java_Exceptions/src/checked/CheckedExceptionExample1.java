package checked;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample1 
{
public static void main(String[] args) 
{
	//Create a new file at the provided location i.e Create a file object 
	//and point it to the location of created file 
	File file = new File("D:\\test.java");

	
	//read from the file that we just created
	//FileInputStream fis = new FileInputStream(file);
	
	//when we type the above , new FileInputStream(file) line,
	//compilation error will be thrown for user to either add 
	//throws OR try-catch : which is an example of Checked Exception
	//hence we add those(either throws OR try-catch) to resolve the compilation error
	
	
	try {
		FileInputStream fis = new FileInputStream(file);
	} catch (FileNotFoundException e) {
		//just print user defined message
//		System.out.println("No such file exists. Create a file first in the specified location");
		
		//print user defined message+StackTrace message
		System.out.println("No such file exists. "
				+ "Create a file first in the specified location"+"\n"+e.toString());
		
		// TODO Auto-generated catch block
		//e.printStackTrace();	
	}
}


}
