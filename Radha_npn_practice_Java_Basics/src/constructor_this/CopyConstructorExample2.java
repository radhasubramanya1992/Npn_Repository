package constructor_this;

public class CopyConstructorExample2 
{
static int number;
static String name;

CopyConstructorExample2(int number,String name)
{
	//Try without 'this' keyword by commenting lines with 'this' 
//	number = number;
//	name = name;
	
	this.number = number;
	this.name = name;
	
	System.out.println("Constructor calling values::  "+number+"\t"+name);
}


CopyConstructorExample2(CopyConstructorExample2 obj)
{

	System.out.println("values from existing object::   "+obj.number+"\t"+obj.name);
}

public static void main(String[] args) 
{
	System.out.println("Instance variables Default values::  "+number+"\t"+name);	
	CopyConstructorExample2 exp2 = new CopyConstructorExample2(10,"Radha");
	System.out.println("Instance variables changed values::  "+number+"\t"+name);
	
	CopyConstructorExample2 ex3 = new CopyConstructorExample2(exp2);
}
}
