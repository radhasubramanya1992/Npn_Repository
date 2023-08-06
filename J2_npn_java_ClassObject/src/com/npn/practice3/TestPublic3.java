package com.npn.practice3;

import com.npn.practice2.TestPublic;

public class TestPublic3 
{
	public static void main(String[] args) 
	{
		TestPublic TestPublicobj = new TestPublic();
		TestPublicobj.x = 80;
		TestPublicobj.methodA();
		//TestDefault TestDefaultObj = new TestDefault();
	}
	
	protected void methodC()
	{
		System.out.println("I am Protected method");
	}
}
