package Day_11_Control_Flow_Statements_Part5;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		/*
		 * Write a while loop that lets the user enter a number. The number should be
		 * multiplied by 10, and the result stored in the variable product. The loop
		 * should iterate as long as product contains a value less than 100.
		 */

		Scanner scan = new Scanner(System.in);
		int product = 0;

		while (product < 100) {
			System.out.println("Enter a number:");
			int num = scan.nextInt();
			product = num * 10;
			System.out.println("the product value is " + product);
		}
		System.out.println("The end ");

	}
}
