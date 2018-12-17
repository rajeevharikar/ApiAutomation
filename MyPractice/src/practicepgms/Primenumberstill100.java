package practicepgms;

public class Primenumberstill100 {
	
	public static void main(String[] args) {
		
		int i,num=100,status=1;
		
		for(i=1;i<=num;i++)
		{
		for(int k=2;k<=i-1;k++)
		{
			 if ( i%k == 0 )
	            {
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 )
	         {
	            System.out.println(i);
	         }
	         status = 1;
	         
		    }
		}
		
	}



