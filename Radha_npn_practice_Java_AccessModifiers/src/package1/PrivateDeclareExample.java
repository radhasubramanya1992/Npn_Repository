package package1;


//private variables
//private methods 

class Private2
{
//private variable
private int k = 10;
public int y = 5;

//private method
private void displayPrivate()
{
	System.out.println("I am private method\t"+k+"\t"+y);
}

public void displayPublic()
{
	k=20;
	displayPrivate();
}
}


public class PrivateDeclareExample
{
	public static void main(String[] args) 
	{
		Private2 TestPrivateObj = new Private2();
		TestPrivateObj.y=1;
		TestPrivateObj.displayPublic();
	}
}