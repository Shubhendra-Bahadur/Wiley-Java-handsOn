package Presentation;

import java.util.Arrays;

public class FibDP {

	public static void main(String[] args) {
		
		System.out.println(fib(9));
	}

	private static int fib(int n) {
		int[] arr = new int[n + 1];
//		Arrays.fill(arr, -1);
		return fib(n, arr);
	}

	private static int fib(int n, int[] arr) {
		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		return arr[n];
	}

}
