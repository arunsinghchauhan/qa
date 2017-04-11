package assignments;
import java.util.Scanner;

public class ReverseOfNumber {
	int r; int s=0;
	
	
	void calculate()
	{
		
		System.out.println("Enter the number: ");
		Scanner read= new Scanner(System.in);
		int n=read.nextInt();
		int temp=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		System.out.println("Reverse of the entered number is: "+s);
		
		if(s==temp)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a palindrome number");
		}
		
	}
	
	public static void main(String[] args) {
		ReverseOfNumber rev= new ReverseOfNumber();
		rev.calculate();
		
   
	}

}
