package Recusrion;

import java.util.Arrays;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countStep(4));
	}

	private static int countStep(int n) {
		// TODO Auto-generated method stub
		int[] arr = new int[n + 1];
		Arrays.fill(arr, -1);
		return countStep(n, arr);
	}

	private static int countStep(int n, int[] arr) {
		if (n == 0)
			return 1;
		if (n < 0)
			return 0;
		if (arr[n] != -1)
			return arr[n];
		arr[n] = countStep(n - 1, arr) + countStep(n - 2, arr) + countStep(n - 3, arr);
		return arr[n];
	}

}
