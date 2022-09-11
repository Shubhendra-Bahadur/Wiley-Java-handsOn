package Day3_Assignment;

import java.util.Scanner;

public class FibMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		Fib fib = new Fib(start, end);
		fib.printFibInRange();

	}

}
