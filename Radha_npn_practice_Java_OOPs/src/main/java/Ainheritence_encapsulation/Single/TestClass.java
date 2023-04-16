package Ainheritence_encapsulation.Single;

public class TestClass 
{
public static void main(String[] args) 
{
	SecondClass childObj = new SecondClass();
	childObj.setName("Radha");
	childObj.setAge(30);
	childObj.setPhoneNumber(9999888);
	childObj.DisplayMsg();
	System.out.println("Person details as follows:\n"
	+childObj.getName()+"\n"+childObj.getAge()+"\n"+childObj.getPhoneNumber() );
	
}
}


class SecondClass extends FirstClass
{
	public void DisplayMsg()
	{
		System.out.println("I am child class method");
	}
}