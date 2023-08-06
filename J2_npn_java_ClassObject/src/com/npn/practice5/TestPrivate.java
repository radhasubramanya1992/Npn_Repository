package com.npn.practice5;

public class TestPrivate 
{
private int k = 40;
public int y = 0;

private void methodD()
{
	System.out.println("I am private method");
}

public void MethodE()
{
	k=50;
	methodD();
}
}


class TestPrivate2
{
	public void MethodF()
	{
		TestPrivate TestPrivateObj = new TestPrivate();
		TestPrivateObj.y=1;
		TestPrivateObj.MethodE();
	}
}

