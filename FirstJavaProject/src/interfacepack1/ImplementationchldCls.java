package interfacepack1;

public class ImplementationchldCls implements Interface1 {

	public static void main(String[] args) {
		ImplementationchldCls obj= new ImplementationchldCls();
		Interface1 refObj =  new ImplementationchldCls();//same as abstract class obj reference 
		//creation
		
		refObj.dis();
		refObj.show();
		System.out.println(refObj.num);
		System.out.println(obj.num);
		
		
		obj.show();
		obj.dis();
		obj.test();

	}

	@Override
	public void show() {
		System.out.println("Show---Implmn cls");
		
	}

	@Override
	public void dis() {
		System.out.println("Dis---Implmn cls");

		
	}
	public void test() {
		System.out.println("test method");
	}

}
