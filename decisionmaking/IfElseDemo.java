import java.util.Scanner;

class IfElseDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ENTER A NUMBER - ");
		int num = s.nextInt();
		int result = num%2;
		if(result==0){
			System.out.println(num+" IS EVEN.");
		}else{
			System.out.println(num+" IS ODD.");
		}

	}
}