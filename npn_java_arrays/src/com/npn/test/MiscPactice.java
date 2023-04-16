package com.npn.test;

public class MiscPactice 
{
	//fields
		static int id=1232;
		//behavior 
		static void test1()
		{
			System.out.println("running test1()method...");
		}
		//behavior
		public static void main (String[] args)
		//even the main method is also called as behaviour
		{
			System.out.println("program starts.....");
			// refer static members of demo1 class
			System.out.println("id is : "+id);
			test1();
			System.out.println("program ends....");
		}
}

class Demo3
{
	//fields
	int id=1232;
	//behavior 
	void test1()
	{
		System.out.println("running test1() method....");
	}
	//behavior
	public static void  main (String[] args)
	{
		System.out.println("Program starts....");
		// refer non static members of Demo 3 class
		Demo3 ref1;// reference variable declaration	
		ref1=new Demo3();//creates an object of demo3
		//stores in ref1 variable
		System.out.println("id value is "+ref1.id);
		ref1.test1();
		System.out.println("Program Ends....");
	}
}
