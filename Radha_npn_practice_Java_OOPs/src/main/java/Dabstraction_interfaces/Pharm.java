package Dabstraction_interfaces;

public class Pharm implements IProfitCalculate
{
	public double profitM(double Sp, double Cp) {
		return (Sp-Cp)+20;
	}
}
