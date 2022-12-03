package abstraction.part2;
abstract class Plane{
	public abstract void fly();
}
class FighterPlane{
	public void fly() {
		System.out.println("Fighter Plane is Flying");
	}
	
}
class CargoPlane{
	public void fly() {
		System.out.println("Cargo Plane is Flying");
	}
	
}

public class Sample4 {
	public static void main(String[] args) {
		FighterPlane fp= new FighterPlane();
		fp.fly();
		CargoPlane cp = new CargoPlane();
		cp.fly(); 
		
	}

}
