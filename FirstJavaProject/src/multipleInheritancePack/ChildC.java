package multipleInheritancePack;

public class ChildC implements IntA, IntB{

	public static void main(String[] args) {
		IntB refObjB = new ChildC();
		IntA refObjA =  new ChildC();
		ChildC obj = new ChildC();
		refObjA.print();
		refObjB.display();
		
		obj.print();
		obj.display();
	}

	@Override
	public void print() {
		System.out.println("print====");
		
	}

	@Override
	public void display() {
		System.out.println("display====");
		
	}

	
}
