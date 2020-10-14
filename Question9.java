package Day_11_Control_Flow_Statements_Part5;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		/*
		 * Write a program for the following logic: Print all the odd numbers in
		 * comma-separated form from 1 till the end (you may change it): if end =
		 * 10,OUTPUT = 1, 3, 5, 7, 9 if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
		 * 
		 * You should use while loop and if-else statements. Note that, there should not
		 * be any comma after the last digit.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scan.nextInt();

		int i = 1;

		while (i <= n) {
			if (i % 2 == 1) {
				System.out.print(i);
				if (n % 2 == 1 && i != n) {
					System.out.print(", ");
				} else if (n % 2 == 0 && i != n - 1) {
					System.out.print(", ");
				}
			}
			i++;
		}
	}
}
