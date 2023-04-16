package unchecked;

public class UncheckedExceptonExample 
{
public static void main(String[] args) {
	String animal[] = {"cat","dog"};
	
	//run this without try,catch block, 
	//runtime exception will be thrown: an example of unchecked exception
	//since it was not checked at compile time
	//hence add try catch to handle his vulnerable block of code
	//System.out.println("Third element of the array is: "+animal[2]);
	
	try
	{
		System.out.println("Third element of the array is: "+animal[2]);
	}
	catch (ArrayIndexOutOfBoundsException e) {
		//add your custom message
		System.out.println("You are trying to access an element which is out of range");
		e.printStackTrace();
	}
}
}
