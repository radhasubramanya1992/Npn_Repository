package com.npn.practice;

public class WithoutThisKeyword 
{
	public static void main(String[] args) {
		 Student stuObj = new Student(10,"npn",4000);
		 stuObj.display();
	}

}

class Student
{
	int number;
	String name;
	double fee;
	
	Student(int number,String name,double fee)
	{
//		number=number;
//		name=name;
//		fee=fee;
		
		this.number=number;
		this.name=name;
		this.fee=fee;
	}
	
	void display() 
	{
		System.out.println("Number is:::"+number+"\n Name is::::"+name+"\n Fee is::::"+fee);
	}
}