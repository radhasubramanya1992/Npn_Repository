package Dabstraction_interfaces;

public class Statione implements IProfitCalculate
{
	public double profitM(double Sp, double Cp) 
	{
		return (Sp-Cp)+30;
	}
}
