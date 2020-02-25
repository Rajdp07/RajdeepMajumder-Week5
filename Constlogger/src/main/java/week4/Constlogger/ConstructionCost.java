package week4.Constlogger;
public class ConstructionCost
{
	public static double Construction(double TotalAreaOfHouse, String MaterialStandard, String CheckAutomation)
	{
		double cost=0.0,Construction_cost=0.0;
		if (MaterialStandard.equalsIgnoreCase("Standard Material"))
		{
			cost= 1200;
			
		}
		if (MaterialStandard.equalsIgnoreCase("Above Standard Material"))
		{
			cost= 1500;
		}
		if (MaterialStandard.equalsIgnoreCase("High Standard Material"))
			
		{
			if (CheckAutomation.equalsIgnoreCase("Yes"))
			{
				cost= 2500;
			}
			else
				cost=1800;
		}
		Construction_cost=TotalAreaOfHouse*cost;
		return Construction_cost;
	}
}
