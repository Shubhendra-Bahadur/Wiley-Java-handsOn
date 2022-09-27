package Presentation;

import java.util.Arrays;

public class FibRecur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(9));
	}

	private static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

}
