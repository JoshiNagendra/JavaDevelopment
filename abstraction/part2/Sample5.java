package abstraction.part2;
abstract class job{
	public void add() {
		System.out.println("Add method");
		show();
	}
	void sub() {
		System.out.println("Sub method");
		show(); //private method we can call this in another methods with in the same class
	}
	private void show() {
		System.out.println("Show method");
	}
	job(){
		System.out.println("Job constructor");
	}
}
class ram extends job{
	
}

public class Sample5 {
	public static void main(String[] args) {
		//job r = new job();
		job j = new ram();
		j.add();
		j.sub();
		
	}

}
