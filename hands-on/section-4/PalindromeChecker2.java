// PalindromeChecker2.java
// Video's solution for section 4 assignment
import java.util.Scanner;

public class PalindromeChecker2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string to check if it is a palindrome");
		String word = in.nextLine();	
		String reverse = "";

		int length = word.length();

		for (int i = length-1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		
		if (word.equals(reverse)) {
			System.out.println("Entered string is a palindrome");
		} else {
			System.out.println("Entered string is not a palindrome");
		}
	}
}
