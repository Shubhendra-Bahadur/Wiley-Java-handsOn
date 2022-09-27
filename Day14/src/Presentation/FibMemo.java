package Presentation;

import java.util.Arrays;

public class FibMemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(9));
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		int[] arr = new int[n + 1];
		Arrays.fill(arr, -1);
		return fib(n, arr);
	}

	private static int fib(int n, int[] arr) {
		if (n <= 1)
			return n;
		if (arr[n] != -1)
			return arr[n];
		arr[n] = fib(n - 1, arr) + fib(n - 2, arr);
		return arr[n];
	}

}
