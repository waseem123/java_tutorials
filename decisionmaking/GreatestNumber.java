import java.util.Scanner;

class GreatestNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("ENTER FIRST NUMBER");
		int a = s.nextInt();
		System.out.println("ENTER SECOND NUMBER");
		int b = s.nextInt();
		System.out.println("ENTER THIRD NUMBER");
		int c = s.nextInt();

		if (a>b && a>c) {
			System.out.println(a+" IS GREATER THAN "+b+" AND "+c);
		}else if (b>a && b>c) {
			System.out.println(b+" IS GREATER THAN "+a+" AND "+c);
		}else if (c>a && c>b) {
			System.out.println(c+" IS GREATER THAN "+a+" AND "+b);
		}else{
			System.out.println("EITHER OF THE NUMBER IS EQUAL TO ANOTHER");
		}

	}
}