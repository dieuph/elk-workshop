package io.spring.core.log;

import java.util.HashMap;
import java.util.Map;

public enum LogContext {
	TRANSACTION,
	RESTFUL,
	CONFIGURATION,
	PERSISTENCE,
	IO,
	CRONJOB,
	PARSE,
	UNKNOWN
	;
	
	private static final Map<String, LogContext> contexts = new HashMap<>();
	
	static {
		for (LogContext context : LogContext.values()) {
			contexts.put(context.name(), context);
		}
	}
	
	public static LogContext getContext(String context) {
		return contexts.get(context.toUpperCase());
	}
}
