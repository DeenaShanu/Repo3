package pack1;

public class ChildCls extends Parentcls{
	int a;
	public static void main(String[] args) {
		
		ChildCls chlObj = new ChildCls();
		chlObj.display();
		chlObj.print();
		System.out.println("Child main");
		System.out.println(chlObj.a);
	}
	public void print() {
		System.out.println(" child Print ");
	}
	public ChildCls() {
		System.out.println("child Constructor ");
	}
	public   void display() {
		System.out.println("Child display " );
	}
	

}
