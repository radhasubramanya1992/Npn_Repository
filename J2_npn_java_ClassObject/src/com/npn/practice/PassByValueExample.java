package com.npn.practice;

public class PassByValueExample 
{
public static void main(String[] args) {
	TestChange test = new TestChange();
	System.out.println("The value of instance variable is:::"+test.testData);
	test.change(100);
	System.out.println("The value of instance variable is:::"+test.testData);
}
}

class TestChange
{
	int testData = 100;
	 void change(int testData) 
	 {
		 testData = testData + 100;
		 System.out.println("The value of local variable is:::"+testData);
	 }
}