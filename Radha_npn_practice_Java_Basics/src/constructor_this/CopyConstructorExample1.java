package constructor_this;

public class CopyConstructorExample1 
{
static int number;
static String name;

CopyConstructorExample1(int Number,String Name)
{
	number = Number;
	name = Name;
	System.out.println("Constructor calling values::  "+number+"\t"+name);
}

CopyConstructorExample1(CopyConstructorExample1 obj)
{
	System.out.println("values from existing object::   "+obj.number+"\t"+obj.name);
}

public static void main(String[] args) 
{
	System.out.println("Instance variables Default values::  "+number+"\t"+name);
	CopyConstructorExample1 ex1 = new CopyConstructorExample1(5,"Radha");
	System.out.println("Instance variables changed values::  "+number+"\t"+name);
	
	CopyConstructorExample1 ex2 = new CopyConstructorExample1(ex1);
	
	
	
}
}
