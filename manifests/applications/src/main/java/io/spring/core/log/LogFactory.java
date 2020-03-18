package io.spring.core.log;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogFactory {

	private static final Map<LogContext, Logger> LOGGERS = new HashMap<>();
	
	static {
		for (LogContext logContext : LogContext.values()) {
			LOGGERS.put(logContext, LogManager.getLogger(logContext.name()));
		}
		LOGGERS.put(null, LogManager.getLogger(""));
	}
	
	public static Logger forContext(LogContext context) {
		return LOGGERS.get(context);
	}
	
}
