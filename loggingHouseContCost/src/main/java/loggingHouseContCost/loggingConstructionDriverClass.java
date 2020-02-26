package loggingHouseContCost;


import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;





public class loggingConstructionDriverClass 
{
	private  static final Logger LOGGER = LogManager.getLogger(loggingConstructionDriverClass.class);
	
	public static void main(String args[])
	{

//myOutput.print("ENTER THE DETAILS:");
Scanner sc=new Scanner(System.in);
double tA;
double mS,fAH;
LOGGER.error("ENTER 1:TO USE STANDARD MATERIALS"
		      +"ENTER 2:TO USE ABOVE STANDARD MATERIALS"
		      +"ENTER 3:TO USE HIGH STANDARD MATERIALS");
mS=sc.nextDouble();
LOGGER.error("ENTER THE TOTALL AREA OF THE HOUSE");
tA=sc.nextDouble();
LOGGER.error("ENTER 1:IF YOU WANT FULLY AUTOMATED HOME"
		      +"ENTER 0:IF YOU DON'T WANT FULLY AUTOMATED HOME ");
fAH=sc.nextDouble();
loggingConstructionCost c=new loggingConstructionCost(mS,tA,fAH);

double totalCost;
totalCost=c.Calculate();
LOGGER.error("THE TOTAL COST IS:-"+totalCost);


	}
}


