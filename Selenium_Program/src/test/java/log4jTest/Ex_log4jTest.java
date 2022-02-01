package log4jTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Ex_log4jTest {
	public Logger log = LogManager.getLogger(Ex_log4jTest.class.getName());
	@Test
	public void log() {
		log.debug("I am from debug");
		log.error("I am from error");
		log.info("I am from info");
		log.fatal("i am from fatal");
		System.out.println("We are Done");
	}
}
