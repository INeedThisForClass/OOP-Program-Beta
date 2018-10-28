package main;

public class MoviePlayer extends Product implements MultiMediaControl {

	private Screen screen;
	private MonitorType monitorType;
	
	public MoviePlayer(String name, MonitorType monitorType, Screen screen) {
		super(name);
		this.monitorType = monitorType;
		this.screen = screen;
	}

	public void play() {
		System.out.println("Playing...");
	}

	public void stop() {
		System.out.println("Stopped...");
	}

	public void previous() {
		System.out.println("Previous...");
	}

	public void next() {
		System.out.println("Next...");
	}
	
	public String toString() {
		String info = "Monitor: " + monitorType + "\n"
				+ "Screen: " + screen;
		return info;
	}
}
