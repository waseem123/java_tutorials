import java.util.Scanner;

class NoParameterReturn {
	public static int multiplication(){
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER FIRST NUMBER - ");
		int fnum = sc.nextInt();
		System.out.print("ENTER SECOND NUMBER - ");
		int snum = sc.nextInt();

		int result = fnum * snum;
		return result;

	}
	public static void main(String[] args) {
		int x = multiplication();
		System.out.println("Multiplication is "+x);
		System.out.println("Multiplication is "+multiplication());
	}
}