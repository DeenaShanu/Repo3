package abstractPack2;

public class AbsClssMain extends  AbsClss{

	public static void main(String[] args) {
		
		AbsClssMain obj = new AbsClssMain();
		AbsClss refObj = new AbsClssMain();
		obj.addData();
		obj.show();
		refObj.rename("Kripa");
		obj.show();
		
		 	

	}
	
	
	@Override
	public void addData() {
		this.age = 30;
		this.rollNo = 1;
		this.name = "Deepa";
		this.place = "Kollam";
		
	}
	@Override
	public void rename(String name) {
		
		super.rename(name);
	}


	public void show() {
		System.out.println(this.age);
		System.out.println(this.name);
		
	}
	

}
