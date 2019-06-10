package phoneInfo;

import java.util.Date;

public class Wireless extends Landline{
	private double range;

	Wireless(double range, String id, String brand, double price, Date dateAvailable) {
		super(id, brand, price, dateAvailable);
		this.range = range;
	}
	public double getRange(){
		return range;
	}
	public String getName() {
		return getClass().getSimpleName();
	}
	

}
