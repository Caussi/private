package tp5package;
import tp5package.BankAccount;

public class TestTriplet {
	
	public static void main(String[] args) {
		//Triplet String
		Triplet<String> ts = new Triplet<String>("Un", "Deux", "Trois");
		System.out.print(ts);
		
		// triplet BanAccount
		BankAccount c1 = new BankAccount(10);
		BankAccount c2 = new BankAccount(20);
		BankAccount c3 = new BankAccount(30);
		Triplet<BankAccount> tb = new Triplet<BankAccount>(c1,c2,c3);
		System.out.println(tb);
		
	}

}
