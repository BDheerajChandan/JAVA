/* Write a program in JAVA to shift all zeros in a list to an end.*/
import java.io.*;
class Shift0toend_JAVA_2
{
	public static void main(String args[])throws IOException
	{
		int N=7;
		int arr[]={1,2,0,3,0,4,5,0,6};
		int a[]=new int[N];
		int c=0;
		System.out.print("ARRAY BEFORE SHIFTING ALL 0s TO END\t:");
		for(int i=0;i<N;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<N;i++)
		{
			if(arr[i]!=0)
			{
				a[c]=arr[i];
				c++;
			}
		}
		for(int i=0;i<N;i++)
		{
			if(arr[i]==0)
			{
				a[c-1]=arr[i];
				c++;
			}
		}
		for(int i=0;i<N;i++)
		{
			arr[i]=a[i];
		}
		System.out.print("ARRAY AFTER SHIFTING ALL 0s TO END \t:");
		for(int i=0;i<N;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}