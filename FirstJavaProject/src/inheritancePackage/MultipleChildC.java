package inheritancePackage;

public class MultipleChildC extends MultipleParentB {
	int d;
	
	public static void main(String[] args) {
		MultipleChildC obj = new MultipleChildC();
		obj.show();
		System.out.println(obj.d);

	}
	public void print() {
		System.out.println(d);
	}

}
