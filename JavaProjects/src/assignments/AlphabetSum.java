package assignments;

import java.util.Scanner;

public class AlphabetSum {
	String input;
	int sum = 0;

	void take_input() {
		System.out.println("Enter a four digits word");
		Scanner read = new Scanner(System.in);
		input = read.nextLine().toUpperCase();

		// if(input.length()>4||input.length()<4)
		// {
		// System.out.println("Please enter the four digits word ");
		// take_input();
		// }

	}
	
	

	

	public static void main(String[] args) {
		AlphabetSum obj = new AlphabetSum();
		obj.take_input();
		//obj.calculate();
	}

}
