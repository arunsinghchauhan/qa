package assignments;
import java.util.Scanner;

public class Factorialcheck {

	Scanner read= new Scanner(System.in);
	int num;
	int f=1;
	public void take()
	{
		System.out.println("Enter a number which you want to find factorial: ");
		num=read.nextInt();
		
	}
	
	void logic()
	{
		for(int i=1;i<=num;i++)
		{
			f= f*i;
		}
		System.out.println("The factorial of "+num+" is :"+f);
	}
	
	public static void main(String[] args) {
		Factorialcheck fc= new Factorialcheck();
		fc.take();
		fc.logic();

	}

}
