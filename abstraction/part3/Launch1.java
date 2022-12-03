package abstraction.part3;
abstract class calc{
	public abstract int add(); 
	public abstract int add(int a,int b);
}
class Addition extends calc{
	public int add(){
		int a=20;
		int b=30;
		int c=a+b;
		return c;
	}
	public int add(int a,int b) {	
		int c=a+b;
		return c;
		
	}
	
}

public class Launch1 {
	public static void main(String[] args) {
		Addition ad = new Addition();
		System.out.println(ad.add());
		System.out.println(ad.add(5, 2));
	}

}
