package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeFactorEx {
 
	int n,x=0, number;
	int j=0;
	int[] arr = new int[10];
	void primefact()
	{
		System.out.println("Enter the number, you want prime factors: ");
		Scanner read= new Scanner(System.in);
		try
		{
		n=read.nextInt();
		number = n;
		}catch(InputMismatchException i)
		{
			System.out.println("please enter the numerical value");
			primefact();
		}
		
	}
	
	void logicPrime()
	{
		
		System.out.println("The prime factors of "+n+" is: ");
		int i=2;
		while(n>1)
		{
			if(n%i==0)
			{
				System.out.println(i);
				arr[j] = i;
				j++;
				n=n/i;
				
			}
			
			
			else
			{
				i++;
			}
			
		}
		
		
	}
	
	void print()
	{
		while(arr[x]!=0)
		{
			System.out.print(arr[x] + "*");
			x++;
			
		}
		System.out.println("=" + number);
	}
	
	
	public static void main(String[] args) {
		
		PrimeFactorEx pfe= new PrimeFactorEx();
	
		pfe.primefact();
		pfe.logicPrime();
		pfe.print();
		
	} 

	}


