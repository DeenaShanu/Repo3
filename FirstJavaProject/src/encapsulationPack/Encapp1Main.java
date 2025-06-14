package encapsulationPack;

public class Encapp1Main {

	int age;
	String name;
	public static void main(String[] args) {
		Encapp1Main mainObj = new Encapp1Main();
		mainObj.age = 12;
		mainObj.name= "Din";
		
		Encapp1 obj = new Encapp1();
		obj.setId(101);
		System.out.println(mainObj.age + " " + mainObj.name + " " + obj.getId());
	}
	

}
