/* Write a program to split into sentence into words. */
import java.io.*;
public class SepStr_JAVA_1 
{
	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		System.out.print("ENTER THE STRING : ");
		String s=input.readLine();
		s=s+" ";
		String str="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				System.out.println(str);
				str="";
			}else{
				str=str+s.charAt(i);
			}
		}
	}
}

