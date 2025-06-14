package samplepackage;

public class ReverseConstructorPrgCls {
	int num ;
	int rev = 0;
	public static void main(String[] args) {
		ReverseConstructorPrgCls objCls = new ReverseConstructorPrgCls();
		

	}
	
	public ReverseConstructorPrgCls() {
		
		this(9018);
		System.out.println("reverse = " + rev);
		
		
		
	}
	public ReverseConstructorPrgCls(int num) {
		this.num  = num;
		
		while (num > 0) {
			rev = rev * 10 + num%10;
			num = num/10;
			
		}
	}
}
