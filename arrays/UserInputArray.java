import java.util.Scanner;

class UserInputArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		for (int i=0; i<6; i++) {
			System.out.print("ENTER "+(i+1)+"th NUMBER - ");
			arr[i] = sc.nextInt();
		}

		for (int i=0; i<6; i++) {
			System.out.println((i+1)+"->"+arr[i]);
		}

	}
}