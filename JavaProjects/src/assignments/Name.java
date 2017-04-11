package assignments;

import java.util.Scanner;

public class Name {
	String name;
	
	public void question()
	{
		System.out.println("What is your name?");
		Scanner read= new Scanner(System.in);
		name=read.next();
	
	}
	
	
	void answer()
	{
		
		System.out.println("Your name is "+name);
		yesno();
		
	}
	
	void yesno()
	{
		System.out.println("Do u want to see your name again?");
		Scanner read= new Scanner(System.in);
		String s= read.next();
		if(s.equalsIgnoreCase("yes"))
		{
			//System.out.println("Checkpoint");
			this.answer();
		}
		else
		{
			System.out.println("Thank you");
		}
	}
	
	public static void main(String[] args) {
		Name name= new Name();
		
		name.question();
		name.answer();
		name.yesno();

	}

}
