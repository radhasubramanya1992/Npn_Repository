package java_exceptions;

public class UncheckedExceptionsExample 
{
	public static void main(String[] args) 
	{
		String test[] = {"Cat","Dog"};
		try
		{
		System.out.println("the third element of the array is:"+test[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("you are trying to access an element which is out of the range");
			e.printStackTrace();
		}
	}

}
