package constructors;
//Multilevel Inheritance
class A{
	public A() {
		this(10,20);
		System.out.println("A class");
	}
	public A(int a, int b) {
		this(10,10f);
		int c= a+b;
		System.out.println("A in int method "+c);
	}
	public A(int a,float b) {
		int c= (int) (a+b);	
		System.out.println("A in float methood "+c);
	}	
}
class B extends A{
	public B() {
		System.out.println("B class");
	}
	public B(int a, int b) {
		this();
		int c=a-b;
		System.out.println(c);
	}
	
}
class c extends B{
	public c() {
		System.out.println("C class");
	}
	public c(int a,int b) {
		super(10,20);
		int c=a*b;
		System.out.println(c);
	}

}

public class Launch1 {
	  public static void main(String[] args) {
		//c c1 = new c();
		A c2 = new c(10,20);
	}
}
