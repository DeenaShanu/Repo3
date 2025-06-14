package samplepackage;

public class BTestCls extends ATestCls{

	int c;
	public static void main(String[] args) {

		BTestCls obj= new BTestCls(1,20);
		obj.c = obj.add();
		if (obj.divisible()) {
			System.out.println("Divisble");
		} else {
			System.out.println("Not Divisble");
		}
		

	}
	
	public BTestCls (int a,int b) {
		super(a,b);
	}
	public boolean divisible() {
		System.out.println("c===" + c);
		if (c%10 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
