
public class EmployeeUtil {

	public static void dispDeptWiseEmployee(Employee[] employee, String department) {
		for (Employee emp : employee) {
			if (emp.getEmpDept().equals(department))
				System.out.println(emp.toString());
		}
	}

	public static boolean equals(Object emp1, Object emp2) {
		// TODO Auto-generated method stub
		if (((Employee) emp1).getEmpId() == ((Employee) emp2).getEmpId()
				&& ((Employee) emp1).getEmpName() == ((Employee) emp2).getEmpName())
			return true;
		return false;
	}

}
