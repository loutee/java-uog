// InvSys.java
// An inventory system that lets the user select an item
import java.util.Scanner;

public class InvSys {
	public static void main(String[] args) {
		System.out.println("1: Flashlight");
		System.out.println("2: Water Bottle");
		System.out.println("3: Hatchet");
		System.out.println("4: Energy Bar");
		System.out.println("5: Matches");
		Scanner r = new Scanner(System.in);
		System.out.printf("Enter item id: ");
		int select = r.nextInt();
		String item = null;
		switch(select) {
			case 1:
				item = "flashlight";
				break;
			case 2:
				item = "water bottle";
				break;
			case 3:
				item = "hatchet";
				break;
			case 4:
				item = "energy bar";
				break;
			case 5:
				item = "matches";
				break;
			default:
				break;
		}
		if (item != null) {
			System.out.println("You have selected " + item + ".");
		} else {
			System.out.println("Selection invalid");
		}
	}
}
