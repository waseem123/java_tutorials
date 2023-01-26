import java.util.Scanner;

class ScannerInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER FIRST NAME - ");
		String fname = s.next();
		System.out.println("ENTER LAST NAME - ");
		String lname = s.next();

		System.out.println("My name is "+fname+" "+lname);
	}
}