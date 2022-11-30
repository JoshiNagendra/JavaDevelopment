package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.Annotation;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer1{
      String gameName() default "Cricket";
      int runs()  default 200;
	
}
@CricketPlayer1
class Kohli1{
	@CricketPlayer1
	int Joshi;
	@CricketPlayer1
	void method() {
		System.out.println("Show method ");
	}
	
}
public class Sample3 {
	public static void main(String[] args) {
		Kohli k = new Kohli();
		k.method();
		Class c =k.getClass();
		System.out.println(c);
		java.lang.annotation.Annotation a =c.getAnnotation(CricketPlayer.class);
		CricketPlayer cp = (CricketPlayer)a;
		System.out.println(cp.gameName());
		System.out.println(cp.runs());
	}
	

}
