package abstraction.part2;
abstract class Joshi {
	int a=10;
	int b=20;
	
	public abstract void add();
	public void sub() {
		int c = a-b;
		System.out.println("Subtraction is "+c);
	}
	final public void Multi() {
		int c=a*b;
		System.out.println("Multiplication is "+c);
		
	}
	
}
class A extends Joshi{
	public void add() {
		int c=a+b;
		System.out.println("Addition is "+c);
	}
	public void sub() {
		int c=b-a;
		System.out.println("Child subtraction is "+c);
	}
	/*
	 * final public void Multi() { //cannot override because in parent class this method is declared as final
	 * 
	 * System.out.println("Child multiplication");
	 * 
	 * }
	 */
	
}

public class Sample1 {
	public static void main(String[] args) {
		System.out.println("By Parent reference we are calling methods");
		Joshi J = new A();  //loose coupling //also called as up casting
		J.add();
		J.sub();
		System.out.println("By child reference we are calling methods");
		A R = new A();
		R.add();
		R.sub();
		R.Multi();
		
		//Joshi R = new Joshi(); //U cannot create object for abstract class because abstract is incomplete
	}


}
