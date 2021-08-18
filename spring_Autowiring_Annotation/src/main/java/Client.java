import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.Card;
import di.DebitCard;

public class Client {

	public static void main(String[] args) {
	    
		ApplicationContext ctn = new ClassPathXmlApplicationContext("application_context_debit.xml");
		
		DebitCard dcard = (DebitCard) ctn.getBean("dcard");
		dcard.details();
		
		System.out.println(dcard.address.name);
		System.out.println(dcard.address.city);
		
		

	}

}
