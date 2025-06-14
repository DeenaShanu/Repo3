package samplepackage;

public class SampleClss {

	public static void main(String[] args) {
		SampleClss obj = new SampleClss();
		obj.add(3, 5);
		obj.add(1.2f, 1);
		System.out.println("Area of traingle "+ obj.area(10,10));
		

	}

	public void add(int a,int b ) {
		int c = a+b;
		System.out.println("Add 2 integers " + c);
	}
	public void add(float a,int b) {
		float c = a+b;
		System.out.println("Add inetge and float " + c);
		
	}
	public double area(int b,int h) {
		double d = 0.5 * b * h;
		return d;
	}
}
