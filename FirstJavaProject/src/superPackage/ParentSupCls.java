package superPackage;

public class ParentSupCls {
	int a = 10;
	
	
	public void div() {
		System.out.println("Parent div method");
	}
	public static void mul() {
		System.out.println("Parent static mul method");
	}
	public ParentSupCls() {
		System.out.println("PArent Constructor");
	}
	public ParentSupCls(int a, int b) {
		this();
		System.out.println("Parametrized CONSTRUCTOR");
		//System.out.println("PArent Constructor");
	}
}
