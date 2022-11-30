package EncapsulationDemo;
class Alien{
	private String name;
	private int age;
	private int id;
	public Alien(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public Alien(String name,int age,int id) {
		this.name=name;
		this.age=age;
		this.id=id;
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	
}

public class SampleConstructor {
	public static void main(String[] args) {
		Alien a= new Alien("Joshi",8);
		Alien b = new Alien("Joshi2", 100, 1212);
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(b.getAge());
		System.out.println(b.getName());
	}

}
