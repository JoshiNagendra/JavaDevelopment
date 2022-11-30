package constructors;
class Apple{
	public Apple() {
		System.out.println("Apple class");
	}
	public Apple (int a) {
		System.out.println(a+"  : Apple class");
	}
	
}
class Ball extends Apple{
	public Ball() {
		System.out.println("Ball class");
	}
	
}

public class Launch3 {
	public static void main(String[] args) {
//		Ball b = new Ball();
		Apple a = new Apple(10);
	}

	

}
