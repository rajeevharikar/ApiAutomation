package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Writetofile {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter out=null;
		
		try {
			out = new FileWriter("D:\\rajtext.txt");
			out.write("Hi rajeev welcome to file handling topic \r\n");
			out.write("Good progress so far");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally{
			
			out.flush();
			out.close();
		}

			
			
		}
		
		
	}

