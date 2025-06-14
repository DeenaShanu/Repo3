package samplepackage;

public class FactorialCls {
	int fact ;
	public static void main(String[] args) {
		FactorialCls obj = new FactorialCls();
		obj.factorial(6);
	}
	public void factorial(int num) {
		this.fact = 1;
		System.out.println("Factorial method " );
		for(int i =1; i<=num ; i++) {
			fact = fact * i;
		}
		this.print();
		
	}
	public void print() {
		System.out.println(" in Print method " + fact);
	}
}
