package practicepgms;

public class Primenumber {
	
	public static void main(String[] args) {
		
		int num=13;
		boolean isPrime = true;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
			if(isPrime)
			{
				System.out.println("Its a Prime Number");
			}
			else
			{
				System.out.println("Its not a Prime Number");
			}
		}
		
	}


