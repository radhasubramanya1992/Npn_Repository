package com.np.training.inheritence;

public class Haierarchical 
{
public static void main(String[] args) 
{
	C cobj = new C();
	B bobj = new B();
	
	System.out.println(cobj.a);
	System.out.println(cobj.b);
	System.out.println(cobj.q);
	
	System.out.println(bobj.a);
	System.out.println(bobj.b);
	System.out.println(bobj.c);
}
}

class A
{
	int a = 10;
	int b= 20;
	public void show1()
	{
		System.out.println(a+b);
	}
}

class B extends A
{
	int c = 70;
	public void show2()
	{
		System.out.println(c);
	}
	
}

class C extends A
{
	int q = 50;
	public void show3()
	{
		System.out.println(q);
	}
}