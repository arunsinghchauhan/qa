package assignments;

import java.util.Scanner;

public class Prime {

	int n;
	public void PrimeOrNot()
	{
		System.out.println("Enter the number to verify it is prime or not: ");
		Scanner read= new Scanner(System.in);
		n=read.nextInt();
		
		for(int i=2; i<n;i++)
		{
			if(n%i==0)
				break;
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		

	}

}
