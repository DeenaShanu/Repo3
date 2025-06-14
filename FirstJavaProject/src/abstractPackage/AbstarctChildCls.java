package abstractPackage;

public class AbstarctChildCls extends AbstractACls {

	public static void main(String[] args) {
		AbstarctChildCls obj = new AbstarctChildCls();
		AbstractACls refObj = new  AbstarctChildCls();// syntax to create reference
		//object of an abstract class
		
		refObj.dis();
		refObj.show();
		refObj.print();
	//	refObj.test();
		obj.show();
		obj.dis();
		obj.print();
	}

	@Override
	public void show() {
		System.out.println("Show");
		
	}

	@Override
	public void dis() {
		System.out.println("disss");
		
		
	}
	public void test() {
		System.out.println("test method");
	}

}
