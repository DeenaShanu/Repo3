package inheritancePackage;


//hierarchial inheritance
public class ChildOne extends ParentClass{
	
	

	public static void main(String[] args) {
		ChildOne oneObj = new ChildOne();
		mul(); //ChildOne.mul();
		
		oneObj.show();
		oneObj.addOne();
		oneObj.div();
		
		
	}
	public void addOne() {
		int a = 0, b = 0;
		System.out.println("addOne***** " + (a+b));
		this.div();
	}
	public void div() {
		
	}
	public static void mul() {
		System.out.println("Mul**");
	}
	
}
