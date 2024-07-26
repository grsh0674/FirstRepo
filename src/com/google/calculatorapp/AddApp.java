package com.google.calculatorapp;

public class AddApp extends BasicCalculator {
	public void Addition(int... n) {

		 int sum = 0;
	        for (int number : n) {
	            sum += number;
	        }
	        System.out.println("Result is :" + sum);
	}
	
	/*
	 * public String Addition(int n1,int n2,int n3) {
	 * 
	 * result= n1+n2+n3; return "Result is :" + result ;
	 * 
	 * 
	 * }
	 * 
	 * public String Addition(int n1,int n2,int n3, int n4) {
	 * 
	 * result= n1+n2+n3+n4; return "Result is :" + result ; }
	 * 
	 * public String Addition(int n1,int n2, int n3, int n4, int n5) {
	 * 
	 * result= n1+n2+n3+n4+n5; return "Result is :" + result ; }
	 */

}
