package practicepgms;

public class SwapWithouttemp {
//Swap 2 variables without using temp file
	
	public static void main(String[] args) {
	
		int x=10;
		int y=20;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		//or
//		x=x*y;
//		y=x/y;
//		x=x/y;
		
		System.out.println("x value="+x);
		System.out.println("y value="+y);
				
	
	}

}
