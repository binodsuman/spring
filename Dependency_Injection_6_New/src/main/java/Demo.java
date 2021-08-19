import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.ILogMessage;
import di.LogMessage;
import di.LogMessageConfiguration;

public class Demo {

	public static void main(String[] args) {
		
		
		//ApplicationContext ctn = new ClassPathXmlApplicationContext("application_context.xml");
		ApplicationContext ctn = new AnnotationConfigApplicationContext(LogMessageConfiguration.class);
		
		
		LogMessage log = (LogMessage) ctn.getBean("log");
		log.getMessage();
		
		//ILogMessage log =  ctn.getBean(ILogMessage.class);
		//log.getMessage();
		
		

	}

}
