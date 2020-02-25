package week4.Constlogger;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Display {

public static void main(String args[]) throws IOException
{
	double cost;
	String Show_cost;
	ConstructionCost ob= new ConstructionCost();
	
	Logger logger  = Logger.getLogger( Display.class.getName());
	
	
	cost=ob.Construction(50,"HIGH STANDARD MATERIAL","YES");
	Show_cost= Double.toString(cost);
	logger.log(Level.INFO,"logging: {0} {1}",new Object[] {"The construction cost:",Show_cost});
	
}

}