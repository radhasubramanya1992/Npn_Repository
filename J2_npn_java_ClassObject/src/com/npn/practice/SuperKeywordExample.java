package com.npn.practice;

public class SuperKeywordExample 
{
public static void main(String[] args) 
{
	Dogg dog = new Dogg();
	dog.eat();
	dog.color();
	dog.height();
}
}

class Animal
{
	void eat()
	{
		System.out.println("Animal Eating....");
	}
}

class Dogg extends Animal
{
	void eat()
	{
		System.out.println("Dog Eating....");
	}
	
	void color()
	{
		System.out.println("Dog color....");
	}
	void height()
	{
		super.eat();
	}
}
