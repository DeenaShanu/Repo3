package polymorphpack;

public class Class2 extends Class1{


	int priceOff;
	double rateOff;
	
	
	
	
	public Class2(int priceOff, double rateOff) {
		
		this.priceOff = priceOff;
		this.rateOff = rateOff;
	}
	public Class2() {
		
	}



	public static void main(String[] args) {
		Class2 obj1 = new Class2(10,10);
		obj1.priceOn =20;
		obj1.rateOn =20;
		
		System.out.println("PriceOn = "+ obj1.priceOn );
		//System.out.println("PriceOff = "+ obj2.priceOff );
		System.out.println("RateOn = "+ obj1.rateOn);
	//	System.out.println("RateOff = "+ obj2.rateOff );
		obj1.dis();

	}
	public void dis() {
		super.dis();
		System.out.println("Dis Off = " + (priceOff*rateOff));
		
	}
	


}
