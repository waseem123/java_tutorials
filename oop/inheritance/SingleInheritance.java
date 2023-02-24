class Person{
	String personName = "George";
	String personCity = "Paris";

	public void displayPerson(){
		System.out.println("Name - "+personName);
		System.out.println("City - "+personCity);
	}
}

class Student extends Person{
	int rollNo = 100;
	String branch = "CS";

	public void displayStudent(){
		System.out.println("Roll No - "+rollNo);
		System.out.println("Branch  - "+branch);
	}
}

class SingleInheritance {
	public static void main(String[] args) {
		Student s = new Student();

		s.displayPerson();
		s.displayStudent();
	}
}