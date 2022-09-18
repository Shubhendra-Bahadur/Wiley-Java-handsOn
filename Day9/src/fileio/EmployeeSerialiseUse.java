package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerialiseUse {
	public static void main(String[] args) {
		Employee[] emps=new Employee[5];
		emps[0]=new Employee(101, "Sunny");
		emps[1]=new Employee(102, "Ravi");
		emps[2]=new Employee(103, "Ram");
		
		try {
			FileOutputStream fos=new FileOutputStream("Employee.dat");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(emps);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis=new FileInputStream("Employee.dat");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee[] empArr=(Employee[])ois.readObject();
			System.out.println(empArr[0]);
			System.out.println(empArr[1]);
			System.out.println(empArr[2]);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
