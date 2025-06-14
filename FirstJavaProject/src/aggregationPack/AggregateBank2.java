package aggregationPack;

public class AggregateBank2{

	String bankName;
	String branchName;
	AggregateBank1 obj;// make the aggregate class an entity (object) to this class .
	//Also ,this entity's data type is the aggregateclassname
	//pass this entity as an argument in the main class's constructor so that we can initialize values into aggregate class too
	public AggregateBank2(String bankName, String branchName, AggregateBank1 obj) {
	
		this.bankName = bankName;
		this.branchName = branchName;
		this.obj = obj;
	}

	public static void main(String[] args) {
		AggregateBank1 obj1 =new AggregateBank1("ACC001");
		AggregateBank2 obj2 = new AggregateBank2("SBI","Kazhakkuttom",obj1);
		obj2.show();
	}

	public void show() {
		System.out.println("bankName= " + bankName);
		System.out.println("branchName= " + branchName);
		System.out.println("accNum= " + obj.accId);
		
		
		
	}
	
	
	

}
