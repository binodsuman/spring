package di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class LogMessageConfiguration {
	
	
	public LogMessage log() { // "log" would be the bean nmae
		return new LogMessage();
	}

}
