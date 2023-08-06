package wrapperclass;

public class WrapperClassExample 
{
public static void main(String[] args) 
{
	TestWrapper tw = new TestWrapper();
	tw.autoBoxing();
	tw.autounBoxing();
	tw.boxing();
	tw.unBoxing();
	tw.convert();
}
}

class TestWrapper
{
	private int a =10;
	private double d = 20.5;
	
	public void boxing()
	{
		System.out.println("Values before boxing:		"+a+"\tand\t"+d);
		
		//boxing using valueOf()		
		Integer intOb = Integer.valueOf(a);
		Double dbObj = Double.valueOf(d);
		
		System.out.println("Values after boxing:		"+intOb+"\tand\t"+dbObj);
	}
	
	public void unBoxing()
	{
		//boxing
		Integer inOb = Integer.valueOf(a);
		Double dbOb = Double.valueOf(d);
		
		System.out.println("Values before unboxing:		"+inOb+"\tand\t"+dbOb);
		a= inOb.intValue();
		d = dbOb.doubleValue();
		System.out.println("Values after unboxing:		"+a+"\tand\t"+d);
	
	}
	
	public void autoBoxing()
	{
		System.out.println("Values before auto-boxing:	"+a+"\tand\t"+d);
		//autoboxing
		Integer intObj = a;
		Double doubObj = d;
		
		System.out.println("Values after auto-boxing:	"+intObj+"\tand\t"+doubObj);
	}
	
	public void autounBoxing()
	{
		//autoboxing
		Integer intOb =a;
		Double doubOb = d;
			
		System.out.println("Values before auto-unboxing:	"+intOb+"\tand\t"+doubOb);
		//auto-unboxing
		a = intOb;
		d = doubOb;
		
		System.out.println("Values after auto-unboxing:	"+a+"\tand\t"+d);
	}
	public void convert() {
		System.out.println("Int value+double value before conversion is:::  	"+(a+d));
		Integer inOb =a;
		Double dbOb = d;
		
		String sa = inOb.toString();
		String sd = dbOb.toString();
		
		System.out.println("Int value+double value after conversion is:::  	"+(sa+sd));
	}
}
