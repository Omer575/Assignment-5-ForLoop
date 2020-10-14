package Day_11_Control_Flow_Statements_Part5;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
//		Print the following output using nested for loops.
//
//		4       3       2      1
//
//		     3       2      1
//
//		         2       1
//
//		              1
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scan.nextInt();

		for (int rows = number; rows >= 1; rows--) {

			for (int space = number; space >= rows; space--) {
				if (space < number) {
					System.out.print(" ");
				}
			}

			for (int col = rows; col >= 1; col--) {

				System.out.print(col + "|");
			}
			System.out.println();

		}

	}
}
