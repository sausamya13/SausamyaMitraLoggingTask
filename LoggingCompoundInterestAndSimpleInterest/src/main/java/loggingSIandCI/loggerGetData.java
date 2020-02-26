package loggingSIandCI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class loggerGetData
{
	    private  static final Logger LOGGER = LogManager.getLogger(loggerGetData.class);
	    
		double principal;
		double interestrate;
		double timeinyears;
	     public loggerGetData(double principal,double interestrate,double timeinyears)
	     {
	     this.principal=principal;
	     this.interestrate=interestrate;
	     this.timeinyears=timeinyears;
	     
	     
	     LOGGER.error("i am know in getdata method");
	     }
	}

