package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer{
      String gameName();
      int runs();
	
}
@CricketPlayer(gameName="Cricket",runs = 200)
class Kohli{
	@CricketPlayer(gameName = "Cricket", runs = 0)
	int Joshi;
	@CricketPlayer(gameName = "Cricket", runs = 0)
	void method() {
		System.out.println("Show method ");
	}
	
}
public class Sample2 {
	

}
