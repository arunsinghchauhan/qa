package assignments;

import java.util.Scanner;

public class Learnig {
	
	String name;
	String option;
	String optionL;
	Scanner read;
	public void take_name()
	{
		System.out.println("Enter your name");
		read = new Scanner(System.in);
		name = read.next();
		
	}
	public void display_name()
	{
		System.out.println("Your name is" + name);
		ask_again();
	}
	public void ask_again()
	{
		System.out.println("Do you want to see your name again");
		option = read.next();
		optionL = option.toLowerCase();
		if(optionL.equals("yes"))
		{
			display_name();
		}
		else
		{
			System.out.println("Thanks for your time");
		}
		
		
		read.close();
	}
	
	
public static void main(String[] args)
{
	Learnig L = new Learnig();
	L.take_name();
	L.display_name();
}

}
