package com.np.training.polymorphism;

public class OverLoading 
{
		
public static void main(String[] args) 
{
	Colors c = new Colors();
	c.dispCol();
	c.dispCol("pink");
	c.dispCol(4);
}
}

class Colors
{
	public void dispCol()
	{
		System.out.println("Black");
	}
	
	public void dispCol(String changeColor)
	{
		System.out.println("Changed color::::::"+"changeColor");
	}
	public void dispCol(int a)
	{
		System.out.println("white::::"+a);
	}
	
}
