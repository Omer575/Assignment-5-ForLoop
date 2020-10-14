package Day_11_Control_Flow_Statements_Part5;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {

//		Write nested loop to draw this pattern
//
//		##
//		#  #
//		#   #
//		#    #
//		#     #
//		#      #
//		#        #
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scan.nextInt();

		for (int row = 1; row <= number; row++) {

			System.out.print("#");
			for (int space = 1; space <= row; space++) {
				if (space < row) {
					System.out.print(" ");
				}
			}
			System.out.println("#");
		}

	}
}
