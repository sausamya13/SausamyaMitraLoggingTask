package loggingHouseContCost;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class loggingConstructionCost 
{
	private  static final Logger LOGGER = LogManager.getLogger(loggingConstructionCost.class);
	double materialStandard;
	double totalArea;
	double fullyAutomatedHome;
	double totalCost;
	public  loggingConstructionCost(double materialStandard,double totalArea,double fullyAutomatedHome)
	{
		this.materialStandard=materialStandard;
		this.totalArea=totalArea;
		this.fullyAutomatedHome=fullyAutomatedHome;
		LOGGER.error("i am know in loggingConstructionCost method");	
	}
	public double Calculate()
	{ 
		
		if(materialStandard==1&& fullyAutomatedHome==0) 
		{
				totalCost= totalArea *1200;
		
		}
		else if(materialStandard==2  && fullyAutomatedHome==0)
		{
			totalCost=totalArea*1500;
			
		}
		else if(materialStandard==3 && fullyAutomatedHome==0 )
		{
			totalCost=totalArea*1800;
			
		}
		else if(materialStandard==3 && fullyAutomatedHome==1)
		{
			totalCost=totalArea*2500;
			
		}
		else
		{
			
			LOGGER.error("invalid choice");
			
		}
	return totalCost;
	}

	}

	
	

