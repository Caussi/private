package tp5package;

public class BankAccount implements Comparable <BankAccount>{
	private double balance;


	public class bankAccount {
		/**
		* Constructs a bank account with a zero balance.
		 * @return 
		*/
		public void BankAccount(){
		balance = 0;
		}
		/**
		* Constructs a bank account with a given balance.
		* @param initialBalance the initial balance
		 * @return 
		*/
		public void BankAccount(double initialBalance){
		balance = initialBalance;
		}
		/**
		* Deposits money into the bank account.
		* @param amount the amount to deposit
		*/
		public void deposit(double amount){
		double newBalance = balance + amount;
		balance = newBalance;
		}
		/**
		* Withdraws money from the bank account.
		* @param amount the amount to withdraw
		*/
		public void withdraw(double amount){
		double newBalance = balance - amount;
		balance = newBalance;
		}
		/**
		* Gets the current balance of the bank account.
		* @return the current balance
		*/
		public double getBalance(){
		return balance;
		}
		private double balance;
		}
		
		
		private int getBalance() {
			// TODO Auto-generated method stub
			return 0;
		}

		public String toString() {
			return "BA : ("+this.getBalance()+")";
		}

		public int compareTo(BankAccount o) {
			// TODO Auto-generated method stub
			if(this.getBalance()>o.getBalance())
				return 1;
			else if(this.getBalance()<o.getBalance())
				return -1;
			return 0;
		}		
		
}

