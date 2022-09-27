package Presentation;

public class Demo {
	private static int a;
	public static void m(int a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		m(a);
	}
}

class Demo2 extends Demo3{
	
//	void print() {
//		System.out.println("hello2");
//	}
}

abstract class Demo3{
	void print() {
		System.out.println("hello1");
	}
}

interface a{
	public abstract void b();
}

interface c extends a{
	
}
