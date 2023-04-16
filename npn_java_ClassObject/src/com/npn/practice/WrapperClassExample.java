package com.npn.practice;

public class WrapperClassExample 
{
	public static void main(String[] args) 
	{
		WrapperTest wtObj = new WrapperTest();
		wtObj.testAutoBoxing();
		wtObj.unBoxing();
		wtObj.convert();
	}
}

class WrapperTest
{
	private int a = 20;
	private double b = 5.456;
	
	public void testAutoBoxing()
	{
		//method 1 to boxing using valueOf()
//		Integer intObj = Integer.valueOf(a);
//		Double doubObj = Double.valueOf(b);
		
		//method 2- autoboxing
		Integer intObj = a;
		Double doubObj = b;
		
		if(intObj instanceof Integer)
		{
			System.out.println("The object of integer is created and its value is::"+intObj);
		}
		if(doubObj instanceof Double)
		{
			System.out.println("The object of double is created and its value is::"+doubObj);
		}
	}
	public void unBoxing()
	{
		//autoboxing
		Integer intObj = a;
		Double doubObj = b;
		
		//method 1 - unboxing using intValue() and doubleValue() methods
		a = intObj.intValue();
		b= doubObj.doubleValue();
		
		//method 2 - auto unboxing
//		int a = intObj;
//		double b = doubObj;
		
		System.out.println("The int primitive type value is :::"+ a);
		System.out.println("The double  primitive type value is :::"+ b);
		
	}
	public void convert() 
	{
		//autoboxing
				Integer intObj = a;
				Double doubObj = b;
				
				String intString = intObj.toString();
				String doubString = doubObj.toString();
		System.out.println("the int value+double value is ::::"+(intString+doubString));
	}
	
}
