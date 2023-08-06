package com.npn.practice;

public class BlocksExample 
{
public static void main(String[] args) {
	ExampleBlock exp = new ExampleBlock();
	exp.localBlockMethod();
}
}

class ExampleBlock
{
	private int number;
	private String name;
	
	{
		System.out.println("Instance block");
	}
	static
	{
		System.out.println("Static block");
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 public void localBlockMethod()
	 {
		 {
			 System.out.println("Local Block");
		 }
	 }
	
}
