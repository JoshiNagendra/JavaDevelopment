package enum_part_1;

public class Sample2 {
	public static void main(String[] args) {
		Gender g = Gender.MALE;
		Gender f = Gender.FEMALE;
		System.out.println(f);
		System.out.println(g);
		Gender o = Gender.OTHERS;
		System.out.println(o);
		System.out.println(Gender.MALE.compareTo(o));;
	    System.out.println(	Gender.MALE.equals(g));
	    System.out.println(    Gender.MALE.getClass().getName());
	    System.out.println( Gender.MALE.toString());
	    System.out.println( Gender.MALE.ordinal());
	    System.out.println( Gender.FEMALE.ordinal());
	    System.out.println( Gender.OTHERS.ordinal());
	}

}
