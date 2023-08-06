package blocks_passbyvalue_scannerclass;

public class PassbyValueExample1 
{
public static void main(String[] args) 
{
	B b = new B();
	System.out.println(b.n);
	b.change(5);
	System.out.println(b.n);
}
}


class B
{
	int n = 10;
	public void change(int k)
	{
		k+=10;
		System.out.println(k);
	}
}