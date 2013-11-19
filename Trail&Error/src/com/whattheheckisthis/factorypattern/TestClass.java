package com.whattheheckisthis.factorypattern;

public class TestClass {

	public static void main(String[] args) {
		CarType.CAMRY.getCar().construct();
		CarType.CIVIC.getCar().construct();
	}
	
}
