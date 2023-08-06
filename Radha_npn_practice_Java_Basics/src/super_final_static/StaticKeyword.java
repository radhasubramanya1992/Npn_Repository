package super_final_static;

public class StaticKeyword 
{
public static void main(String[] args) 
{
	System.out.println(Colors.num2);
	System.out.println(Colors.name2);
	Colors.display();
}
}


class Colors
{
	int number =10;
	String name = "Radha";
	static int num2 =20;
	static String name2 = "Sowjanya";
	
	public static void display()
	{
		int x=5050;
		System.out.println(x);
	}
}