package enum_part_2;
enum Result{
	PASS,FAIL,NR;
	int marks;
	Result(){
		System.out.println("Manalni evadra apedhi !!  -- Constructor");
	}
	void setMarks(int marks) {
		this.marks=marks;
	}
	int getMarks() {
		return marks;
	}
}

public class Sample1 {
	public static void main(String[] args) {
		Result r =Result.PASS;
		Result f=Result.FAIL;
		Result n =Result.NR;
		System.out.println(r);
		Result.PASS.setMarks(45);
		int marks =Result.PASS.getMarks();
		System.out.println(marks);
		Result.FAIL.setMarks(10);
		int marks1 = Result.FAIL.getMarks();
		System.out.println(marks1);
		
		System.out.println("**** Swith Case******");
		switch(n) {
		case PASS: System.out.println("Passed");
		break;
		case FAIL: System.out.println("Failed");
		break;
		case NR: System.out.println("No Rank");
		break;
		}
		
		
	    
	}

}
