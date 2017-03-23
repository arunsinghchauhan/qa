package assignments;
import java.util.Scanner;

public class Assignment1 {

	int age;
	float money;
	double earthRadius;
	long amount; //more space to handle than int.
	byte b;    //-128 to 127
	short s;  //-32768 to 32767
	boolean flag1;
	boolean flag2;
	boolean flag3=true;
	char c; //used to store characters.
	
	
	
	void takeInput()
	{
		System.out.println("Enter the integer age");
		Scanner read= new Scanner(System.in);
		age= read.nextInt();
		
		System.out.println("Enter the float money");
		money=read.nextFloat();
		
		System.out.println("Enter the double Earth radius");
		earthRadius=read.nextDouble();
		
		System.out.println("Enter the long amount");
		amount=read.nextLong();
		
		System.out.println("Enter the bytes u get");
		b=read.nextByte();
		
		System.out.println("Enter the short number");
		s=read.nextShort();
		
		System.out.println("Enter the first boolean");
		flag1= read.nextBoolean();
		
		System.out.println("Enter the second boolean");
		flag2= read.nextBoolean();
		
		System.out.println("Enter a character");
	    c= read.next().charAt(0);
		//c=read.nextChar();
		
		
	}
	
	void usedDataTypes()
	{
		if(age>0)
		{
		System.out.println("Entered age of the student is: "+age);
		}
		else
		{
			System.out.println("You have entered invalid number");// not run 
		}
		
		System.out.println("Entered money of debt is: "+money);
		System.out.println("Entered radius of earth is: "+earthRadius);
		System.out.println("Entered amount to be pay is: "+amount);
		System.out.println("Entered bytes u get is: "+b);
		System.out.println("Entered short number is: "+s);
		System.out.println("Entered first boolean is: "+flag1);
		System.out.println("Entered second  boolean is: "+flag2);
		
		if(flag1==true && flag2==true)
		{
			System.out.println("Both booleans have true values "+flag3);
		}
		
		else{
			System.out.println("Any of the boolean have false value ");
		}
		System.out.println("Entered single character is: "+c);
		
	}
	
	
	public static void main(String[] args) {
		Assignment1 A1=new Assignment1();
		
		A1.takeInput();
		System.out.println("...............................");
		A1.usedDataTypes();
		
		
		
	}

}
