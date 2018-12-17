package bankapp;

public class AccountManager {
	Bankapp openaccount(String custname,double initamt,char type)
	{
		Bankapp acc1=null;
		if (type=='s')
		{
			System.out.println("Opening savings account for "+custname);
			acc1=new SavingsAccount(223455,custname,initamt);
		}
		else if(type=='l')
		{
			System.out.println("Opening Loan account"+custname);
			acc1=new Loanaccount(5455,custname,initamt);
		}
		
		return acc1;
	}
}
