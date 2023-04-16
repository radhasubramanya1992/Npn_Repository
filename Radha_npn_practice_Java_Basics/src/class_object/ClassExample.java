package class_object;

public class ClassExample 
{
	String color;
	double height;
	double weight;
	
	ClassExample()
	{
		System.out.println("Default dog values::  "+"color  "+color+"  height  "+height+"  weight  "+weight);
	}
	
	public void getColor(String color)
	{
		System.out.println("Instance color is:   "+color);
	}
	
	public void getHeight(double height)
	{
		System.out.println("Instance height is:   "+height+"   ft");
	}
	
	public void getWeight(double weight)
	{
		System.out.println("Instance color is:   "+weight+"   Kg");
	}
	

}
