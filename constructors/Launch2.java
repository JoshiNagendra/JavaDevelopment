package constructors;

import java.util.Scanner;

class X{
	public X(){
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the value at the index "+ i +" : ");
			arr[i]=sc.nextInt();
			
			
		}
		System.out.println("*********************");
		for(int i=0;i<arr.length;i++) {
			System.out.println("The value at the index "+i+" : "+arr[i]);
		}
		
		
	}
	public X(int a){
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the value at the index "+ i +" : ");
			arr[i]=sc.nextInt();
			
			
		}
		System.out.println("*********************");
		for(int i=0;i<arr.length;i++) {
			System.out.println("The value at the index "+i+" : "+arr[i]);
		}
		
		
	}
}
class Y extends X{
	public Y() {
		System.out.println("Y method");
	}
}

public class Launch2 {
	public static void main(String[] args) {
		//Y y= new Y();
		X x = new X(10);
	}

}
