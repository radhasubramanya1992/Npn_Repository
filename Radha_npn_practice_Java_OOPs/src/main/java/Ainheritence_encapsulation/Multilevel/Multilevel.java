package Ainheritence_encapsulation.Multilevel;

public class Multilevel 
{
public static void main(String[] args) 
{
	Three threeObj = new Three();
	threeObj.displayName("hi");
	threeObj.displayAge(5);
	threeObj.displayNumber(333);
	System.out.println("Original values\n"+
	threeObj.name+"\n"+threeObj.age+"\n"+threeObj.number);
}
}
class One
{
	String name = "Radha";
	public void displayName(String name)
	{
		System.out.println(name);
	}
	
}
class Two extends One
{
	int age = 30;
	public void displayAge(int age)
	{
		System.out.println(age);
	}
}
class Three extends Two
{
	long number = 999888;
	public void displayNumber(long number)
	{
		System.out.println(number);
	}
}