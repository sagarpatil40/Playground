/**
 * 
 */
package com.whattheheckisthis.factorypattern;

/**
 * @author sagarpatil
 *
 */
public enum CarType {
	CAMRY("Camry"){

		@Override
		Car getCar() {
			// TODO Auto-generated method stub
			return new Camry();
		}
		
	},
	
	CIVIC("Civic"){

		@Override
		Car getCar() {
			// TODO Auto-generated method stub
			return new Civic();
		}
		
	};
	
	CarType(String type){
		this.type = type;
	}
	
	abstract Car getCar();
		
	
	private String type;
	

	public String getType() {
		return type;
	}
	
	
}
