package Array;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[][] { { 9, 8, 3, 4 }, { 1, 4, 5, 6 }, { 2, 3, 8, 7 }, { 1, 2, 3, 4 } };
		rotateMatrixNinety(arr);

	}

	private static void rotateMatrixNinety(int[][] arr) {
		// TODO Auto-generated method stub
		int r = arr.length;
		int c = arr[0].length;
		printMatrix(arr);

		doTraspose(arr, r, c);
//		printMatrix(arr);

		doRowReverse(arr, r, c);
		printMatrix(arr);
	}

	private static void doRowReverse(int[][] arr, int r, int c) {
		// TODO Auto-generated method stub
		int s = 0, e = c - 1;
		for (int i = 0; i < r; i++) {
			s = 0;
			e = c - 1;
			while (s < e) {
				swap(arr, i, s, e);
				s++;
				e--;
			}
		}
	}

	private static void doTraspose(int[][] arr, int r, int c) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (i < j && i != j) {
					swap(arr, i, j);
				}

			}
		}
	}

	private static void swap(int[][] arr, int i, int s, int e) {
		// TODO Auto-generated method stub
		int temp = arr[i][s];
		arr[i][s] = arr[i][e];
		arr[i][e] = temp;
	}

	private static void swap(int[][] arr, int i, int j) {
		int temp = arr[i][j];
		arr[i][j] = arr[j][i];
		arr[j][i] = temp;
	}

	private static void printMatrix(int[][] arr) {
		// TODO Auto-generated method stub
		int r = arr.length;
		int c = arr[0].length;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
