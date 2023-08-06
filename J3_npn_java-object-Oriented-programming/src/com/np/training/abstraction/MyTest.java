package com.np.training.abstraction;

public class MyTest extends MyClass
{

@Override
public void My2() {
	System.out.println("abstract method implemented in MyTest");
	
}

public static void main(String[] args) 
{
	MyTest test = new MyTest();
	test.My1();
	test.My2();
	
	//Cannot create an object for abstract class
	//MyClass ob = MyClass();
}
}
