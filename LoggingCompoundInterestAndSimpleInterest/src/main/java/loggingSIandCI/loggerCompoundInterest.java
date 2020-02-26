package loggingSIandCI;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class loggerCompoundInterest extends loggerGetData
{
    private  static final Logger LOGGER = LogManager.getLogger(loggerCompoundInterest.class);

	double compoundinterest;
	double amount;
  public loggerCompoundInterest(double principal,double interestrate,double timeinyears)
   {
     super(principal,interestrate,timeinyears);
      LOGGER.error("i am know in compoundinterest method");		
   }
	public double CalculateCompoundInterest()
	{   
		double basepart;
		basepart=(1+(interestrate/100));
		amount=principal*(Math.pow(basepart,timeinyears));
		compoundinterest=amount-principal;
		return compoundinterest;
	}
}
