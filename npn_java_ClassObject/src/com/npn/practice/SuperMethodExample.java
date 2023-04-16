package com.npn.practice;

public class SuperMethodExample 
{
	public static void main(String[] args) {
		Cat cat = new Cat();
	}

}

class Animall
{

	Animall()
	{
		System.out.println("Animal's Constructor");
	}
	
}

class Cat extends Animall
{
	Cat()
	{
		super();
		System.out.println("Cat's Constructor");
	}

}