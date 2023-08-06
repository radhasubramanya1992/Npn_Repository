package custom;

import java.util.Scanner;

public class TestVote 
{
public static void main(String[] args) 
{
	System.out.println("Enter your age:  ");
	Scanner scanObj = new Scanner(System.in);
	int age = scanObj.nextInt();
	try 
	{
		ValidateVoterAge(age);
	} 
	catch (NotEligibleToVoteException e) 
	{
		System.out.println("You are not eligible to vote,please try after 18 years of age");
		e.printStackTrace();
	}
	
	
}

public static void ValidateVoterAge(int age) throws NotEligibleToVoteException
{
	if(age>18)
	{
		System.out.println("You are eligible to vote");
	}
	else throw new NotEligibleToVoteException("You are not eligible to vote");
}

}
