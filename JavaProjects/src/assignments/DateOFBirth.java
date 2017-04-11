package assignments;

import java.util.Scanner;

public class DateOFBirth {
String s;
	
void takeInputs()
	{
		System.out.println("Enter your birth month: ");
		Scanner read= new Scanner(System.in);
	    s=read.next();
		
	}
	
void rashi()
{
	if(s.equalsIgnoreCase("January"))
		System.out.println("your rashi is: Libra");
}

void calci()
	{
		
	}
	
	public static void main(String[] args) {
		DateOFBirth tn= new DateOFBirth();
		tn.takeInputs();
		tn.rashi();

	}

}
