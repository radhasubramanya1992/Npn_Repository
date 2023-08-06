package Dabstraction_interfaces;

public class Flour implements IProfitCalculate
{
	public double profitM(double Sp, double Cp) 
	{
		return (Sp-Cp) ;
	}
}
