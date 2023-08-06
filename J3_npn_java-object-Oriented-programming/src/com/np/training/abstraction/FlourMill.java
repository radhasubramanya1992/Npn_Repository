package com.np.training.abstraction;

public class FlourMill extends ProfitCalculate
{

	@Override
	public double profitM(double sellingPrice, double costPrice) {
		
		return sellingPrice*costPrice;
	}
	
	public static void main(String[] args) 
	{
		FlourMill fm = new FlourMill();
		System.out.println(fm.profitM(10,10));
		
	}

}
