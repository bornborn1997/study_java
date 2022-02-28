package com.apeach.lecture.ch06;

public class Televison {

	public static String company = "samsung";
	public static String model = "oled";
	public static String	info;
	public String version = "1.0";
	
	static {
		info = company + "-" + model;
	}
}
