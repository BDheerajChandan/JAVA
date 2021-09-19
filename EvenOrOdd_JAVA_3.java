/*Write a program in java to check a number is even or odd.*/
import java.util.*;
import java.io.*;
class EvenOrOdd_JAVA_3
{
    public static void main1(String args[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("\nUSING BUFFEREDREADER :");
        System.out.print("Enter the number : ");
        int n1=Integer.parseInt(input.readLine());
        if(n1%2==0)
        {
            System.out.println(n1+" : is an even number.");
        }else{
            System.out.println(n1+" : is an odd number.");
        }
        
    }
    public static void main2(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nUSING SCANNER CLASS :");
        System.out.print("Enter the number : ");
        int n2=sc.nextInt();
        if(n2%2==0)
        {
            System.out.println(n2+" : is an even number.");
        }else{
            System.out.println(n2+" : is an odd number.");
        }
    }
}