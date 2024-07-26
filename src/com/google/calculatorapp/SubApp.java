package com.google.calculatorapp;

public class SubApp extends BasicCalculator{
	
	public void Subraction(int... n) {
		if (n.length == 0) {
            throw new IllegalArgumentException("At least one number is required");
        }

		 int sub = n[0];
	        for (int i=1; i<n.length;i++) {
	            sub -= n[i];
	        }
	        System.out.println("Result is :" + sub);
	}

	/*
	 * public String Subraction(int n1,int n2) {
	 * 
	 * result= n1-n2; return"Result is :" + result; }
	 * 
	 * public String Subraction(int n1,int n2,int n3) {
	 * 
	 * result= n1-n2-n3; return"Result is :" + result; }
	 * 
	 * public String Subraction(int n1,int n2,int n3,int n4) {
	 * 
	 * result= n1-n2-n3-n4; return"Result is :" + result; }
	 * 
	 * public String Subraction(int n1,int n2, int n3,int n4, int n5) {
	 * 
	 * result= n1-n2-n3-n4-n5; return"Result is :" + result; }
	 */

}
