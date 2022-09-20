/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class MaxFloatUC2 {
	/**
	 * @param args
	 */
	public static void testMaximum(Float a, Float b, Float c) {
	        Float max = a;

	        if (b.compareTo(a) > 0) {
	            max = b;
	        }
	        if (c.compareTo(max) > 0) {
	            max = c;
	        }

	        System.out.println("Maximum Number is: " + max);

	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	        Float a = 20.85f, b = 90.55f, c = 80.98f;

	        testMaximum(a, b, c);  
	}

}
