/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class MaxStringUC3 {

	/**
	 * @param args
	 */
	 public static void testMaximum(String a, String b, String c) {
	        String max = a;

	        if(b.compareTo(a)>0){
	            max = b;
	        }
	        if(c.compareTo(max)>0){
	            max = c;
	        }

	        System.out.println("Maximum String is: "+max);

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a = "Fruits", b = "Vegetables" , c = "Non-Veg";
        testMaximum (a,b,c);
	}

}
