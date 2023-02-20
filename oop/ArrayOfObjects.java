class Employee{
	private int empId;
	private String empName;
	private int empSalary;

	public void setEmpId(int eId){
		empId = eId;
	}
	public int getEmpId(){
		return empId;
	}

	public void setEmpName(String eName){
		empName = eName;
	}
	public String getEmpName(){
		return empName;
	}

	public void setEmpSalary(int eSalary){
		empSalary = eSalary;
	}
	public int getEmpSalary(){
		return empSalary;
	}
}

class ArrayOfObjects {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(101);
		e1.setEmpName("Alexandar");
		e1.setEmpSalary(5000);

		Employee e2 = new Employee();
		e2.setEmpId(102);
		e2.setEmpName("Shweta");
		e2.setEmpSalary(7000);

		Employee e3= new Employee();
		e3.setEmpId(103);
		e3.setEmpName("James");
		e3.setEmpSalary(2000);


		Employee[] employees = {e1,e2,e3};
		
		for (Employee emp : employees) {
			System.out.println("ID     - "+emp.getEmpId());
			System.out.println("NAME   - "+emp.getEmpName());
			System.out.println("SALARY - "+emp.getEmpSalary());
			System.out.println("___________________________");
		}
		
	}
}