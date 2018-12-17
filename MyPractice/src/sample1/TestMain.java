package sample1;

public class TestMain {
	
	public static void main(String[] args) {
		
		Arrayexample arr[]=new Arrayexample[2];
		
		arr[0]= new Arrayexample(10);
		arr[1]= new Arrayexample(20);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
