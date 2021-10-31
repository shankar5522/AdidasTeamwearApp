package com.adidas.utils;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.log4j.PropertyConfigurator;
import com.adidas.exception.AdidasTeamwearException;
import org.apache.log4j.Logger;

public class TestExecutionProp {

	private static Logger APP_LOGS;

	public static Logger getTestExecutionLogsProperties() {
		try{
			Path resourceDirectory = Paths.get("resource").toAbsolutePath();
	        String getLog4jString = resourceDirectory.resolve("log4j.properties").toString();
			PropertyConfigurator.configure(getLog4jString);
			APP_LOGS = Logger.getLogger("rootlogger");
		} catch(Exception exception){
			throw new AdidasTeamwearException(exception.getMessage());
		} 
		return APP_LOGS;
	} 
}
