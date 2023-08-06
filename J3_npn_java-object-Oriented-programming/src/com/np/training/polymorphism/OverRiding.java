package com.np.training.polymorphism;

public class OverRiding 
{
public static void main(String[] args) 
{
	Icici i = new Icici();
	i.dispInte();
	
	Hdfc h = new Hdfc();
	h.dispInte();
	
	Kotak k = new Kotak();
	k.dis();
	k.dispInte();
}
}

class Bank
{
	public void dispInte()
	{
		System.out.println("General interest rate");
	}
}

class Hdfc extends Bank
{
	public void dispInte()
	{
		System.out.println("interest rate is 6%");
	}
}

class Icici extends Bank
{
	public void dispInte()
	{
		System.out.println("ICICI");
	}
}

class Kotak extends Bank
{
	void dis()
	{
		System.out.println("Interest remains same");
	}
}