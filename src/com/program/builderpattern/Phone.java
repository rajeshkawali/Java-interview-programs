package com.program.builderpattern;

public class Phone {

	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;

	public String getOs() {
		return os;
	}

	public int getRam() {
		return ram;
	}

	public String getProcessor() {
		return processor;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public int getBattery() {
		return battery;
	}

	public Phone(String os, int ram, String processor, double screenSize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Phone [os=");
		builder.append(os);
		builder.append(", ram=");
		builder.append(ram);
		builder.append(", processor=");
		builder.append(processor);
		builder.append(", screenSize=");
		builder.append(screenSize);
		builder.append(", battery=");
		builder.append(battery);
		builder.append("]");
		return builder.toString();
	}
	

	
}
