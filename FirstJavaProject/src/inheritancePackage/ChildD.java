package inheritancePackage;

public class ChildD extends ParentA{

	public static void main(String[] args) {
		ChildD dObj = new ChildD();
		dObj.turn();
		dObj.show();
	}
	public void turn() {
		System.out.println("childD turn");
	}

}
