package bankapp;

public class SavingsAccount extends Bankapp{

	 SavingsAccount(int accno,String custname,double accbal)
	 {
		 this.accno=accno;
		 this.custname=custname;
		 this.accbal=accbal;
	 }

	 void deposit(double amt)
	 {
		 System.out.println("depositing="+amt);
		 accbal=accbal+amt;
	 }
	 
	 void withdrawal(double amt)
	 {
		 System.out.println("Withdrawal"+amt);
		 accbal=accbal-amt;
	 }
	 void checkBalance()
	 {
		 System.out.println("account balance="+accbal);
	 }
}


