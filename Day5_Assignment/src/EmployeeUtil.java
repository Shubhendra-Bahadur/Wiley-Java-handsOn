
public class EmployeeUtil {

	public static void dispDeptWiseEmployee(Employee[] employee, String department) {
		for (Employee emp : employee) {
			if (emp.getEmpDept().equals(department))
				System.out.println(emp.toString());
		}
	}
}
