package assignments;

import java.util.Scanner;

public class Assignment7 {

	int n,i=2;
	Scanner read=new Scanner(System.in);
	void takeInput()
	{
		System.out.println("Enter number to find prime factors of it:");
		n=read.nextInt();
	}
	
	void calculation()
	{
		
		
		while(i<=n)
		{
			
			if(n%i==0)
			{
				System.out.println("Prime factors of "+n+"is:"+i);
				n=n/i;
			}
			
			else
			{
				i++;
			}
			
		}
	}
	
	
	public static void main(String[] args) {

		Assignment7 A7=new Assignment7();
		A7.takeInput();
		A7.calculation();
	}

}
