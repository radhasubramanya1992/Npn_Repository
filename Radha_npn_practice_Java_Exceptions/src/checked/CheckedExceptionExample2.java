package checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample2 
{
public static void main(String[] args) {
	//declare filename with null value
		String name = null;
		//when we type the above  new FileInputStream(name) line,
			//compilation error will be thrown for user to either add 
			//throws OR try-catch : which is an example of Checked Exception
			//hence we add those to resolve the compilation error
	
	try {
		FileInputStream fis = new FileInputStream(name);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//add another exception
		catch (NullPointerException ne) {
			//add custom message
			System.out.println("Seems the given filename is Null. Enter a valid filename");
			ne.printStackTrace();
		}
}
}
