package super_final_static;

public class SuperMethod 
{
	public static void main(String[] args) {
		Orange og = new Orange();
	}

}

class Fruits
{
	Fruits()
	{
		System.out.println("All fruits");
	}
}

class Orange extends Fruits
{
	Orange()
	{
		super();
		System.out.println("Orange");
	}
}