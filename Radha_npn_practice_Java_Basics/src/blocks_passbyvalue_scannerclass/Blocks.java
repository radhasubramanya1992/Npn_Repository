package blocks_passbyvalue_scannerclass;

public class Blocks 
{
public static void main(String[] args) 
{
	Ex exobj = new Ex();
	exobj.display();
}
}

class Ex
{
	public void display()
	{
		System.out.println("Non-static local block");
	}
	
	{
		System.out.println("Non-static instance block");
	}
	
	static
	{
		System.out.println("Static instance block");
	}
}