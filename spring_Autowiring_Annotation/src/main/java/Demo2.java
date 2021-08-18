import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.Card;
import di.DebitCard;

public class Demo2 {

	public static void main(String[] args) {
		//DebitCard card = new DebitCard();
		//Card card = new DebitCard();
		//card.details();
		
		ApplicationContext ctn = new ClassPathXmlApplicationContext("application_context.xml");
		//Card card = (Card) ctn.getBean("ccard");
		//card.details();
		
		DebitCard dcard = (DebitCard) ctn.getBean("dcard");
		dcard.details();
		System.out.println(dcard.address.name);
		System.out.println(dcard.address.city);

	}

}
