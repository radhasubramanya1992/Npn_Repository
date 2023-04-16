package com.np.training.interfaces;

public class Garment implements IProfitCalculate
{

	@Override
	public double profitM(double sellingPrice, double costPrice) {
		// TODO Auto-generated method stub
		return sellingPrice/costPrice;
	}
 public static void main(String[] args) 
 {
	 Pharm ph = new Pharm();
	 Statine st = new Statine();
	 Flour fl = new Flour();
	 Garment gm = new Garment();
	 
	 System.out.println(ph.profitM(30,10)+"\n"+st.profitM(10, 10)+"\n"
	 +fl.profitM(100, 50)+"\n"+gm.profitM(50, 50));
 }
}
