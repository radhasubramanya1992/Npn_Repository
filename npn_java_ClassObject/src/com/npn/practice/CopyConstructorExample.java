package com.npn.practice;

public class CopyConstructorExample 
{
	int number;
	String name;
	CopyConstructorExample(int number,String name)
	{
		this.number = number;
		this.name = name;
		System.out.println("number is:::"+number+"\n name is::::"+name);
	}
	CopyConstructorExample(CopyConstructorExample obj)
	{
		System.out.println("number is:::"+obj.number+"\n name is:::"+obj.name);
	}
	
	public static void main(String[] args) 
	{
		CopyConstructorExample obj1 = new CopyConstructorExample(5,"npn");
		
		CopyConstructorExample obj2 = new CopyConstructorExample(obj1);
	}

}
