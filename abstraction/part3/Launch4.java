package abstraction.part3;
abstract class demo{
	  demo(){
		  System.out.println("Constructor in Abstract");
	  }
	  public static void show() {
		  System.out.println("Show Method");
	  }
}
class vamsi extends demo{
	vamsi (){
		System.out.println("Constructor in vamsi");
	}
	
}
public class Launch4 {
	public static void main(String[] args) {
		vamsi v = new vamsi();
		v.show();
	}
}
