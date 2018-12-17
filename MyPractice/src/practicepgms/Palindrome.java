package practicepgms;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int r,temp,s=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("type the integer");
		int n=scn.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		if(temp==s)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}		
	}

}
