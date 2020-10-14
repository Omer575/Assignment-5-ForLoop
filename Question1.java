package Day_11_Control_Flow_Statements_Part5;

public class Question1 {

	public static void main(String[] args) {
		/*
		 * Write a for loop that displays the following set of numbers:
		 * 
		 * 0,10,20,30,40,50,...1000
		 */

		for (int num = 0; num <= 1000; num += 10) {
			System.out.print(num + ",");
		}

	}

}
