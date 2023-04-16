package com.npn.practice;

import java.util.Arrays;
import java.util.List;

public class ArraysUtilsExample 
{
	
public static void main(String[] args) 
{
	int a[]= {800,200,100,1000};
	System.out.println("The original array is::"+Arrays.toString(a));
	
	//sorting the array
	Arrays.sort(a);
	
	System.out.println("The sorted array is ::::"+Arrays.toString(a));
	
	List <String> listtArray = Arrays.asList(Arrays.toString(a));
	
	System.out.println(listtArray);
}
}
