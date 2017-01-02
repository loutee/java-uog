// GradingSystem.java
// Shows letter grades according to specific scale
/*
 * 100 - 90	= A
 * 89 - 80	= B 
 * 79 - 70	= C
 * 69 - 60	= D
 * < 59		= F
 */
import java.util.Scanner;

public class GradingSystem {
	private class Score {
		private int percentage;

		public Score(String stringAmount) {
			int length = stringAmount.length();
			percentage = Integer.parseInt(
					stringAmount.substring(0) );
		}

		private Score grade;

		public void GradingSystem() {
			grade = new Score("0");
		}

		public String getLetterGrade() {
			if (percentage >= 90) {
				return "A";
			} else if (percentage >= 80) {
				return "B";
			} else if (percentage >= 70) {
				return "C";
			} else if (percentage >= 60) {
				return "D";
			} else {
				return "F";
			}
		}
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.printf("Enter score: ");
		String select = read.nextLine();
		GradingSystem student = new GradingSystem();
		GradingSystem.Score total = student.new Score(select);
		System.out.println("Letter grade is: " + total.getLetterGrade());
	}
}
