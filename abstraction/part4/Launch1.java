package abstraction.part4;
abstract class Joshi{
	public void display() {
		System.out.println("display method");
	}
	public void show() {
		System.out.println("show method");
	}
}
class Vamsi extends Joshi{
	public void show() {
		System.out.println("Vamsi show");
	}
	
}
public class Launch1 {
	public static void main(String[] args) {
		Vamsi v = new Vamsi();
		v.display();
		v.show();
		Joshi j = new Vamsi();
		System.out.println("*********************** ");
		j.display();
		j.show();
		
	}
	
}
