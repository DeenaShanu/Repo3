package inheritancePackage;

public class ChildTwo extends ParentClass {

	public static void main(String[] args) {
		ChildTwo obj = new ChildTwo();
		obj.show();
		

	}
	public void sub(int a, int b) {
		a =9;
		b =8;
		System.out.println("sub****" + a+b);
	}

}
