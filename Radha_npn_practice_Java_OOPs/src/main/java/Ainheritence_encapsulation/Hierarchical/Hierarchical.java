package Ainheritence_encapsulation.Hierarchical;

public class Hierarchical 
{
	public static void main(String[] args) {
		C cObj = new C();
		cObj.dispName();
		cObj.dispNum();	
		
		B bObj = new B();
		bObj.dispName();
		bObj.dispAge();
	}
}
class A
{
	String name = "hi";
	public void dispName()
	{
		System.out.println(name);
	}
}

class B extends A
{
	int age = 5;
	public void dispAge()
	{
		System.out.println(age);
	}
	
}
class C extends A
{
	long number = 555666;
	public void dispNum()
	{
		System.out.println(number);
	}	
}