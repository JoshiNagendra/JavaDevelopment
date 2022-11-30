package EncapsulationDemo;
class Launch{
	private int a;
	private int b=20;
	int c=10;
	public void show() {
		a=100;
		c=20;
		System.out.println(a);
	}
	
}

public class Sample3 {
	int a;
	void show() {
		a=10;
	}
	public static void main(String[] args) {
		Launch l= new Launch();
		System.out.println(l.c);
		//System.out.println();
		l.show();
	}

}
