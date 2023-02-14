import java.util.Scanner;

class Student{
	int rollno; //4bytes
	String name;//2bytes
	String city;//2bytes

	public void setStudent(){
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER ROLLNO - ");
		rollno = sc.nextInt();
		System.out.print("ENTER NAME   - ");
		name = sc.next();
		System.out.print("ENTER CITY   - ");
		city = sc.next();
	}

	public void getStudent(){
		System.out.println("ROLL NO - "+rollno);
		System.out.println("NAME    - "+name);
		System.out.println("CITY    - "+city);
	}
}

class ClassesAndObjects{
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		System.out.println("ENTER DATA FOR STUDENT 1");
		s1.setStudent();
		System.out.println("ENTER DATA FOR STUDENT 2");
		s2.setStudent();
		System.out.println("ENTER DATA FOR STUDENT 3");
		s3.setStudent();

		s1.getStudent();
		System.out.println();
		s2.getStudent();
		System.out.println();
		s3.getStudent();

		System.out.println("_____________");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}