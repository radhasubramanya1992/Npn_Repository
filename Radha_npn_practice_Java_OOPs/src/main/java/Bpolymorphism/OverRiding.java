package Bpolymorphism;

public class OverRiding 
{
public static void main(String[] args) 
{
	Hdfc hdfc = new Hdfc();
	Sbi sbi = new Sbi();
	Kotak kotak = new Kotak();
	hdfc.interestRate();
	sbi.interestRate();
	kotak.interestRate();
	kotak.msgAbtInterest();	
}
}

class Bank
{
	public void interestRate()
	{
		System.out.println("General : 5%");
	}
}

class Hdfc extends Bank
{
	public void interestRate()
	{
		System.out.println("HDFC :  8%");
	}
}

class Sbi extends Bank
{
	public void interestRate()
	{
		System.out.println("SBI : 3%");
	}
}

class Kotak extends Bank
{
	public void msgAbtInterest()
	{
		System.out.println("Kotak : interest remains same");
	}
}