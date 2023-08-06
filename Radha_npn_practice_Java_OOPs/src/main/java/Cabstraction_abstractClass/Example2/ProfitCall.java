package Cabstraction_abstractClass.Example2;

public class ProfitCall 
{
public static void main(String[] args) 
{
	FlourMill fm = new FlourMill();
	Garments gm = new Garments();
	Pharmacy pm = new Pharmacy();
	Stationery sn = new Stationery();
	
	System.out.println(fm.profitM(100, 50)+"\n"+
	gm.profitM(100, 50)+"\n"+
	pm.profitM(100, 50)+"\n"+
	sn.profitM(100, 50));
}
}
