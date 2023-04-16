package com.np.training.inheritence;

public class MultiLevel 
{
public static void main(String[] args) 
{
	Three tobj = new Three();
tobj.dis1(35, "npn");
tobj.dis2(5.3f);
tobj.dis3(345);	
}
}

class One
{
	int age;
	String name;
	
	public void dis1(int age,String name)
	{
		System.out.println(age+name);
	}
}

class Two extends One
{
	float height;
	
	public void dis2(float height)
	{
		System.out.println(height);
	}
}
class Three extends Two
{
	int number;
	public void dis3(int number)
	{
		System.out.println(number);
	}
}
