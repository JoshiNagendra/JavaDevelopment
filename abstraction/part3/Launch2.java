package abstraction.part3;

import java.util.Scanner;

abstract class Shapes{
	float area;
	public abstract void input();
	public abstract void compute();
	public void display() {
		System.out.println("The area is :"+area);
		
	}
}
class Rectangle extends Shapes{
	float l;
	float b;
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle :");
		l=sc.nextFloat();
		System.out.println("Enter the breadth of the rectangle :");
		b=sc.nextFloat();
		
	}
	public void compute() {
		area =l*b;
	}
}
class Square extends Shapes{
	float l;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the square :");
		l=sc.nextFloat();
	}
	public void compute() {
		area =l*l;
	}
}
class Circle extends Shapes{
	float r;
	final float pi=3.2f;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle :");
		r=sc.nextFloat();
		
	}
	public void compute() {
		area=pi*r*r;
	}
	
}
class Geometry{
	public void permit(Shapes s) {
		s.input();
		s.compute();
		s.display();
	}
}
public class Launch2 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Square s= new Square();
		Circle c= new Circle();
		Geometry g = new Geometry();
		g.permit(r);
		g.permit(s);
		g.permit(c);
		
	}

}
