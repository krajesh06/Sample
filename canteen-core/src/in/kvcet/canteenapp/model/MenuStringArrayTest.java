package in.kvcet.canteenapp.model;



import java.util.Arrays;

public class MenuStringArrayTest {

	public static void main(String[] args) {
		// Skill: How to store data in arrays ?
		String[] menus = new String[2];
		menus[0] = "Idly";
		menus[1] = "Dosai";

		System.out.println(Arrays.toString(menus));

		// How to retrieve data from arrays
		System.out.println("For Loop");
		for (int i = 0; i < menus.length; i++) {
			System.out.println(menus[i]); // menus[0] , menus[1]
		}
		// foreach loop
		System.out.println("Using foreach loop");
		for (String menu : menus) {
			System.out.println(menu);
		}

	}
}
