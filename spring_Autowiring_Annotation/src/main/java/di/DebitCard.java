package di;

import org.springframework.beans.factory.annotation.Autowired;

public class DebitCard implements Card{
	
	
	public Address address;
	
	
	
	
	public DebitCard(Address address) {
		System.out.println("Hitting Constructor");
		this.address = address;
	}
	
	
	
	
	

	public void details() {
		System.out.println("This is Debit Card and address is :"+address.city);
	}

}
