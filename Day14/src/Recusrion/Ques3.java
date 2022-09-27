package Recusrion;

public class Ques3 {
	public static void main(String[] args) {
		
		int[] arr=new int[] {2,3,4,4,5,5,6,7};
		int k=findKIndex(arr);
		if(k==0) {
			System.out.print("No such position");
		}else {
			System.out.print("element at "+k+"th position of array is "+ arr[k]);
		}
		
	}

	private static int findKIndex(int[] arr) {
		// TODO Auto-generated method stub
		return findKIndex(arr,0);
	}

	private static int findKIndex(int[] arr, int i) {
		// TODO Auto-generated method stub
		if(i==arr.length) return 0;
		if(arr[i]==i) return i;
		
		int k=findKIndex(arr,i+1);
		return k;
	}
}
