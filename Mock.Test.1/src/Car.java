
public class Car {
	private String licenseNo;
	private float horsePower;
	private String colour;
	private String model;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String licenseNo, float horsePower, String colour, String model) {
		super();
		this.licenseNo = licenseNo;
		this.horsePower = horsePower;
		this.colour = colour;
		this.model = model;
	}
	
	public Car(Car other) {
		super();
		this.licenseNo = other.licenseNo;
		this.horsePower = other.horsePower;
		this.colour = other.colour;
		this.model = other.model;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public float getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(float horsePower) {
		this.horsePower = horsePower;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [licenseNo=" + licenseNo + ", horsePower=" + horsePower + ", colour=" + colour + ", model=" + model
				+ "]";
	}
	
	public void show() {
		System.out.println(toString());
	}
}
