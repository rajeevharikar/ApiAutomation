package practicepgms;

public class PushingOddsAndEvens {
	
	
	public static void main (String[] args)
    {
	int a[] ={10,11,21,22,2,4,6,5,8,25};
	int evenCount=0, oddCount = a.length-1;
//	int i,j;
	
	for(int i=0;i<a.length;i++)
    {
        for(int j=1;j<a.length;j++)
        {
            int temp;
            if(a[i]%2!=0 && a[j]%2==0 && j>i)
            {
                temp=a[j];
                a[j]=a[i];
                a[j]=temp;
                break;     //There seems to be some problem in this loop
            }
        }
        System.out.println("The "+(i+1)+" integer = "+a[i]);
    }
    }}
 