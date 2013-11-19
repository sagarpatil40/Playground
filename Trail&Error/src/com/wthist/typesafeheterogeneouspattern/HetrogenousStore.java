package com.wthist.typesafeheterogeneouspattern;

import java.util.HashMap;
import java.util.Map;

public class HetrogenousStore {
	
	//private Map<Class<?>,Object> storeMap = new HashMap<Class<?>, Object>(); 
	private static Map<String, Object> mymap = new HashMap<String,Object>();
	
	public static void main(String[] args) {
		
		mymap.put("Sagar",new Integer(34));
		mymethod(mymap);
		
		Map<String, String> temp = new HashMap<String, String>();
//		mymethod(temp); // you can't do this as Map<String, String> as not equal to Map<String, Object>
	
	
	}
	

	private static void  mymethod(Map<String,Object> ms){
		
		
	}
	
}
