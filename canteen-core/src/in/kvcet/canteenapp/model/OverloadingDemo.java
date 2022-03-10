

package in.kvcet.canteenapp.model;

public class OverloadingDemo {

	// overloading = > Same method
	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static String add(String a, String b) {
		return a + b;
	}

	public static void main(String[] args) {

		int result = add(2, 3);
		System.out.println(result);
		int result2 = add(3, 4, 5);
		System.out.println(result2);

		String result3 = add("Naresh", "Kumar");
		System.out.println(result3);
	}

}
