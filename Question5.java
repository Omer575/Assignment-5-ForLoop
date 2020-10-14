package Day_11_Control_Flow_Statements_Part5;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		/*Print the table of 12 using for loop.
		Output should be in following format:
		12 X 1 = 12
		12 X 2 = 24
		12 X 3 = 36
		12 X 4 = 48
		12 X 5 = 60
		12 X 6 = 72
		12 X 7 = 84
		12 X 8 = 96
		12 X 9 = 108
		12 X 10 = 120
	 */
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the table number: ");
		int num = scan.nextInt();

//		for(int j=1; j<=num; j++) {
//			System.out.println("Table of " + j);
		System.out.println("The Table of " + num);
		for (int i = 1; i <= 10; i++) {

			int result = num * i;
			System.out.println(num + "X" + i + "=" + result);

		}
//			System.out.println();
//		}

	}
}
