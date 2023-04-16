package custom_exceptions;

import java.util.Scanner;

public class TestVote 
{
public static void main(String[] args) 
{
	System.out.println("Enter your age::  ");
	
	Scanner scan = new Scanner(System.in);
	int age = scan.nextInt();
	try {
		ValidateVoterAge(age);
	} catch (NotEligibleToVoteException e) {
		System.out.println("You are not eligible to vote, please register after 18 years of age");
		e.printStackTrace();
	}
}

public static void ValidateVoterAge(int age) throws NotEligibleToVoteException
{
	if(age>18)
	{
		System.out.println("you are elegible to vote");
	}
	else throw new NotEligibleToVoteException("Yor are not eligible to vote");
}
}