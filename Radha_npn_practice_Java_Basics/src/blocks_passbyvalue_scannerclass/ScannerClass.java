package blocks_passbyvalue_scannerclass;

import java.util.Scanner;

public class ScannerClass 
{
public static void main(String[] args) 
{
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your input::  ");
	
	String x = scan.nextLine();
	
	System.out.println("Your input was:::  "+x);
	
}
}
