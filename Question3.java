package Day_11_Control_Flow_Statements_Part5;

public class Question3 {

	public static void main(String[] args) {
		/*
		 * Write a program that displays the number of even numbers between 5 and 50
		 * (included)
		 */

		for (int num = 5; num <= 50; num++) {
			if (num % 2 == 0) {
				System.out.println(num + ",");
			}

		}

	}
}
