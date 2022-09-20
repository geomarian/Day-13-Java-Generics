/**
 * 
 */
package com.bridgelabz;


/**
 * @author ASUS
 *
 */
public class MaxIntegerUC1 {
	 
	

	    public static void testMaximum(Integer a, Integer b, Integer c) {
	        Integer max = a;
	      
	        if(b.compareTo(a)>0){
	            max = b;
	        }
	        if(c.compareTo(max)>0){
	            max = c;
	        }
	        System.out.println("Maximum Number is = "+max);
	    }
	    
	    /**
		 * @param args
		 */
		 public static void main(String[] args) {
		    	        
		        Integer a = 90, b = 150, c =880;
		        
		        testMaximum (a,b,c); //calling method
		    }
}