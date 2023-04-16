package com.np.training.interfaces;

public class Pharm implements IProfitCalculate
{

	@Override
	public double profitM(double sellingPrice, double costPrice) {
		// TODO Auto-generated method stub
		return sellingPrice - costPrice;
	}

}
