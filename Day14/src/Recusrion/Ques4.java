package Recusrion;

import java.util.ArrayList;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ans=new ArrayList<>();
		int n=3;
		getValidParen(ans,0,0,"",n);
		
		ans.forEach((string)->System.out.println(string+" "));
	}

	private static void getValidParen(ArrayList<String> ans, int o, int c, String string, int n) {
		// TODO Auto-generated method stub
		
		if(o==n && c==n) {
			ans.add(string);
			return;
		}
		
		if(o<n) {
//			System.out.println("for o<n:"+o+" "+string+"{");
			getValidParen(ans,o+1,c,string+"{",n);
		}
//		System.out.println("s= "+string+" "+c);  
		if(c<o) {
//			System.out.println("for c<n:"+c+" "+string+"}");
			getValidParen(ans,o,c+1,string+"}",n);
		}
		
	}

}
