package assignments;

import java.util.Scanner;

public class Assignment3 {
 
	int n;
	void takeInput()
	{
		System.out.println("Enter a numer to check even or odd: ");
		Scanner read=new Scanner(System.in);
		n=read.nextInt();
	}
	
	void calculate()
	{
		
		if(n%2==0 && n>=20)
		{
			System.out.println("Even number");
			
		}
		else if(n>=2 && n<=5 && n%2==0)
			{
				System.out.println("Not weried");
			}
			
		else if(n>=6 &&n<=20 && n%2==0)
			{
			  System.out.println("Weried");
				
			}
		
		else
		{
			System.out.println("Odd number: Weried");
		}
		
	}
	
	public static void main(String[] args) 
	
	{
		Assignment3 A3= new Assignment3();
		A3.takeInput();
		A3.calculate();
		
		
	}

}
