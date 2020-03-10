package com.capgemini.quiz.day3.friday;
/* what is the output of following : */

public class Question07 {
	
	

}
class Pen{
	
	Pen(){
		System.out.println("POP");
	}
	
}
class SketchPen extends Pen{
	String clr;
	int price;
	SketchPen(String c){
		this(50);
		System.out.println("Sketch Pen " +c);
	}
	SketchPen(int p){
		super();
		System.out.println("Sketch Pen" +p);
	}
	SketchPen(){
		
	}
}
class Test{
	public static void main(String[] args) {
		SketchPen SK=new SketchPen("Pink");
	}
}



/* a)  POP , SketchPen Pink, SketchPen 50
 * b)	POP , SketchPen 50, SketchPen Pink
 * c)SketchPen Pink, SketchPen 50
	d) ERROR

*/