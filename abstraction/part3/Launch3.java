package abstraction.part3;
abstract class Joshi{
	public abstract void show();
	public abstract void display();
}
class child extends Joshi{
	public void show() {
		System.out.println("Show method");
		
	}
	public void display() {
		System.out.println("Display method");
		
	}
}
public class Launch3 {
	public static void main(String[] args) {
		Joshi j = new child();
		j.show();
		j.display();
		
	}

}
