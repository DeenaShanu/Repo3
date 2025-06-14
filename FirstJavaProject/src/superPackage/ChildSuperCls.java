package superPackage;

public class ChildSuperCls extends ParentSupCls{

	public static void main(String[] args) {
		int a = 9;
		ChildSuperCls childObj = new ChildSuperCls(3,4);
		childObj.add();
		System.out.println(a);
	}
	public void add() {
		super.div();
		super.mul();
		System.out.println(super.a);
		System.out.println("Addition in child");
	}
	public ChildSuperCls() {
		super(7,8);
		System.out.println("Constructor child class ");
	}
	public ChildSuperCls(int a, int b) {
		//super(7,8);
		this();
		System.out.println("parameter Constructor child class ");
	}
}
