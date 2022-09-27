package Array;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr=new int[][] {{0,1,3,4},{1,4,5,6},{2,3,8,7},{1,2,3,0}};
		
		printMatrix(arr);
		makeRowColZero(arr);
		System.out.println();
		printMatrix(arr);
	}

	private static void printMatrix(int[][] arr) {
		// TODO Auto-generated method stub
		int r=arr.length;
		int c=arr[0].length;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void makeRowColZero(int[][] arr) {
		// TODO Auto-generated method stub
		int r=arr.length;
		int c=arr[0].length;
		boolean flag=false;
		
		for(int i=0;i<r;i++) {
			if(arr[i][0]==0) flag=true;
			for(int j=1;j<c;j++) {
				if(arr[i][j]==0) {
					arr[i][0]=0;
					arr[0][j]=0;
				}
			}
		}
		
		for(int i=r-1;i>=0;i--) {
			for(int j=c-1;j>=1;j--) {
				if(arr[i][0]==0 || arr[0][j]==0) arr[i][j]=0;
			}
			
			if(flag==true) arr[i][0]=0;
		}
	}

}
