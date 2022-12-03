package abstraction.part2;

import java.util.Scanner;

abstract class Shapes{
	float area;
	abstract public void input();
	abstract public void compute();
	public void display() {
		System.out.println("Result is "+area);
	}
	
}
class Rectangle extends Shapes{
	Scanner sc = new Scanner(System.in);
	private float l;
	private float b;
	public void input() {
		System.out.println("Enter the length of the Rectangle  :");
		l=sc.nextFloat();
		System.out.println("Enter the breadth of the Rectangle  :");
		b=sc.nextFloat();
		
	}
	public void compute() {
		area =l*b;
	}
	
}
class Square extends Shapes{
	private float l;
	Scanner sc = new Scanner(System.in);
	public void input() {
		System.out.println("Enter the lenth 1 of the Square :");
		l=sc.nextFloat();
		
		
	}
	public void compute() {
		area =l*l;
		
	}
	
}
class Circle extends Shapes{
	private float r;
	private float pi;
	Scanner sc = new Scanner(System.in);
	public void input() {
		System.out.println("Enter the radius of the circle :");
		r=sc.nextFloat();
		pi=3.14f;
		
		
	}
	public void compute() {
		area=pi*r;
		
		
	}
	
}
class Area{
	public void permit(Shapes S) {
		S.input();
		S.compute();
		S.display();
	}
}

public class Sample2 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Square sr = new Square();
		Circle cr = new Circle();
		Area a = new Area();
		a.permit(r);
		a.permit(sr);
		a.permit(cr);
	}

}
