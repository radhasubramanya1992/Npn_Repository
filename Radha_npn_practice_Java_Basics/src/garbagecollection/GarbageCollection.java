package garbagecollection;

public class GarbageCollection 
{
	
public static void main(String[] args) 
{
	Employee emp = new Employee();
	emp = null;
	
	System.gc();
	
}
}

class Employee
{
	int number;
	String name;
	
	public void finalize()
	{
		System.out.println("Garbage collected");
	}
	
	
}