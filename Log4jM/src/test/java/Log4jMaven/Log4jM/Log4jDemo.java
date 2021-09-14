package Log4jMaven.Log4jM;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	
		// TODO Auto-generated method stub
private static Logger logger=LogManager.getLogger(Log4jDemo.class);
public static void main(String[] args) {
	System.out.println("\n Hello world.... \n");
	// take trace(string message)
	logger.trace("this is trace message");
	//take info(string message)
	logger.info("This is information message");
	//take error(message message)
	logger.error("This is a error message");
	//take warn(message message)
	logger.warn("This is a warning message");
	//take fatal(message message)
	logger.fatal("This is a fatal message");
System.out.println("\n completed");
//run as java application
	}

}
