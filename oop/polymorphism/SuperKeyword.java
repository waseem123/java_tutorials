import java.util.Scanner;

class Student{
	String name;
	int rollno;

	public void setData(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER ROLL NO - ");
		rollno = sc.nextInt();

		System.out.print("ENTER NAME - ");
		name = sc.next();
	}
	public void getData(){
		System.out.println("NAME - "+name);
		System.out.println("ROLL NO - "+rollno);
	}
}


class EngineeringStudent extends Student{
	String branch;
	String year;

	public void setData(){
		super.setData();
		Scanner sc = new Scanner(System.in);

		System.out.print("ENTER BRANCH - ");
		branch = sc.next();

		System.out.print("ENTER YEAR - ");
		year = sc.next();
	}

	public void getData(){
		super.getData();
		System.out.println("BRANCH - "+branch);
		System.out.println("YEAR   - "+year);
	}
}

class SuperKeyword {
	public static void main(String[] args) {
		EngineeringStudent s = new EngineeringStudent();
		s.setData();
		s.getData();
	}
}