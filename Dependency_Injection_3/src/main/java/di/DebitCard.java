package di;

public class DebitCard implements Card{
	
	public Address address;
	
	public int limit = 0;
	
	
	
	
	public void details() {
		System.out.println("This is Debit Card and limit is "+limit);
	}

}
