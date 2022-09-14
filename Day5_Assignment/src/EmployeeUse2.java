public class EmployeeUse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101, "Shubh", "Finance", 15000);
		Employee e2 = new Employee(101, "Ram", "Engineering", 18000);
		Employee e3 = new Employee(102, "Shubh", "Sales", 19000);
		Employee e4 = new Employee(101, "Shubh", "Sales", 19000);

//		.equals() method matching empId and name, if same then both employee same, if different both employees are different
		System.out.println(e1.equals(e3)); // both employee have different id but same name-> false
		System.out.println(e1.equals(e2)); // both employee have same id but different name -.false
		System.out.println(e1.equals(e4)); // both employee have same id and same name -> true
	}

}
