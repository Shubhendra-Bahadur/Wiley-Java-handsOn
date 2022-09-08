import java.util.*;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int numArr[] = new int[] { 1, 2, 3, 4, 5 };
//		ArrayOperation ao = new ArrayOperation();
//		Scanner s = new Scanner(System.in);
//		ao.performTask(numArr, numArr.length, s);

		Employee employee1 = new Employee();
		
		System.out.println(employee1.toString());
		
		employee1.empId = 5;
		employee1.empName = "Shubhendra";
		System.out.println(employee1.toString());

		Employee employee2 = new Employee(2, "Ramendra");
		System.out.println(employee2.toString());

	}

}