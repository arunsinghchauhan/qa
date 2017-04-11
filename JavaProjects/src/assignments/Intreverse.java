package assignments;
import java.util.Scanner;

public class Intreverse {
Scanner read= new Scanner(System.in);
int num,reverse=0;

void takein()
	{
		System.out.println("Enter any number that you want to reverse :");
		num=read.nextInt();
	}

void toreversenumber()
{
	while(num>=1)
	{
		reverse= reverse*10;
		reverse= reverse+num%10;
		num=num/10;
	}
	
	System.out.println("The reverse of the number that you have entered is :"+reverse);
	
	
}
	public static void main(String[] args) {

		Intreverse t= new Intreverse();
		t.takein();
		t.toreversenumber();
	}

}
