package enum_part_2;
enum Color{
	RED,BLUE,GREEN,YELLOW,PINK;
}

public class Sample2 {
	public static void main(String[] args) {
	    //TO print all constants in enum
		for(Color s: Color.values()) {
			System.out.println(s);
		}
		System.out.println("-------------------");
		System.out.println(Color.valueOf("RED"));
	}

}
