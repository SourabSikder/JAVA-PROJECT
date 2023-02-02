package LabTest1;

public class Alternate {

	public static void main(String[] args) {
		//array declaration and initialization
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("The sum of alternative numbers are :"+alternate(a));
		
	}
	
	public static int alternate(int a1[])
	{
		int j=0,sum=0;
		int b[]=new int[a1.length];//array declaration and memory allocation
		System.out.println("The alternative array is: ");
		//print alternative array 
		for(int i=1;i<a1.length;i+=2)
		{
			b[j]=a1[i];
			System.out.println(b[j]);
			sum+=b[j];//calculate the sum of alternative array values
			j++;	
		}
		return sum;//return sum value to main method
	}

}