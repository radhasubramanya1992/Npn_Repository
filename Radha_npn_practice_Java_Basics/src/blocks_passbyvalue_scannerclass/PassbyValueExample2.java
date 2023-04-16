package blocks_passbyvalue_scannerclass;

public class PassbyValueExample2 
{
public static void main(String[] args) 
{
	C c = new C();
	System.out.println(c.number);
	c.change(5);
	System.out.println(c.number);
}
}


class C
{
	int number = 10;
	public void change(int number)
	{
		number+=10;
		System.out.println(number);
	}
}