package main;

public class Screen implements ScreenSpec {

	private String resolution;
	private int refreshRate;
	private int responseTime;

	public Screen(String resolution, int refreshRate, int responseTime) {
		this.resolution = resolution;
		this.refreshRate = refreshRate;
		this.responseTime = responseTime;
	}

	public String getResolution() {
		return resolution;
	}

	public int getRefreshRate() {
		return refreshRate;
	}

	public int getResponseTime() {
		return responseTime;
	}

	public String toString() {
		String info = "Resolution: " + getResolution() + "\n" //
				+ "Refresh Rate: " + getRefreshRate() + "\n" //
				+ "Response Time: " + getResponseTime() + "\n";
		return info;
	}

}
