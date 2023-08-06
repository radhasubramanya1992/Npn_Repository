package com.npn.practice;

import java.util.Scanner;

public class ScannerClassTest 
{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter one value:::   ");
	
	String test = scan.nextLine();
	//int value = scan.nextInt();
	
	System.out.println("user entered value is :::"+ test);
	//System.out.println("user entered value is :::"+ value);
}
}
