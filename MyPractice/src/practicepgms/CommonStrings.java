package practicepgms;

public class CommonStrings {
	
	public static void main(String[] args) {
		
		String str[]={"rajeev", "raghavendra", "Santosh", "Ganesha", "Ayyappa", "rajeev", "rajeev", "rajeev"};
		String temp = null;
		for(int i=0; i<str.length; i++)
		{
			for(int j=0; j<str.length; j++)
			{
				if(i!=j)
				{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					if(temp == null){
						temp = str[j];
					}
					else if(temp!=null && temp.equalsIgnoreCase(str[j])){
						System.out.println(str[j]);
					}
				}
				}
			}
		}
		
	}

}
