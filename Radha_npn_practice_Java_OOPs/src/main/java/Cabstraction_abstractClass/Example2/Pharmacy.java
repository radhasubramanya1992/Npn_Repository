package Cabstraction_abstractClass.Example2;

public class Pharmacy extends ProfitCalculate
{
	@Override
	public double profitM(double sellingPrice, double costPrice) {
		return (sellingPrice - costPrice)+20;
	}
}
