package multilevelInheritance;

public class ChildB extends ParentCls{

	String a ="Hello";
	public static void main(String[] args) {
		ChildB objB = new ChildB();
		objB.print();
		objB.display();
		

	}
	public void display() {
		System.out.println("Child B----display()");
		System.out.println("Child B--String a--" + a);
	}
	

}
