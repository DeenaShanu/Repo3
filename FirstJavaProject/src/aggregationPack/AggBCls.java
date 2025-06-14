package aggregationPack;

public class AggBCls {

	
	int age;
	String dept;
	AggACls aObj;
	
	
	
	

	public AggBCls(int age, String dept, AggACls aObj) {
		super();
		this.age = age;
		this.dept = dept;
		this.aObj = aObj;
	}
	public static void main(String[] args) {
		
		AggACls a = new AggACls(1001,"Kim");
		AggBCls b = new AggBCls(21,"IT",a);
		b.displayDetls();

	}
	public void displayDetls() {
		System.out.println("ID " + aObj.id);
		System.out.println("Name " + aObj.name);
		System.out.println("Age " + age);
		
	}

}
