package assignments;

import java.util.Scanner;

public class NumberOfClumps {
	Scanner read = new Scanner(System.in);
	int i, count = 0;
	int array[] = new int[10];

	public void arrayelements() {
		System.out.println("Enter the elements of array: ");

		for (i = 0; i <= 9; i++) {

			array[i] = read.nextInt();
		}

		System.out.println("Your entered array is:");
		for (i = 0; i <= 9; i++) {

			System.out.print("[" + array[i] + "]");
		}
	}

	void applyLogic() {
		for (i = 0; i < 9; i++) {
			if (array[i] == array[i + 1]) {
				count++;
			}
		}
		System.out.println();
		System.out.println("The number of clumps are: " + count);

	}

	public static void main(String[] args) {
		NumberOfClumps nc = new NumberOfClumps();
		nc.arrayelements();
		nc.applyLogic();

	}

}
