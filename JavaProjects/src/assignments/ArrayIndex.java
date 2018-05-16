package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndex {

	String arr[];
	Scanner read = new Scanner(System.in);
	int l, i, location;
	String s, value;

	void arrSize() {
		try {
			System.out.println("Enter the length of the array: ");
			l = read.nextInt();
		} catch (InputMismatchException i) {
			System.out.println("Please enter only integer value");
			read.nextLine();//to clear previous value of buffer     
			arrSize();
                 
		}
		arr = new String[l];
	}

	void askValues() {

		for (i = 0; i < arr.length; i++) {
			System.out.println("Enter value");
			value = read.next();
			System.out.println("Enter Location");
			location = read.nextInt();
			arr[location] = value;

		}

	}

	public void yourArray() {
		System.out.println("Your array is");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

	public static void main(String[] args) {
		ArrayIndex ai = new ArrayIndex();
		ai.arrSize();
		ai.askValues();
		ai.yourArray();

	}

}
