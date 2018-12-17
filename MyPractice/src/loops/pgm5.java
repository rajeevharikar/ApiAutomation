package loops;

public class pgm5 {
	
	public static void main(String[] args) {
		
		for(int k=1;k<=5;k++)
		{
			for(int i=1;i<=5;i++)
			{
				if(k==1 && i==1)
				{
					System.out.println("");
				}
				else if(k==1 && i==2)
				{
					System.out.print("");
				}
				else
				{
					System.out.print("*");
				}
			}
			//System.out.println();
		}
	}

}
