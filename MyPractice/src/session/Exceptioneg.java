package session;

public class Exceptioneg {
	
	public static void main(String[] args) {
		
		int i=10;
	    int j=0;
		
		try
		{
			int result = i/j;
		}
		//we need to declare catch at any cost
		// catch cannot be replaced by finally block
		finally
		{
			System.out.println("divide by zero exception");
		}
	
}
}
