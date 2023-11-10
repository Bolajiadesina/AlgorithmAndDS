package com.portfolio.bolaji.dataStructure;

import java.util.Arrays;

public class LuxoftInterview {
	/*
	 * Given a string of simple words (a sequence of latin characters in a 
	 * lower case) delimited by a comma. Implement a method to convert
	 *  the string into a new string where all the words are truncated up 
	 *  to first 4 characters and delimited by a
	 *   tab (\t).
	 *   
	 *   
	 *   
	 *   "cat,parrot,dog,fish,horse" -> "cat\tparr\tdog\tfish\thors"
	 *   */
	
	
	
	
	
	public String [] formatWord(String word) {
		
	String [] result= word.split("&");
		
	//	String result= word.replace("&",",");
			
		
		return result;
	}
	
	
public String conert(String word) {
		
	
		
		String result= word.replace("&",",");
			
		
		return result;
	}
	

	public static void main(String []args) {
		
		LuxoftInterview lx= new LuxoftInterview();
		
		//String [] newString =lx.formatWord("cat&parrot&dog&fish&horse");
		
		//System.out.println(Arrays.deepToString(newString));	
		
	}

}
