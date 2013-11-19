/**
 * 
 */
package com.whattheheckisthis.factorypattern;

/**
 * @author sagarpatil
 *
 */
public abstract class Car {

	String color;
	String year;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
	public void printFeature(){
		System.out.println("Year:"+ year +"Color:" + color);
	}
	
	public abstract void construct();
		
	
}
