package com.np.training.abstraction;

public class Stationery extends ProfitCalculate
{

	@Override
	public double profitM(double sellingPrice, double costPrice) {
		// TODO Auto-generated method stub
		return sellingPrice+costPrice;
	}
	
	public static void main(String[] args) 
	{
		Stationery st = new Stationery();
		System.out.println(st.profitM(60, 40));
		
	}

}
