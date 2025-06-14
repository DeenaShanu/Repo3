package polymorphpack;

public class OffSeasonCls extends OnSeasonCls {

	
	double discountRateOffSeason = 0.15;
	int totalPriceOffSeason = 0;
	
	
	
	public static void main(String[] args) {
		OffSeasonCls obj = new OffSeasonCls(0.15,3000);
		//OnSeasonCls  obj1 = new OnSeasonCls();
		
		//obj1.discountRateOnSeason = 0.4;
		//obj1.totalPriceOnSeason = 4000;
		
		obj.discount1();
		
		

	}

	
	public OffSeasonCls(double discountRateOffSeason, int totalPriceOffSeason) {
		super(0.3,4000);
		this.discountRateOffSeason = discountRateOffSeason;
		this.totalPriceOffSeason = totalPriceOffSeason;
	}
	public void discount1() {
		
		super.discount();//via super(2,3);
		System.out.println(" \n");
		System.out.println("totalPrice OffSeason = " + totalPriceOffSeason);
		System.out.println("discountRate OffSeason = " + discountRateOffSeason);
		System.out.println("OffSeason discount");
		System.out.println("---------------------------");
		double discnt = 0.0;
		discnt = this.totalPriceOffSeason * this.discountRateOffSeason;
		System.out.println("Discount  = " + discnt);
	}

}
