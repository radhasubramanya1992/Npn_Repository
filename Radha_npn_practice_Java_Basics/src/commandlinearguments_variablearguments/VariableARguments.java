package commandlinearguments_variablearguments;

public class VariableARguments 
{
	public static void main(String[] args) 
	{
		display();
		display(10);
		display(50,25,100,200);
		
	}
	
	public static void display(int...test)
	{
		for(int i:test)
		{
			System.out.print(i+"\t");
		}
		System.out.print("\n");
	}

}
