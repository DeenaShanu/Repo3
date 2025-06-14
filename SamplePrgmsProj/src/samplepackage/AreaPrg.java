package samplepackage;

public class AreaPrg {

	public static void main(String[] args) {
		AreaPrg areaObj = new AreaPrg();
		areaObj.area(4.3f);
		areaObj.area(3, 2);
		areaObj.area(3);

	}
	public void area(float y) {
		System.out.println("Circle = " + (3.14 * y * y));
	}
	public void area(int x, int y) {
		System.out.println("Rectangle = " + (x * y));
	}
	public void area(int z) {
		System.out.println("Square = " + (z*z));
	}

}
