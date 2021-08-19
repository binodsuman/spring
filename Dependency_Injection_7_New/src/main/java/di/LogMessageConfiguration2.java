package di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


public class LogMessageConfiguration2 {
	
	
	public LogMessage2 log1() { 
		return new LogMessage2("Without Primmary");
	}
	
	
	public LogMessage2 log2() { 
		return new LogMessage2("With Primmary");
	}

}
