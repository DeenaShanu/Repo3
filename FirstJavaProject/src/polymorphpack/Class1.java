package polymorphpack;

public class Class1 {
	
	int priceOn;
	double rateOn;
	

	public Class1(int priceOn, double rateOn) {
		super();
		this.priceOn = priceOn;
		this.rateOn = rateOn;
	}

	public Class1() {
		
	}
	public void dis() {
		System.out.println("Dis ON =" + (priceOn*rateOn ));
		
	}

}
