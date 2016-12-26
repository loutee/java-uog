// SwitchExample.java
// Shows an example for a switch statement in java

public class SwitchExample{
	public static void main(String[] args) {
		int day = 6;
		String dayName = null;
		switch(day) {
			case 1:
			   dayName = "Sunday";
			   break;
			case 2:
			   dayName = "Monday";
			   break;
			case 3:
			   dayName = "Tuesday";
			   break;
			case 4:
			   dayName = "Wednesday";
			   break;
			case 5:
			   dayName = "Thursday";
			   break;
			case 6:
			   dayName = "Friday";
			   break;
			case 7:
			   dayName = "Saturday";
			   break;
			default:
			   System.out.println("This is the default case execution");
			   break;
		}

		System.out.println(dayName);

	}
}
