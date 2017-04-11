package assignments;

import java.util.Scanner;

public class CheckPrime {
int n;
int temp=0;
	void takein()
	{   System.out.println("Enter any numerical value: ");
		Scanner read= new Scanner(System.in);
		n= read.nextInt();
		read.close();
		
	}
	void process()
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				temp=1;
				
			}
			
		}
		
		if(temp==1)
		{
		System.out.println("This number is not prime");
		}
		else
		{
			System.out.println("This number is prime");
		}
	}
	
	public static void main(String args[])
	{
		CheckPrime cp= new CheckPrime();
		cp.takein();
		cp.process();
	}
	
}
