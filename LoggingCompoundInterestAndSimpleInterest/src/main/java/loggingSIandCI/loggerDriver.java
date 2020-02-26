package loggingSIandCI;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class loggerDriver 
{
	private  static final Logger LOGGER = LogManager.getLogger(loggerDriver.class);
	
	public static void main(String args[])
	{
		LOGGER.error("ENTER THE PRINCIPAL RATE AND TIME");
		Scanner sc=new Scanner(System.in);
		double principal, interestrate , timeinyears;
		//myOutput.print("ENTER THE PRINCIPAL RATE AND TIME    ");
		principal=sc.nextDouble();
		
		
		interestrate=sc.nextDouble();
		
		timeinyears=sc.nextDouble();
		
		loggerSimpleInterest si=new loggerSimpleInterest(principal,interestrate,timeinyears);
		
		//si.SimpleInterest(principal,interestrate,timeinyears);
		
		double SimpleInterest=si.CalculateSimpleInterest();
		LOGGER.error("     THE SIMPLE INTEREST IS    "+SimpleInterest);
		
		loggerCompoundInterest ci=new loggerCompoundInterest(principal,interestrate,timeinyears);
		//ci.CompoundInterest(principal,interestrate,timeinyears);
		
		double CompoundInterest=ci.CalculateCompoundInterest();
		LOGGER.error("     THE COMPOUND INTEREST IS   "+CompoundInterest);
		
		
	}
	
}


