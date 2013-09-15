/**
 * 
 */
package com.whattheheckisthis.trials;

/**
 * @author sagarpatil
 *
 */
public class Complex {

	private final double real;
	private final double img;
	
	public Complex(double real,double img){
		this.real = real;
		this.img = img;
	}
	
	public Complex add (Complex addThis){
		
		return new Complex(this.real + addThis.real, this.img + addThis.img);
	}
	
	public String toString(){
		return "Complex Number, real part:"+ this.real + "img part:" + this.img;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Complex c1 = new Complex(2.55, 4.55);
		Complex c2 = new Complex(3.55, 4.55);
		Complex c3 = c1.add(c2);
		System.out.println(c3.toString() );
		
	}

}
