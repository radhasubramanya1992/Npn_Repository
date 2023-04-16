package com.npn.practice;

public class VariableArguments 
{
public static void Display(int...test)
{
	System.out.println("The method has been invoked");
	for(int i:test)
	{
		System.out.print(i+"\t");
	}
	System.out.print("\n");
}

public static void main(String[] args) 
{
	Display();
	Display(1);
	Display(100,200,300,500);
	
	
}
}
