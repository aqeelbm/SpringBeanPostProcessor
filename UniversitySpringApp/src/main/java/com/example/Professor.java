/**
 * 
 */
package com.example;

/**
 * author: Aqeel
 */
public class Professor {
	
	public Professor() {
		System.out.println("constructor() -- Professor");
	}
	
	public void initBean() {
		System.out.println("initBean() -- Professor");
	}
	
	public void destroyBean() {
		System.out.println("destroyBean() -- Professor");
	}

	@Override
	public String toString() {
		return "Professor";
	}
	 
}
