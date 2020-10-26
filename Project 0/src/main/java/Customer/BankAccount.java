package Customer;

public class BankAccount {
	
	
	String customer;
	int balance;
	int previoustransaction;
	
	void deposit(int amount) {
		if(amount != 0); {
			balance = balance + amount;
			previoustransaction= amount;
		}
	}
	
	void withdraw (int amount) {
		if(amount !=0) {
			balance = balance - amount;
			previoustransaction= -amount;
		}
		
	}
	
	void getprevioustransaction() {
		if (previoustransaction > 0) {
			System.out.println("You made a deposit of: +previoustransaction");
			
		}
		
		else if (previoustransaction < 0) {
			System.out.println("You made a withdraw of: -previoustransaction");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
