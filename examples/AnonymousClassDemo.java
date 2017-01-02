// AnonymousClassDemo.java
// Shows anonymous class java syntax

public class AnonymousClassDemo {
	public static void main(String[] args) {

		NumberCarrier anObject = new NumberCarrier() {
				private int number;
				public void setNumber(int value) {
					number = value;
				}
				public int getNumber() {
					return number;
				}
		}; // Notice the semi-colon

		NumberCarrier anotherObject = new NumberCarrier() {
				private int number;
				public void setNumber(int value) {
					number = 2*value;
				}
				public int getNumber() {
					return number;
				}
		};

		anObject.setNumber(42);
		anotherObject.setNumber(39);
		showNumber(anObject);
		showNumber(anotherObject);
	}

	public static void showNumber(NumberCarrier o) {
		System.out.println(o.getNumber());
	}
}
