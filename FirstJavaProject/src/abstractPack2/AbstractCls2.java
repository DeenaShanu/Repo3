package abstractPack2;

public class AbstractCls2 extends AbstractCls1{

	@Override
	public void add() {
		System.out.println("addition");
		 
	}

	@Override
	public void sub() {
		System.out.println("subtraction");
		
	}

	public static void main(String[] args) {
		AbstractCls2 obj2 = new AbstractCls2();
		obj2.add();
		obj2.sub();
		AbstractCls1 obj1 = new AbstractCls2();//since constructor and obj creation not allowed for
		//class AbstractCls1, but we can create a referenceObj 'obj1'
		obj1.add();
		

	}

}
