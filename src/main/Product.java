package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product implements Item {
	private int serialNumber;
	private String manufacturer, name;
	private Date manufacturedOn;
	
	private static int currentProductionNumber = 1;
	
	public Product(String name) {
		this.name = name;
		serialNumber = currentProductionNumber;
		currentProductionNumber++;
		manufacturedOn = new Date();
	}
	
	public String toString() {
		String info = "Manufacturer: " + MANUFACTURER + "\n";
		info += "Serial Number: " + serialNumber + "\n";
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		info += "Date: " + dateFormat.format(manufacturedOn) + "\n";
		info += "Name: " + name + "\n";
		return info;
	}

	public void setProductionNumber(int number) {
		currentProductionNumber = number;
		
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public Date getManufactureDate() {
		return manufacturedOn;
	}

	public int getSerialNumber() {
		return serialNumber;
	}	
}
