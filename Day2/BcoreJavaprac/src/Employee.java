// Data type
public class Employee {
	
	int employeeId;
	String employeeName;
	double salary;
	int age;
	String department;
	Address address;

	// methods
	// [A.M] [N.A.M] returntype methodname([arg])[throws clause]
	public void markAttendance() { // [body]
		System.out.println("Attendance Marked");
	}

	public void initializeEmployee(int id , String name, double sal,int ag,
			                       String depart,Address addr) {
		employeeId = id;
		employeeName = name;
		salary = sal;
		age = ag;
		department = depart;
		address = addr;
	}

	public void getEmployeeDetails() {
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(salary);
		System.out.println(age);
		System.out.println(department);
		System.out.println(address);
	}
	
	public double increamentSalary(double percent) {
	     salary = salary + salary*percent;
	     return salary;
	}
 
	 public double getSalary() {
		 return 10.00;
	 }
}
