package payments;

public class CreditCardPayment extends Payment implements Refundable{

	public CreditCardPayment(double amount){

		super(amount);
}

	@Override
	public void ProcessPayment(){

		System.out.println("Processing credit card payment of Rs."+amount);
}
	
	@Override
	public void refund(double refundAmount){

		System.out.println("Refunding Rs."+ refundAmount + " to credit card");
	}
}