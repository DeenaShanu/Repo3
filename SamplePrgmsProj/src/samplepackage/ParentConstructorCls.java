package samplepackage;

public class ParentConstructorCls {
	int a;
	int b;
	
	public ParentConstructorCls() {
		System.out.println("Parent cons");
	}
	
	public ParentConstructorCls(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	public int add() {
		return a+b;
		
	}
	
	
	

}
