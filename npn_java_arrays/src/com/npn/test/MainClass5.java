package com.npn.test;

class Sample5
{
	int id;
	double marks;
	// Constructor Overloading
	Sample5(int arg1)
	{
		System.out.println("RUNNING Sample5 (int) Constructor");
		id = arg1;
	}
	Sample5(double arg1,int arg2)
	{
		System.out.println("RUNNING Sample5 (double,int) Constructor");
		id=arg2;
		marks=arg1;
	}
	Sample5 (int arg1, double arg2)
	{
		System.out.println("RUNNING Sample5 (int, double) Cosntructor");
		id=arg1;
		marks=arg2;
	}
}
public class  MainClass5
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts...");
		Sample5 ref1 = new Sample5(32);
		System.out.println("ID Value : " +ref1.id);
		System.out.println("Marks Value : "+ref1.marks);
		System.out.println ("---------------------------");
		Sample5 ref2 = new Sample5(65.46,78);
		System.out.println("ID Value : " +ref2.id);
		System.out.println("Marks Value : " +ref2.marks);
		System.out.println ("---------------------------");
		Sample5 ref3 = new Sample5(78,65.46);
		System.out.println("ID Value : " +ref3.id);
		System.out.println("Marks Value : " +ref3.marks);
		System.out.println("Program ENDS...");
		}
}