package com.npn.practice;

public class TestStatic 
{
	int num1 = 20;
	String s1= "cat";
	static int num2 = 10;
	static String s2= "dog";
	
	public static void m1()
	{
		int x = 90;
		String q ="star";
	}

}
 
class Test2
{
	public static void main(String[] args) 
	{
		TestStatic.num2 = 30;
		TestStatic.s2 = "hi";
		TestStatic.m1();		
	}
}