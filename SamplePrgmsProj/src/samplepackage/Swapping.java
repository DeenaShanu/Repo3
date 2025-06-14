package samplepackage;

public class Swapping {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 0;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		Swapping obj = new Swapping();
		obj.swap(10, 90);
		

	}
	public void swap(int a, int b) {
		System.out.println("***********");
		System.out.println("a = "  + a);
		System.out.println("b = "  + b);
		a=a+b ; 
		b=a-b;
		a=a-b;
		
		System.out.println("a = "  + a);
		System.out.println("b = "  + b);
		
		
	}

}
