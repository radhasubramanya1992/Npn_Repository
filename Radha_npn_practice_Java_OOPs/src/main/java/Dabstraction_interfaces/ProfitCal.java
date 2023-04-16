package Dabstraction_interfaces;

public class ProfitCal 
{
public static void main(String[] args) 
{
	Flour f = new Flour();
	Garment g = new Garment();
	Pharm p = new Pharm();
	Statione s = new Statione();
	
	System.out.println(f.profitM(100, 50)+"\n"+
	g.profitM(100, 50)+"\n"+
	p.profitM(100, 50)+"\n"+
	s.profitM(100, 50));
}
}
