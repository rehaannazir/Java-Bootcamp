package payments;

public class CashPayment extends Payment{

	public CashPayment(double amount){

		super(amount);
}
	@Override
	public void ProcessPayment(){

		System.out.println("Processing cash payment of Rs."+amount);
	}
}