package EncapsulationDemo;
class Joshi{
	 private int id;  //If u declare as private than u cannot access this directly 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	 
}

public class sample2 {
	
   public static void main(String[] args) {
	Joshi j= new Joshi();
	j.setId(456);
	int r=j.getId();
	
	System.out.println(r);

}

}
