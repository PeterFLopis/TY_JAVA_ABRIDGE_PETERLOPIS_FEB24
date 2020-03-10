package com.capgemini.quiz.day1.wednesday;

/* what is the output of the program 
 * 
 * 
 */

public class Question10 {
	public static void main(String[] args) {
		

	
	a: for(int i=1;i<5;i++)
	{
			for(int j=0;j<3;j++)
			{
				System.out.println(i); /* */ 
				System.out.println(j);
				if(i==3) {
					break a;
				}
			}
		
	}

	
	}
	
	/* a) 1012
	 * b) error invalid syntax
	 * c) 10111220212230
	 * d) 10122012
	 */
}
