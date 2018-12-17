package filehandling;

import java.io.FileReader;
import java.io.IOException;

public class Readfromfile {
	
		public static void main(String[] args) throws IOException {
			
                 FileReader in= new FileReader("D:\\rajtext.txt");
				 
				 String s1="";
				int x=0;
				 while(x!=-1)
				 //for(int x=in.read;x!=-1;x++)
				 {
					 char ch=(char)x;
					 s1=s1+ch;
					x=in.read();
					
				 }
				 System.out.println(s1);
				 in.close();
	
				 
					 
				 }
			
			
			
		}


