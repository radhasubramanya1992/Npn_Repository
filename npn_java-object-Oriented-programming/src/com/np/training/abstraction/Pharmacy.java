package com.np.training.abstraction;

public class Pharmacy extends ProfitCalculate
{

	@Override
	public double profitM(double sellingPrice, double costPrice) {
		return sellingPrice - costPrice;
	}

	public static void main(String[] args) 
	{
		Pharmacy pm = new Pharmacy();
		System.out.println(pm.profitM(100,50));
	}
}
