// NestedIfExample.java
// Shows an example of a nested if statement in java

public class NestedIfExample {
	public static void main(String[] args) {
		int a=15;
		if (a > 5) {
			System.out.println("a is greater than 5");
			if (a > 10) {
				System.out.println("a is also greater than 10");
			}
		}
	}
}
