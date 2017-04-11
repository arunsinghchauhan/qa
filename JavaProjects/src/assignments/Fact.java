package assignments;

import java.util.Scanner;

public class Fact {
int n;
int f=1;
	public void taking()
	
	{
		System.out.println("Enter the number you want to find factorial: ");
		Scanner read= new Scanner(System.in);
		n= read.nextInt();
	}
	
	void factlogic()
	{
		
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("The factorial of " +n+" is :"+f);
	}
	
	
	
	public static void main(String[] args) {
		Fact f= new Fact();
		f.taking();
		f.factlogic();

	}

}
