package tp5package;
import tp5package.BankAccount;

public class testTripletH {
	
	public static void main(String[] args) {
		TripletH<Integer,String,BankAccount>
		th = new TripletH<Integer, String, BankAccount>(1, "NomClient", new BankAccount(1000));
	
	
	System.out.println(th);
	}

}
