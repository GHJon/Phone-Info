package phoneInfo;

import java.util.Date;

public abstract class Landline extends Phone{

	Landline(String id, String brand, double price, Date dateAvailable) {
		super(id, brand, price, dateAvailable);
	}
}
