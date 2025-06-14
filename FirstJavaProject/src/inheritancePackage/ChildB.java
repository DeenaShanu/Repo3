package inheritancePackage;

public class ChildB extends ParentA{

	public static void main(String[] args) {
		ChildB objRef =  new ChildB();
		
		objRef.show();
		objRef.add();
	}
	public void add() {
		
		int a = 8;
		int b = 7;
		int c = a+ b;
		System.out.println("Ad child B " + c);
	}

}
