package assignments;

import java.util.Scanner;

public class AlphabetSum {
	String input;
	int x = 0;

	void take_input() {
		System.out.println("Enter a four digits word");
		Scanner read = new Scanner(System.in);
		input = read.next().toUpperCase();

		// if(input.length()>4||input.length()<4)
		// {
		// System.out.println("Please enter the four digits word ");
		// take_input();
		// }

	}

	void calculate() {

		switch (input) {
		case "A":
			x = x + 1;
			break;

		case "B":
			x = x + 2;
			break;

		case "C":
			x = x + 3;
			break;

		case "D":
			x = x + 4;
			break;

		case "E":
			x = x + 5;
			break;

		case "F":
			x = x + 6;
			break;

		case "G":
			x = x + 2;
			break;

		case "H":
			x = x + 2;
			break;

		case "I":
			x = x + 2;
			break;

		case "J":
			x = x + 2;
			break;

		case "K":
			x = x + 2;
			break;

		case "L":
			x = x + 2;
			break;

		case "M":
			x = x + 2;
			break;

		case "N":
			x = x + 2;
			break;

		case "O":
			x = x + 2;
			break;

		case "P":
			x = x + 2;
			break;

		case "Q":
			x = x + 2;
			break;

		case "R":
			x = x + 2;
			break;
	
		case "S":
			x = x + 2;
			break;
		
		case "T":
			x = x + 2;
			break;
		
		case "B":
			x = x + 2;
			break;
		case "B":
			x = x + 2;
			break;
		case "B":
			x = x + 2;
			break;
		case "B":
			x = x + 2;
			break;
		case "B":
			x = x + 2;
			break;
		case "B":
			x = x + 2;
			break;
		case "B":
			x = x + 2;
			break;
		case "B":
			x = x + 2;
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		AlphabetSum obj = new AlphabetSum();
		obj.take_input();
		// obj.calculate();
	}

}
