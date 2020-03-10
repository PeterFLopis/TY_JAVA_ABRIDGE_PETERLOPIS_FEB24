package com.capgemini.quiz.day2.thursday;
/*what is the output?*/

public class Question02 {
	int a;
	int b;
	
		Question02(){
		System.out.println("Print ");
		
	}
	Question02(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println(this.a+this.b);
		System.out.println((a+b));
		}
	
	public static void main(String[] args) {
		
		int a=5;
		int b=4;
		int s=a+b;
		
		Question02 Q2=new Question02(1,1);
		System.out.println(s);
		
	}
	/* a)  2 2 9
	 * b)  9 2 2
	 * c) 11 2 2
	 * d) Error
	 */

}
