package project1;

public class StringUtil {

	public static void main(String[] args) {
		String firstName = "Rajesh";
		String lastName = "k";
		String fullName = firstName + lastName;
		System.out.println("Name:" +fullName);
		displayName(fullName); //calling a method
		System.out.println("completed");
	}
	//method declaration,method definition
	public static void displayName(String name) {
		System.out.println(name);
	}

}
