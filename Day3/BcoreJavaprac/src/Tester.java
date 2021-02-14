//Sub class
public class Tester extends Employee {

	int noOftestCases;
	int noOfbugs;

	public Tester(int id, String name, double sal, int ag, String depart, Address addr) {
		employeeId = id;
		employeeName = name;
		salary = sal;
		age = ag;
		department = depart;
		address = addr;
		noOfbugs= 10;
		noOftestCases=100;
	}

	public void testCode() {
		System.out.println("test the code");
	}

	public void getDetails() {
		getEmployeeDetails();
	}

}
