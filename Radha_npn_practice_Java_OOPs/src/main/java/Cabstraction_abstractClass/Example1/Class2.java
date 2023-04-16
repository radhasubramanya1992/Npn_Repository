package Cabstraction_abstractClass.Example1;

public class Class2 extends Class1
{

	@Override
	public void m2() 
	{
		// TODO Auto-generated method stub
		System.out.println("abstract method implemented in class2");		
	}
	
	public static void main(String[] args) {
		Class2 class2Ob = new Class2();
		class2Ob.m1();
		class2Ob.m2();
		
		//Cannot create an object for abstract class
		//Class1 class1Ob = new Class1();	
	}
}
