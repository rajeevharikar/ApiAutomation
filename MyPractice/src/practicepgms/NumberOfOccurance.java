
package practicepgms;

import java.util.Scanner;

public class NumberOfOccurance {
	
	public static void main(String[] args) {
	int count = 0,flag=1;
	Scanner scn= new Scanner(System.in);
	System.out.println("enter a String");
    String str=scn.nextLine();
    System.out.println("Enter a charcter");
    char ch= scn.next().charAt(0);
	char ch1 =0;
	for(int i=0;i<str.length();i++)
	{
        ch1 = str.charAt(i);
		if(ch1!=ch)
		{
		   flag=0;
		}
		else
		{
			flag=1;
			count++;
		}
	}
	if(flag==1)
	{
		System.out.println(count);
	}
	else
	{
		System.out.println("Character not found");
	}
	
	}
	
	}

