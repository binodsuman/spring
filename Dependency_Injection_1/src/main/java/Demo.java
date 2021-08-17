import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.Card;

public class Demo {

	public static void main(String[] args) {
		//DebitCard card = new DebitCard();
		//Card card = new DebitCard();
		//card.details();
		
		ApplicationContext ctn = new ClassPathXmlApplicationContext("application_context.xml");
		Card card = (Card) ctn.getBean("ccard");
		card.details();

	}

}
