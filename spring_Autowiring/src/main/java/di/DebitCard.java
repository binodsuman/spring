package di;

public class DebitCard implements Card{
	
	public Address address;
	
	// For Autowiring three things important 1. Default Constructor 2. Setter 3. Getter
	
	public DebitCard() {}
	
	public DebitCard(Address address) {
		System.out.println("Hitting Constructor");
		this.address = address;
	}
	
	
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Hitting setter method");
		this.address = address;
	}

	public void details() {
		System.out.println("This is Debit Card and address is :"+address.city);
	}

}
