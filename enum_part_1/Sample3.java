package enum_part_1;
//While you are creating enum internallly one class is created that class extends enum
enum Color{
	/* when you are creating Constants in internally defaultly constant will be
	 * RED ===   public static final Color RED = new Color();
	 * GREEN ==  public static final Color GREEN = new Color();
	 * BLUE  ==  public static final Color BLUE = new Color();*/
	
	RED,GREEN,BLUE;
	Color(){
		System.out.println("Constructor -- Manlni evadra apedhi!!!");
	}
}
public class Sample3 {
	public static void main(String[] args) {
		Color c =Color.BLUE;
		System.out.println(c);
	}

}
