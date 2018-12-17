package practicepgms;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
	
	Scanner scn= new Scanner(System.in);
	System.out.println("enter the String");
	String str = scn.nextLine();
	String revStr="";
	System.out.println(str.length());
	for(int i=str.length()-1;i>=0;i--)
	{
		revStr = revStr + str.charAt(i);
	}
	System.out.println(revStr);

    }
}