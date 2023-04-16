package com.np.training.abstraction;

public class Garments extends ProfitCalculate
{

	@Override
	public double profitM(double sellingPrice, double costPrice) {
	
		return sellingPrice/costPrice;
	}
	
	public static void main(String[] args) 
	{
		Garments gm = new Garments();
		System.out.println(gm.profitM(30,10));	
	}
}
