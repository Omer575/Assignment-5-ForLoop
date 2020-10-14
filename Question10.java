package Day_11_Control_Flow_Statements_Part5;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		/*
		 * Print following output using nested for loops: 
		 * 1 
		 * 22 
		 * 333 
		 * 4444 
		 * 55555 
		 * 666666
		 * 7777777
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int upperBound = scan.nextInt();

		for (int i = 1; i <= upperBound; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
