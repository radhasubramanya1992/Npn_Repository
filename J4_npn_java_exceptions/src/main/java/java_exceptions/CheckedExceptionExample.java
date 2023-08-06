package java_exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample 
{
public static void main(String[] args) {
	
	
	//File file = new File("D:\\test.java");
	String name = null;
	
	try {
		//FileInputStream fis = new FileInputStream(file);
		FileInputStream fis = new FileInputStream(name);
	} catch (FileNotFoundException e) {
		System.out.println("No such file exists"+"\n"+e.toString());
		e.printStackTrace();
	}
	catch(NullPointerException ne)
	{
		System.out.println("Seems the file name is null,please add proper file name");
	}	
}
}
