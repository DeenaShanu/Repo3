package samplepackage;

public class ConstructorCls extends ParentConstructorCls{


	public static void main(String[] args) {
		ConstructorCls clsObj = new ConstructorCls();
		System.out.println("Result==" + clsObj.add());

	}
	
	public ConstructorCls() {
		System.out.println("Child cons");
		//this(3,4);
	}
	public ConstructorCls(int a, int b) {
		//super(a,b);
		
	}

}
