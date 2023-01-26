import java.util.Scanner;

class NestedIf {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ENTER YOUR AGE - ");
		double age = s.nextDouble();

		if(age>=18){
			System.out.print("DO YOU HAVE VOTER ID - (Y - Yes | N - No)");
			char voterId = s.next().charAt(0);

			if(voterId=='Y'){
				System.out.println("CONGRATULATIONS! You can vote.");
			}else{
				System.out.println("SORRY! You can not vote.");
			}
		}else{
			System.out.println("You are not eligible.");
		}
	}
}