import payments.*;

public class Main{

	public static void main(String[] args){
	
		CreditCardPayment card=new CreditCardPayment(25000);
		card.ProcessPayment();
		card.refund(5000);
		
		CashPayment cash=new CashPayment(80000);
		cash.ProcessPayment();
	}
}