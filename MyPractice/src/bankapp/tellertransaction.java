package bankapp;

public class tellertransaction {
	void deposittxn(Bankapp b1,double amt)
	{
		b1.deposit(amt);
	}
	
	void withdrawal(Bankapp b1,double amt){
		b1.withdrawal(amt);
	}

	void balanceenquiry(Bankapp b1)
	{
		b1.checkBalance();
	}
}

