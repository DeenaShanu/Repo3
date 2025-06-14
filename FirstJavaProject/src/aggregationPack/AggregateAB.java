package aggregationPack;

public class AggregateAB {

	int bankId;
	String bankName;
	AggregateAA objAA;
	
	
	public AggregateAB(int bankId, String bankName, AggregateAA objAA) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.objAA = objAA;
	}


	public static void main(String[] args) {
		
		AggregateAA aaObj = new AggregateAA(1,"Suman","Kollam");
		AggregateAB abObj = new AggregateAB(11,"SBT",aaObj);
		abObj.show();
		
	}
	public void show() {
		System.out.println("bank id = " + bankId);
		System.out.println("bank name = " + bankName);
		System.out.println("Acccount number = " + objAA.accno);
		System.out.println("Account name = " + objAA.accname);
		System.out.println("Place = " + objAA.place);
	}

}
