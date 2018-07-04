package com.epam.lab.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerMain {
	public Logger logger = LogManager.getLogger(LoggerMain.class);

	public static void main(String[] args) {
		LoggerMain loggerMain = new LoggerMain();
		loggerMain.testLogger("epamLab");
	}

	private void testLogger(String parameter) {
		logger.trace("This is trace : " + parameter);
		logger.debug("This is debug : " + parameter);
		logger.info("This is info : " + parameter);
		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
	}
}
