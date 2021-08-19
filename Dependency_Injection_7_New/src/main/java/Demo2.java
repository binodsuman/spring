import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.LogMessage;
import di.LogMessage2;
import di.LogMessageConfiguration;
import di.LogMessageConfiguration2;

public class Demo2 {

	public static void main(String[] args) {
		
		
		//ApplicationContext ctn = new ClassPathXmlApplicationContext("application_context.xml");
		ApplicationContext ctn = new AnnotationConfigApplicationContext(LogMessageConfiguration2.class);
		
		
		//LogMessage log =  ctn.getBean("log", LogMessage.class);
		//log.getMessage();
		
		
		
		

	}

}
