/*Write a program in java to print an accepted name by an user */
import java.io.*;
public class Print_Name2 
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		System.out.print("Enter the name : ");
		String name=input.readLine();
		System.out.println(name);
	}
}
