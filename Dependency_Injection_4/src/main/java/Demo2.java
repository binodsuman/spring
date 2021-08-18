import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.LogMessage;
import di.LogMessage2;

public class Demo2 {

	public static void main(String[] args) {
		
		
		//ApplicationContext ctn = new ClassPathXmlApplicationContext("application_context.xml");
		ConfigurableApplicationContext ctn = new ClassPathXmlApplicationContext("application_context.xml");
		
		

	}

}
