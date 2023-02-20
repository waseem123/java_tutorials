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

class Encapsulation {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(101);
		e1.setEmpName("Alexandar");
		e1.setEmpSalary(5000);

		System.out.println("ID     - "+e1.getEmpId());
		System.out.println("NAME   - "+e1.getEmpName());
		// System.out.println("SALARY - "+e1.getEmpSalary());

		e1.setEmpSalary(e1.getEmpSalary()+500);
		System.out.println("SALARY - "+e1.getEmpSalary());
	}
}