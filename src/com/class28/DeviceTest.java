package com.class28;

public class DeviceTest {

	public static void main(String[] args) {
		
		Apple apple=new Apple("iPhone","11 pro");
		
		System.out.println(apple.deviceType);
		
		Apple apple1=new Apple("iPhone","12 pro");
		System.out.println(apple.deviceType+ apple.name);

	}

}
