package samplepackage;

public class OffSeason {
double rate ;
double price ;

public OffSeason(double rate, double price) {
	super();
	this.rate = rate;
	this.price = price;
}
public OffSeason() {
	
}

	public void discount(double rate, double price) {
		double discount = rate*price;
		System.out.println("Off Discount= "+ discount);
	}




}
