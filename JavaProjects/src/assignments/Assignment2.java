package assignments;
import java.util.Scanner;

public class Assignment2 {

	double mealPrice;
	int tipPercent;
	int taxPercent;
	float totalAmount;
	
	void takeInput()
	{
		System.out.println("Please enter the meal price ");
		Scanner read=new Scanner(System.in);
		mealPrice= read.nextDouble();
		
		System.out.println("Please enter the tip percent ");
		tipPercent=read.nextInt();
		
		System.out.println("Please enter the tax percent ");
		taxPercent=read.nextInt();
		
	}
	
	void calculate()
	{
		totalAmount= (float) (mealPrice + mealPrice*tipPercent*0.01 +mealPrice*taxPercent*0.01);
		
	}
	
	void display()
	{
		System.out.println("The Total payment including all taxes is: "+totalAmount);
		
	}
	
	
	
	
	public static void main(String[] args) {

		Assignment2 A2= new Assignment2();
		A2.takeInput();
		A2.calculate();
		System.out.println(".............................");
		A2.display();
	}

}
