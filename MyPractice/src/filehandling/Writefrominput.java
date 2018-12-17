package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writefrominput {
	
	public static void main(String[] args) throws IOException {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the text that need to show in file");
		String content=s1.nextLine();
		FileWriter fw=null;
		try {
			fw = new FileWriter("D://newfile.txt");
			fw.write(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		finally{
			
			try {
				fw.flush();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			FileReader readin=null;
			try {
				  readin=new FileReader("D://newfile.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int r = 0;
			try {
				 r=readin.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String str="";
			
			while(r!=-1)
			{
				char c1=(char) r;
			    str= str+c1;
				r=readin.read();
			}
			
			System.out.println(str);
			readin.close();
			
			
			
		}
	}
}
