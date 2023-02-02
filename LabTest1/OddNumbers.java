package LabTest1;
public class OddNumbers {

	public static void main(String[] args) {
		int n=20;
		//calling method
		oddNumbers(n);

	}
	//print the odd numbers using method
	public static void oddNumbers(int n1)//called method
	{
		System.out.println("The odd numbers 1 to 20 are :");
		//print the odd numbers
		for(int i=1;i<=n1;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		}

	}

}
