package com.npn.practice;

public class ConstructorBehaviour 
{
	static int number1;
	static String name1;
	
	public static void main(String[] args) 
	{
		System.out.println("number1 value:"+number1);
		System.out.println("name1 value:"+name1);
		Test test = new Test();
		Test test2= new Test(5);
		test.defaultValues();
	}	
}
	
class Test
{
	Test()
	{
		System.out.println("default constructor of Test");
	}

	//constructor overloading
	Test(int x)
	{
		System.out.println(x);
	}
	Test(String a)
	{
		
	}
	Test(float y)
	{
		
	}
	int number2;
	String name2;
	
	public void defaultValues()
	{
		System.out.println("number2: "+number2);
		System.out.println("name2: "+name2);
	}
}
