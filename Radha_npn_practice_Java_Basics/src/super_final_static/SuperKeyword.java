package super_final_static;

public class SuperKeyword 
{
public static void main(String[] args) {
	Dogg dog = new Dogg();
	dog.breed();
	dog.height();
	dog.color();
}
}


class Animal
{
	int x =10;
	public void breed()
	{
		System.out.println("Default breed");
	}
}

class Dogg extends Animal
{
	public void breed()
	{
		super.breed();
		System.out.println(super.x);
		//System.out.println("German Shepherd");
	}
	
	public void height()
	{
		System.out.println("3.4");
	}
	
	public void color()
	{
		System.out.println("brown");
	}
}