package Cloning;

class Class1 extends Object {
	int a;
	int b;

	public void printString() {
		System.out.println("Class1 [a=" + a + ", b=" + b + "]");
	}

	public Class1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
//	public static void main(String[] args) throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		Class1 c11 = new Class1(10, 20);
//		c11.printString();
//		System.out.println(c11);
//		Class1 c12=(Class1)c11.clone();
//		c11.a=13;
//		c11.printString();
//		c12.printString();
//		System.out.println(c11);
//		System.out.println(c12);
//	}

}

public class Class2 implements Cloneable {
	int c;
	Class1 classObj;

	
	public void printString() {
		System.out.println("Class2 [c=" + c + ", classObj=" + classObj.a + " " + classObj.b + "]" + this +" "+ classObj); 
	}

	public Class2(int c, Class1 classObj) {
		this.c = c;
		this.classObj = classObj;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Class1 c11 = new Class1(10, 20);
//		c11.printString();
//		System.out.println(c11);
//		Class1 c12=(Class1)c11.clone();
//		c11.a=13;
//		c11.printString();
//		c12.printString();
//		System.out.println(c11);
//		System.out.println(c12);
		
		Class2 c21=new Class2(30,c11);
		c21.printString();
		Class2 c22=(Class2)c21.clone();
		c21.printString();
		c22.printString();
		c21.classObj.a=11;
		c21.printString();
		c22.printString();
//		c11.a=13;
//		c11.printString();
//		c12.printString();
//		System.out.println(c11);
//		System.out.println(c12);
	}
}

//class Main {
//
//	public static void main(String[] args) throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		Class1 c11 = new Class1(10, 20);
//		c11.printString();
//		System.out.println(c11);
//		Class1 c12=(Class1)c11.clone();
//	}
//
//}
