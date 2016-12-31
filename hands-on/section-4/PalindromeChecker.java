// PalindromeChecker.java
// Checks if the string entered by the user is a palindrome
import java.util.Scanner;
import java.util.Arrays;

public class PalindromeChecker {
	public static char[] reverse(char[] list) {
		char[] result = new char[list.length];
		for (int i=0, j=list.length-1; i < list.length; i++, j--) {
			result[i] = list[j];
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Enter a word to check if it is a palindrome:");
		Scanner read = new Scanner(System.in);
		String word = read.nextLine();
		char[] charArray = word.toLowerCase().toCharArray();
		
		if (Arrays.equals(charArray, reverse(charArray))) {
			System.out.println(word + " is a palindrome");
		} else {
			System.out.println(word + " is not a palindrome");
		}
	}
}
