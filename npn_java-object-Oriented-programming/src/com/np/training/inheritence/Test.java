package com.np.training.inheritence;

public class Test 
{
public static void main(String[] args) 
{
	SecondClass scObj = new SecondClass();
	scObj.setAge(35);
	scObj.setName("npn");
	scObj.setPhoneNumber(98456);
	scObj.display();
	System.out.println("The details are:::"
	+scObj.getAge()+"\t"+scObj.getName()+"\t"+scObj.getPhoneNumber());
}
}

class SecondClass extends FirstClass
{
	public void display()
	{
		System.out.println("Child class method");
	}
}