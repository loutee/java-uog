// TestArray.java
// Shows how to create, initialize, and process arrays in java

public class TestArray {
	public static double[] reverse(double[] list) {
		double[] result = new double[list.length];
		for (int i=0, j=result.length-1; i < list.length; i++, j--) {
			result[j] = list[i];
		}
		return result;
	}

	public static void main(String[] args) {
		double[] myList = {1.9, 2.9, 3.4, 3.5};

		// Print all array elements
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + " ");
		}

		// Print sum of array elements
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println("Total is " + total);

		// Find the largest element
		double max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max) {
				max = myList[i];
			}
		}
		System.out.println("Max is " + max);

		// Print reversed array
		double[] reverseList = reverse(myList);
		for (int i = 0; i < reverseList.length; i++) {
			System.out.println(reverseList[i] + " ");
		}
	}
}
