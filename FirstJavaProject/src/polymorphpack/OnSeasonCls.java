package polymorphpack;

public class OnSeasonCls {

	double discountRateOnSeason;
	int totalPriceOnSeason;

	public OnSeasonCls(double discountRateOnSeason, int totalPriceOnSeason) {
		
		this.discountRateOnSeason = discountRateOnSeason;
		this.totalPriceOnSeason = totalPriceOnSeason;
		
	}
	public void discount() {
		double discnnt = 0.0;
		System.out.println("totalPrice OnSeason = " + totalPriceOnSeason);
		System.out.println("discountRate OnSeason = " + discountRateOnSeason);
		discnnt = totalPriceOnSeason * discountRateOnSeason;
		System.out.println("OnSeason discount");
		System.out.println("---------------------------");
		System.out.println("Discount = " + discnnt);
		
	}
	
}
