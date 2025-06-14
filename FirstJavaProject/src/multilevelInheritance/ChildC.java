package multilevelInheritance;

public class ChildC extends ChildB{

	public static void main(String[] args) {
		ChildC objC= new ChildC();
		objC.display();
		objC.print();
		objC.swap();
	}
	public void swap() {
		System.out.println("Child C---Swapping");
		
	}

}
