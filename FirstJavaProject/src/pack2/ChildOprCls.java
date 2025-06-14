package pack2;

public class ChildOprCls extends ParentOPrCls {

	public ChildOprCls() {
		System.out.println("Constructor - child");
	}

	public static void main(String[] args) {
		ChildOprCls chlObj = new ChildOprCls();
		chlObj.add();
		chlObj.sub();
		ChildOprCls.mul();
		chlObj.div();
	}

	public void add() {
		System.out.println("Addition child " + (5+ 6));
	}
	public static void mul() {
		System.out.println("Mul  child " + (8*9));
	}
	public  void div() {
		System.out.println("Div  child " + (9/9));
	}
}
