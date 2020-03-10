package com.capgemini.quiz.day1.wednesday;

public class Question05 {

	/*which of the following gives indentation error 
	 * 
	 * a)  a=(if x=0)?b:g;
	 * 
	 * b)a=(if x=0)
	 * 	   ?b:g;
	 * 
	 * 
	 * c)a=(if x=0)
	 * 		?b
	 * 		:g;
	 * 
	 * d)a=b:g?
	 * 		(Exp);
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c,x=0;
		
		a=(x==0)?2:3;
		System.out.println(a);
		
	}

}
