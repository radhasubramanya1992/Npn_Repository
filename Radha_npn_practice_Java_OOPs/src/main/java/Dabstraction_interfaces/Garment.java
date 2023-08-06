package Dabstraction_interfaces;

public class Garment implements IProfitCalculate
{
	public double profitM(double Sp, double Cp) {
		return (Sp-Cp)+10;
	}

}
