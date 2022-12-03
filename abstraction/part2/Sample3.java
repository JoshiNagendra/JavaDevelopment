package abstraction.part2;
abstract class Joshia{
	public Joshia() {
	}
}
class child1 extends Joshia{
	public void show() {
		System.out.println("Abstract Method  ");
	}
}

public class Sample3 { 
	public static void main(String[] args) {
		child1 c = new child1();
		c.show();
	}


}
