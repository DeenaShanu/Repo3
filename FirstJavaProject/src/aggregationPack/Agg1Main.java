package aggregationPack;

public class Agg1Main {

	String name;
	int age;
	Agg1 agg;
	
	public Agg1Main(String name, int age, Agg1 agg) {
		super();
		this.name = name;
		this.age = age;
		this.agg = agg;
	}

	public static void main(String[] args) {

		Agg1 obj=new Agg1("MS Villa","KAvadiar","TVM",345678,"Kerala");
		Agg1Main objMain = new Agg1Main("Geeta",23,obj);
		
		System.out.println("NAME="+ objMain.name);
		System.out.println("AGE="+ objMain.age);
		System.out.println("ADDRESS="+ objMain.agg.address);
		

	}

}
