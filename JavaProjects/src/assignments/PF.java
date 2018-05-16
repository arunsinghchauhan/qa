package assignments;

import java.util.Scanner;

public class PF {

	int n,i=2;
	void takedata()
	{
		System.out.println("Enter the number you want to get prime factors: ");
		Scanner read=new Scanner(System.in);
		n=read.nextInt();
	}
	
	void primefactor()
	{
		System.out.println("The prime factors of "+n+" are : ");
		while(n>1)
		{
			if(n%i==0)
			{
				System.out.println(i+" ");
				n=n/i;
			}
			else
			{
				i++;
			}
		}
		
		
	}
	public static void main(String[] args) {
		PF pf= new PF();
		pf.takedata();
		pf.primefactor();

	}

}
