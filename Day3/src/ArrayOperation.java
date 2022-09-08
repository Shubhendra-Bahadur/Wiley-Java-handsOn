import java.util.Scanner;

class ArrayOperation {

	private void printOddNum(int[] numArr, int length) {
		while (length-- > 0) {
			if (numArr[length] % 2 != 0) {
				System.out.println(numArr[length]);
			}
		}

	}

	public void performTask(int[] numArr, int length, Scanner s) {
		System.out.println("Enter no. of operations, 1 for print all element 2 for all odd numbers");
		int i = s.nextInt();

		switch (i) {
		case 1:
			loopOverArrFor(numArr, length);
			break;

		case 2:
			printOddNum(numArr, length);
			break;

		}

	}

	private void loopOverArrFor(int[] numArr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(numArr[i]);
		}
	}
}