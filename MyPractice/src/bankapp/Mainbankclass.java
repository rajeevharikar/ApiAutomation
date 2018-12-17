package bankapp;

public class Mainbankclass {
	public static void main(String[] args) {
		tellertransaction tt1=new tellertransaction();
		AccountManager am1=new AccountManager();
		Bankapp accm = null;
		try
		{
	      accm= am1.openaccount("Rajeev",5000,'s');
		
		tt1.balanceenquiry(accm);
		tt1.deposittxn(accm, 2000);
		tt1.balanceenquiry(accm);
		tt1.withdrawal(accm, 500);
		tt1.balanceenquiry(accm);
		}
		catch(NullPointerException e)
		{
			System.out.println("not a defined type please type s or l in type field");
		}
		
	}

}
