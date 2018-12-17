package practicepgms;

import java.util.Scanner;

public class StringPalindrone {
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scn.nextLine();
		String revStr = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			revStr= revStr + str.charAt(i);
		}
		if(str.equalsIgnoreCase(revStr))
		{
			System.out.println("Its a palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
