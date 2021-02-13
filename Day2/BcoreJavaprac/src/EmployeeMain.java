public class EmployeeMain {
	public static void main(String[] args) {
		         
		Employee emp1 = new Employee();
       	emp1.initializeEmployee(1001,"emp1",100000,23,"dept1",new Address());
		emp1.getEmployeeDetails();

		System.out.println("*********************");
		
		Employee emp2 = new Employee();
        emp2.initializeEmployee(1002,"emp2",150000,24,"dept2",new Address());
		emp2.getEmployeeDetails();
		System.out.println("*********************");
		 
		double d1 =  2000000.00;
		
		double salary = emp1.getSalary();
		if(salary > 100000) {
		  double newSalary = emp2.increamentSalary(.20);
		}
		emp2.getSalary();
	}
}
