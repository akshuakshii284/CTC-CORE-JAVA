package technoservebatch9;

public class phonebuilder {
	private String os;
	private int ram;
	private String processor;
	private double screensize;
	private int battery;
	public phonebuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public phonebuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public phonebuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public phonebuilder setScreensize(double screensize) {
		this.screensize = screensize;
		return this;
	}
	public phonebuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	
	public Phone getPhone() {
		return new Phone(os,ram,processor,screensize,battery);
	}
	
	
	
	
	
}
