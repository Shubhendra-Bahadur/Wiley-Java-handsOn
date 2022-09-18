package fileio;

import java.io.Serializable;

public class Employee implements Serializable {
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	public int empId;
	public String empName;
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
}
