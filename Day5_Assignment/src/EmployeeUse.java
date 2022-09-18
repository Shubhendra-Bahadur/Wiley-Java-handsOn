import java.util.Arrays;
import java.util.Scanner;

public class EmployeeUse {

	public static int getRandomId() {
		int min = 100;
		int max = 999;
		return min + (int) (Math.random() * ((max - min) + 1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee[] = new Employee[5];
		employee[0] = new Employee(getRandomId(), "Shubh", "Finance", 15000);
		employee[1] = new Employee(getRandomId(), "Ram", "Engineering", 50000);
		employee[2] = new Employee(getRandomId(), "Sunny", "Sales", 20000);
		employee[3] = new Employee(getRandomId(), "Sonam", "Sales", 25000);
		employee[4] = new Employee(getRandomId(), "Binod", "Finance", 30000);

		for (Employee emp : employee) {
			System.out.println(emp.toString());
		}

		Arrays.sort(employee); // sorting array

		System.out.println("\n---------Sorted Array-----------\n");

		for (Employee emp : employee) {
			System.out.println(emp.toString());
		}

		System.out.println("\n---------Employee according to required Department-----------\n");

		Scanner s = new Scanner(System.in);
		System.out.println("enter Reqired department name: ");
		String department = s.nextLine();

		Employee.dispDeptWiseEmployee(employee, department); // department wise display
	}
}
