package npn_Selenium_log4j1.x;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SimpleTest 
{
	 static Class test = new Object() {}.getClass();
	 static Logger log = new LogManager().getLogger(test);
	 
	 //static Logger log = new LogManager().getLogger(SimpleTest.class);
public static void main(String[] args) {
	
	log.debug("This is debug log");
	log.info("This is info log");
	log.warn("This is warn log");
	log.error("This is error log");
	log.fatal("This is fatal log");
	log.trace("This is trace log");
}
}
