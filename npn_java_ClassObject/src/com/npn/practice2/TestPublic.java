package com.npn.practice2;

public class TestPublic 
{
	public int x = 90;
	public void methodA()
	{
		System.out.println("I am public method");
	}
	public static void main(String[] args) 
	{
		TestDefault TestDefaultObject = new TestDefault();
		TestDefaultObject.methodB();
	}
}

class TestDefault
{
	void methodB()
	{
		System.out.println("I am Default method");
	}
}