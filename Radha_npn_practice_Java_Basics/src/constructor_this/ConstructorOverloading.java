package constructor_this;

public class ConstructorOverloading 
{
	
	static int number1;
	static String name1;
public static void main(String[] args) 
{

	System.out.println(number1);
	System.out.println(name1);
	Test test = new Test();
	Test test1 = new Test(3);
	Test test2 = new Test("hi");
	test2.print();
	
}
}


class Test
{
	int number2;
	String name2;
	
	
	Test()
	{
		System.out.println("Default constructor");
	}
	
	Test(int x)
	{
		System.out.println(x);
	}
	Test(String s)
	{
		System.out.println(s);
	}
	
	public void print()
	{
		System.out.println("default number of another clas:::   "+number2+"\t"+
				"default name of another clas:::  "+name2);
	}
	
}