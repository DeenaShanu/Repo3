package abstractPack2;

public class AbsClas12 extends AbstCls11{

	public static void main(String[] args) {
		AbsClas12 obj = new AbsClas12();
		obj.display();
		System.out.println(obj.add());
		System.out.println(obj.num());
		
	}

	public void display() {
		super.display();
		System.out.println("Display2");
	}
	@Override
	public int num() {
		int a =10;
		int b= 20;
		
		return a+b;
	}

	@Override
	public int add() {
		int b = 2;
		int v = 3;
		return b+v;
	}
	

}
