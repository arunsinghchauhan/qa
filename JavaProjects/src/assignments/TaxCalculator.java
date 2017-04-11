package assignments;

import java.util.Scanner;

public class TaxCalculator {

	Scanner read= new Scanner(System.in);
	public void gender()
	{
		System.out.println("Enter your gender: ");
		String gend= read.next();
		if(gend.equalsIgnoreCase("Male"))
		{
			System.out.println("Enter your package in rupees: ");
			int pack=read.nextInt();
			if(pack<=250000)
			  {
				System.out.println("As yor are lie in slab 1...You are out of tax submission process.");
			  }
			if(pack>250000 && pack<=500000)
			{
				System.out.println("Please provide your HRA:");
				int hra=read.nextInt();
				
				System.out.println("Please enter your savings:  ");
				int saving=read.nextInt();
				
				int finalamount=pack-(hra+saving);
				System.out.println("The the amount in which tax calculated is :"+finalamount);
				
				double tax1=finalamount*(0.05);
				
				System.out.println("As yor are lie in slab 2..you have tax rate of 5%.\nThe total tax you have to pay to central government of India is: "+tax1);
			}
			if(pack>500000 && pack<=1000000)
			{
				System.out.println("Please provide your HRA:");
				int hra=read.nextInt();
				
				System.out.println("Please enter your savings:  ");
				int saving=read.nextInt();
				
				int finalamount=pack-(hra+saving);
				System.out.println("The the amount in which tax calculated is :"+finalamount);
				
				double tax1=finalamount*(0.2);
				
				System.out.println("As yor are lie in slab 3..you have tax rate of 20%.\nThe total tax you have to pay to central government of India is: "+tax1);
			}
			if(pack>1000000)
			{
				System.out.println("Please provide your HRA:");
				int hra=read.nextInt();
				
				System.out.println("Please enter your savings:  ");
				int saving=read.nextInt();
				
				int finalamount=pack-(hra+saving);
				System.out.println("The the amount in which tax calculated is :"+finalamount);
				
				double tax1=finalamount*(0.3);
				
				System.out.println("As yor are lie in slab 4..you have tax rate of 30%.\nThe total tax you have to pay to central government of India is: "+tax1);
			}
		}
	}
	
	public static void main(String[] args) {
		
		TaxCalculator tc= new TaxCalculator();
		tc.gender();
	}

}
