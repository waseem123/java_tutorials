import java.util.Scanner;

class DoWhileDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c;
		do{
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("ENTER YOUR CHOICE - ");
			int choice = s.nextInt();

			int num1,num2,result;
			

			switch (choice) {
				case 1:
					System.out.print("ENTER FIRST NUMBER - ");
					num1 = s.nextInt();
					System.out.print("ENTER SECOND NUMBER - ");
					num2 = s.nextInt();
					result = num1 + num2;
					System.out.println("ADDITION - "+result);
					break;

				case 2:
					System.out.print("ENTER FIRST NUMBER - ");
					num1 = s.nextInt();
					System.out.print("ENTER SECOND NUMBER - ");
					num2 = s.nextInt();
					result = num1 - num2;
					System.out.println("SUBTRACTION - "+result);
					break;

				case 3:
					System.out.print("ENTER FIRST NUMBER - ");
					num1 = s.nextInt();
					System.out.print("ENTER SECOND NUMBER - ");
					num2 = s.nextInt();
					result = num1 * num2;
					System.out.println("MULTIPLICATION - "+result);
					break;

				case 4:
					System.out.print("ENTER FIRST NUMBER - ");
					num1 = s.nextInt();
					System.out.print("ENTER SECOND NUMBER - ");
					num2 = s.nextInt();
					result = num1 / num2;
					System.out.println("DIVISION - "+result);
					break;

				default:
					System.out.println("INVALID CHOICE.");
			}
			System.out.print("DO YOU WANT TO CONTINUE? 1. YES 2. NO");
			c = s.nextInt();
		}while(c==1);
		System.out.println("THANKS! VISIT AGAIN.");
	}
}