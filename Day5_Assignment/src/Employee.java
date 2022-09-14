
public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName, empDept;
	private double empBasicSalary, empGrossSalary;

	public Employee(int empId, String empName, String empDept, double empBasicSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
		empGrossSalary = empBasicSalary + (0.12 * empBasicSalary) + (0.08 * empBasicSalary);
	}

	public double getEmpGrossSalary() {
		return empGrossSalary;
	}

	public String getEmpDept() {
		return empDept;
	}

	public static void dispDeptWiseEmployee(Employee[] employee, String department) {
		EmployeeUtil.dispDeptWiseEmployee(employee, department);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empBasicSalary="
				+ empBasicSalary + ", empGrossSalary=" + empGrossSalary + "]";
	}

	@Override
	public boolean equals(Object emp) {
		// TODO Auto-generated method stub
		if (this.empId == ((Employee) emp).empId && this.empName == ((Employee) emp).empName)
			return true;
		return false;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (int) (this.empGrossSalary - o.empGrossSalary);
	}

}
