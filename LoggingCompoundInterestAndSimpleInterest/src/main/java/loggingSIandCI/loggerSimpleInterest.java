package loggingSIandCI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class loggerSimpleInterest extends loggerGetData
{
    private  static final Logger LOGGER = LogManager.getLogger(loggerSimpleInterest.class);
    
   
    	double simpleinterest;
    	public loggerSimpleInterest(double principal,double interestrate,double timeinyears)
    	{
    		super(principal,interestrate,timeinyears);
    		 LOGGER.error("i am know in simpleinterest method");
    		
    	}
        public double CalculateSimpleInterest()
        {
        	simpleinterest=(principal*interestrate*timeinyears)/100;
        	return simpleinterest;
        }
    }



