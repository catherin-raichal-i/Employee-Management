package console;

public class Employee {

	private int empID;
	private String empName;
	
	
	public Employee(int id, String name) {
		this.empID=id;
		this.empName=name;
	}
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String toString() {
		return empID+ " - "+empName;
	}
	
}
