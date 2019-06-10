package phoneInfo;
import java.lang.Comparable;
import java.util.Date;

public abstract class Phone implements Comparable<Phone>{
	private String id;
	private String brand;
	private double price;
	private Date dateAvailable;
	
	Phone(String id, String brand, double price, Date dateAvailable){
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.dateAvailable = dateAvailable;
	}
	
	//Compare id member of two phone objects/
	//Check if equal or not 
	public int compareTo(Phone compare) {
		if(compare.getId() == id) {
			return 0;
		}
		return -1;
	}
	
	public abstract String getName();
	public double getPrice() { return price; }
	public String getId() { return id; }
	public String getBrand() { return brand; }
	public Date getDateAvailable() { return dateAvailable; }
	
}
