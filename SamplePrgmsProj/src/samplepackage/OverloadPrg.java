package samplepackage;

public class OverloadPrg {

	int m;
	int n;
	public static void main(String[] args) {
		OverloadPrg obj = new OverloadPrg();
		obj.average(20,40,45);
		obj.average(2.3f, 50f, 4.5f);
		System.out.println(obj.sum(10,20));
		obj.m=20;
		obj.n=30;
		System.out.println(obj.sum());
		

	}
	public void average(int a,int b,int c) {
		int avg = (a+b+c)/3;
		System.out.println("AVG of integers " + avg);
	}
	public void average(float a,float b,float c) {
		float avg1 = (a+b+c)/3;
		System.out.println("AVG of float " + avg1);
	}
	public int sum(int x,int y) {
		int z= x+y;
		System.out.println("SUM= "+ z);
		return z;
	}
	public int sum() {
		int o = m+ n;
		return o;
	}
}
