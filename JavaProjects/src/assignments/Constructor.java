package assignments;

import java.util.Scanner;

public class Constructor {

	Constructor()
	{
		System.out.println("Default constructor");
	}
	
	Constructor(int x, int y)
	{
		System.out.println("Enter two numbers");
		Scanner read= new Scanner(System.in);
		read.nextInt();
		read.nextInt();
		int sum=x+y;
		System.out.println("The sum is: "+sum);
		
	}
	
}
