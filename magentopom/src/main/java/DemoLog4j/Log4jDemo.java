package DemoLog4j;
import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;
public class Log4jDemo {
static Logger logger= LogManager.getLogger(Log4jDemo.class);
public static void main(String[] args) {
	System.out.println("\n hello world.....!  \n");
	logger.info("tis is information");
	logger.error("this is error");
	logger.warn("this is warning");
	System.out.println("completed");
}
}
