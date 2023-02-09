package LabTest2;
import java.util.Scanner;
public class Duplicate_Values{
public static void main(String[] args) {
		int n1;
		Scanner sc=new Scanner(System.in);
		//Enter the Number of String user Taking 
		System.out.println("Enter the number of String: ");
		n1=sc.nextInt();
		String[] str=new String[n1];
		//Enter the String
		System.out.println("Enter the strings: ");
		for(int i=0;i<n1;i++)
		{
			str[i]=sc.next();
		}
		//Print the Duplicate Value
		for(int i=0;i<n1;i++)
		{
			for(int j=i+1;j<n1;j++)
			{
				if(str[i].equals(str[j]) && (i!=j))
					System.out.println("Duplicate value is: "+str[j]);
			
		}
		}
		}
}
		