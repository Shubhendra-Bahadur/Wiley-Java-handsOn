package Recusrion;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int getIndex=getSurvivorIndex(7,3);
		System.out.println(getIndex);
	}

	private static int getSurvivorIndex(int n, int k) {
		// TODO Auto-generated method stub
		if(n==1) return 0;
		int nextCycleIndex=getSurvivorIndex(n-1, k);
		int mappedPrevIndex=(k+nextCycleIndex)%n;
		
		return mappedPrevIndex;
	}

}
