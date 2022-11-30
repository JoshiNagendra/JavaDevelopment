package enum_part_1;

enum Result{
	PASS,FAIL,NR;
	Result(){
		System.out.println("We are calling Constructor");
	}
}

public class Joshi {
	public static void main(String[] args) {
		Result r =Result.PASS;
		System.out.println(r);
		Result r1 = Result.PASS;
		System.out.println(r1);
		Result f =Result.FAIL;
		System.out.println(f);
		Result n =Result.NR;
		System.out.println(n);
		
	}

}
