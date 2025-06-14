package interfacepack1;

public class InterffcMain implements InnterfaceClsss,Interfffce2 {

	public static void main(String[] args) {
		Interfffce2 obj = new InterffcMain();
		InterffcMain obj2 = new InterffcMain();
		obj.insert();
		System.out.println(obj.num);
		System.out.println(obj.a);
		obj2.show();
		obj.dis();
		obj2.dis();
		

	}

	@Override
	public void insert() {
		System.out.println("Inrrface");
		
	}

	@Override
	public void delete() {
		System.out.println("Delete");
		
	}

	@Override
	public void show() {
		System.out.println("show");
		
	}

	@Override
	public void dis() {
		System.out.println("dis");
		
		
	}
	
	
	
}
