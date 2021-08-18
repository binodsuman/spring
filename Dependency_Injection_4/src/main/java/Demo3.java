import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.LogMessage;
import di.LogMessage2;
import di.LogMessage3;

public class Demo3 {

	public static void main(String[] args) {
		
		
			ConfigurableApplicationContext ctn = new ClassPathXmlApplicationContext("application_context.xml");
		

	}

}
