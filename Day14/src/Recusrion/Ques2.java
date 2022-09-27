package Recusrion;

import java.util.ArrayList;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr=new int[5][5];
		
		ArrayList<int[][]> ans=new ArrayList<>();
		
		getPoss(ans,arr,0);
//		display(ans);

	}

	private static void display(int[][] arr) {
		// TODO Auto-generated method stub
		System.out.println();
//		ans.forEach((arr)->{
//			for(int i=0;i<arr.length;i++) {
//				for(int j=0;j<arr[0].length;j++) {
//					System.out.print(arr[i][j]+" ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//			System.out.println();
//		});
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void getPoss(ArrayList<int[][]> ans, int[][] arr,int row) {
		// TODO Auto-generated method stub
		if(row==arr.length) {
//			int[][] temp=arr;
//			ans.add(temp);
			display(arr);
			return;
		}
		
		for(int i=0;i<5;i++) {
			if(isValid(arr, row,i)) {
				arr[row][i]=1;
				getPoss(ans, arr, row+1);
				arr[row][i]=0;
			}
		}
	}
	
	private static boolean isValid(int[][] arr,int row, int col) {
		
		boolean valid=false;
		int i,j;
		
		for(i=row,j=col;i>=0&&j>=0;i--,j--) {
			if(arr[i][j]==1) return false;
		}
		
		for(i=row,j=col;i>=0&&j<arr[0].length;i--,j++) {
			if(arr[i][j]==1) return false;
		}
		
		for(j=row-1;j>=0;j--) {
			if(arr[j][col]==1) return false;
		}
		
		return true;
		
		
		
	}

}
