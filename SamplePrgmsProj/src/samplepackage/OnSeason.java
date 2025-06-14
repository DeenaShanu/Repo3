package samplepackage;

public class OnSeason extends OffSeason{

	public OnSeason(double rate, double price) {
		super();
		this.rate= rate;
		this.price=price;
		
	}
	double rate;
	double price;
	public static void main(String[] args) {
		OnSeason obj = new OnSeason(0.4,400);
		obj.discount(obj.rate, obj.price);
		
		
	

	}
	public void discount(double rate, double price) {
		super.discount(0.15, 400);
		double discount = rate*price;
		System.out.println("On Discount= "+ discount);
	}

}
