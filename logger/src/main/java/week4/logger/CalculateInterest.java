package week4.logger;
public class CalculateInterest
{
	public static double SimpleInterest(double principal, double rate, double time)
	{
		double Simple_Interest=0.0;
		Simple_Interest=(principal*rate*time)/100;
		return Simple_Interest;
	}
	public static double CompoundInterest(double principal, double rate, double time)
	{
		double Compound_Interest=0.0,Amount=0.0;
		Amount=principal*Math.pow(1+rate/100, time);
		Compound_Interest=Amount-principal;
		return Compound_Interest;
	}

}
