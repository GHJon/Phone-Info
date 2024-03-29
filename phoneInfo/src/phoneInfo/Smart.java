package phoneInfo;

import java.util.Date;

public class Smart extends Phone{
	private double cpuSpeed;

	Smart(double cpuSpeed, String id, String brand, double price, Date dateAvailable) {
		super(id, brand, price, dateAvailable);
		this.cpuSpeed = cpuSpeed;
	}
	public double getCpuSpeed() { return cpuSpeed; }
	public void setCpuSpeed(double cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}
	public String getName() {
		return getClass().getSimpleName();
	}
}
