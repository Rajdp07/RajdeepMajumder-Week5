package week4.logger;
import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;



public class App {

public static void main(String args[]) throws IOException
{
	double Simple_Interest,Compound_Interest;
	String Show_SimpleInterest,Show_CompoundInterest;
	CalculateInterest ob= new CalculateInterest();

	Logger logger  = Logger.getLogger( App.class.getName());
	
	
	Simple_Interest=ob.SimpleInterest(5000,12,4);
	Show_SimpleInterest= Double.toString(Simple_Interest);
	logger.log(Level.INFO,"logging: {0} {1}",new Object[] {"The Simple Interest:",Show_SimpleInterest});

	
	Compound_Interest=ob.CompoundInterest(5000,12,4);
	
	Show_CompoundInterest= Double.toString(Compound_Interest);
	logger.log(Level.INFO,"logging: {0} {1}",new Object[] {"The Compound Interest:",Show_CompoundInterest});

}

}

