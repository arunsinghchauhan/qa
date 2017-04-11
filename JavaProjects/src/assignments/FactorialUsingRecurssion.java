package assignments;

import java.util.Scanner;

public class FactorialUsingRecurssion {

	int n;
	
		public void takingNumber()
		
		{
			System.out.println("Enter the number you want to find factorial: ");
			Scanner read= new Scanner(System.in);
			n= read.nextInt();
		}
		
		int factlogicrecurssion(int n)
		{
			if(n==0)
			{
				return 1;
			}
			else
			{
				return n*factlogicrecurssion(n-1);
			}
		}
	
	
	public static void main(String[] args) {
		FactorialUsingRecurssion re= new FactorialUsingRecurssion();
		re.takingNumber();
		//re.factlogicrecurssion(5);
		int result=re.factlogicrecurssion(re.n);
		System.out.println(result);

	}

}
