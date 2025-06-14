package inheritancePackage;

public class ChildE extends ChildD{

	public static void main(String[] args) {
		ChildE eObj =  new ChildE();
		eObj.show();
		eObj.swap();
		eObj.turn();
		eObj.display();
	}
	public void swap() {
		System.out.println("child E ---Swap");
	}
}
