package wrapperclass;

public class WrapperClassPracticeAgain 
{
	public static void main(String[] args) {
		Wrap wp = new Wrap();
		wp.boxing();
		wp.unboxing();
		wp.autoboxing();
		wp.autounboxing();
		wp.convert();
	}
}

class Wrap
{
	private int a = 10;
	private double d= 20.5;
	
	public void boxing()
	{
		System.out.println("Values before boxing:		"+a+"\tand\t"+d);
		Integer intObj = Integer.valueOf(a);
		Double doubObj = Double.valueOf(d);
		System.out.println("Values after boxing:		"+intObj+"\tand\t"+doubObj);
	}
	
	public void unboxing()
	{
		System.out.println("Values before unboxing:		"+a+"\tand\t"+d);
		Integer intObj = Integer.valueOf(a);
		Double doubObj = Double.valueOf(d);
		
		a = intObj.intValue();
		d = doubObj.valueOf(d);
		System.out.println("Values after unboxing:		"+a+"\tand\t"+d);
	}
	
	public void autoboxing()
	{
		System.out.println("Values before auto-boxing:	"+a+"\tand\t"+d);
		Integer intOb = a;
		Double dounOb = d;
		System.out.println("Values after auto-boxing:	"+intOb+"\tand\t"+dounOb);
	}
	public void autounboxing()
	{
		System.out.println("Values before auto-unboxing:	"+a+"\tand\t"+d);
		Integer intOb = a;
		Double dounOb = d;
		
		int a=intOb;
		double d = dounOb;
		System.out.println("Values after auto-unboxing:	"+a+"\tand\t"+d);
	}
	public void convert()
	{
		System.out.println("a+d before conversion:		"+(a+d));
		Integer intOb = a;
		Double doubOb = d;
		
		String sa= intOb.toString();
		String sd= doubOb.toString();
		System.out.println("a+d after conversion:		"+(sa+sd));
		
	}
}