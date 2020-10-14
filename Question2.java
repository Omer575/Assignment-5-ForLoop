package Day_11_Control_Flow_Statements_Part5;

public class Question2 {

	public static void main(String[] args) {
		/*
		 * Write a program that displays all odd numbers between 3-130 in the same line
		 */
		for (int num = 3; num <= 130; num++)
			if (num % 2 != 0) {
				System.out.print(num + ", ");
			}

	}
}
