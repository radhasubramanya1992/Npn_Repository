package com.npn.practice;

public class GarbageCollectionExample 
{
	public static void main(String[] args) 
	{
		Emp emp = new Emp();
		emp=null;
		System.gc();
		//gc();
	}
	
	public static void gc()
	{
		System.out.println("This is GC");
	}
}

class Emp
{
	int number;
	String name;
	protected void finalize()
	{
		System.out.println("Finalize method");
	}
}
