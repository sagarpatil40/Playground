package com.wtthis.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Child extends Parent	 {

	public void process(){
		System.out.println("The data in Child class is nothig");
	}
	
	public static void main(String[] args) {
		List<Parent> parentList = new ArrayList<Parent>();
		Parent p1= new Parent();
		Parent p2 = new Parent();
		parentList.add(p1);
		parentList.add(p2);
		
		List<Child> childList = new ArrayList<Child>();
		Child c1 = new Child();
		Child c2 =new Child();
		childList.add(c1);
		childList.add(c2);
		
		printData(parentList);
		printData(childList);
	}
	
	
	private static void printData(List<?> myList){
		for(Object p:myList){
			((Parent)p).process();
		}
		
	}
	
}
