// TernaryOperatorsDemo.java
// An example program that demonstrates the Ternary operator in java

public class TernaryOperatorsDemo {
	public TernaryOperatorsDemo() {
		int x = 10, y = 12, z = 0;
		z = (x > y) ? x : y;
		/*
		Sample insisted this format, but it doesn't compile
		z = x &gt;
		y ? x:y;
		*/
		System.out.println("z:" + z);
	}

	public static void main(String args[]) {
		new TernaryOperatorsDemo();
   	}
}
