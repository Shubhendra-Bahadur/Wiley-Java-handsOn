package Array;

import java.util.HashSet;
import java.util.Set;

public class Ques4 {
	public static void main(String[] args) {
		int[] arr=new int[] {2,3,4,5,1,8};
		
		System.out.println(haveDuplicates(arr));
		
//		int[] arr1=new int[] {1,2,3,3,5,4};
//		System.out.println(haveDuplicates2(arr1));
	}

	private static boolean haveDuplicates(int[] arr) {
		Set<Integer> set=new HashSet<>();
		
		for(Integer i:arr) {
			if(set.contains(i)) return true;
			set.add(i);
		}
		
		return false;
	}
	
	private static int haveDuplicates2(int[] arr) {
		int i=arr[0],temp;
		arr[0]=-1;
		
		while(arr[i]!=-1) {
			temp=i;
			i=arr[i];
			if(arr[i]==-1) return i;
			arr[temp]=-1;
		}
		
		return 0;
	}
}
