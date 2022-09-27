
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 2, 4, 1, 5, 8, 9, 6, 3 };
		display(arr, arr.length - 1);
		mergeSort(arr);
		display(arr, arr.length - 1);
	}

	private static void mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		int[] temp=new int[arr.length];
		mergeSort(arr, 0, arr.length - 1,temp);
	}

	private static void mergeSort(int[] arr, int start, int end, int[] temp) {
		// TODO Auto-generated method stub
		if(start>=end) return;
		
		int mid = (start + end) / 2;

		mergeSort(arr, start, mid,temp);
		mergeSort(arr, mid + 1, end,temp);
		merge(arr, start, mid, end,temp);
	}

	private static void merge(int[] arr, int start, int mid, int end,int[] temp) {
		// TODO Auto-generated method stub
		int i = start;
		int j = mid + 1;
		int k = start;

		while (i <= mid && j <= end) {
			if (arr[i] < arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}

		while (i <= mid)
			temp[k++] = arr[i++];
		
		while (j <= end)
			temp[k++] = arr[j++];

		for (i = start; i <= end; i++)
			arr[i] = temp[i];
	}

	public static void display(int[] arr, int n) {
		for (int i = 0; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

}
