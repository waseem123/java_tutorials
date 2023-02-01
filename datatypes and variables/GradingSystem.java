import java.util.Scanner;

class GradingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER MARKS OF SUBJECT 1 - ");
		int subject1 = sc.nextInt();
		
		System.out.print("ENTER MARKS OF SUBJECT 2 - ");
		int subject2 = sc.nextInt();
		
		System.out.print("ENTER MARKS OF SUBJECT 3 - ");
		int subject3 = sc.nextInt();

		int total = subject1 + subject2 + subject3;

		double percentage = (total*100)/300;
		
		String grade = "";
		if(percentage>=80){
			grade = "DISTINCTION";
		}else if(percentage>=60){
			grade = "FIRST CLASS";
		}else if(percentage>=50){
			grade = "SECOND CLASS";
		}else if(percentage>=40){
			grade = "PASS";
		}else{
			grade = "FAIL";
		}

		System.out.println("SUBJECT 1  - "+subject1);
		System.out.println("SUBJECT 2  - "+subject2);
		System.out.println("SUBJECT 3  - "+subject3);
		System.out.println("TOTAL      - "+total);
		System.out.println("PERCENTAGE - "+percentage);
		System.out.println("GRADES     - "+grade);
	}
}