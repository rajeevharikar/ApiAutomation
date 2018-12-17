 package practicepgms;

import java.util.Scanner;

public class Factorialnumbers {
	
	public static void main(String[] args) {
		
		int i, fact=1;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the value");
		int number=scn.nextInt();
		
		for(i=1;i<=number;i++)
		{
		   fact=fact*i;
		}
		System.out.println("factorial of "+number+" is "+fact);
		
	}

}
