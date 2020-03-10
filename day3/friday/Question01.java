package com.capgemini.quiz.day3.friday;
	/* What is the output of the following ? */
public class Question01 {
	int i;
	void display() {
		System.out.println(i);
	}
	}

class Q1 extends Question01
{
	int j;
	void display() {
		System.out.println(j);
	}
	}
	class TestQ1{
		public static void main(String args[]) {
			Question01 Q=new Question01();
			Q1 q=new Q1();
			Q.i=1;
			q.j=2;
			
			Q.display();
			q.display();
		}
	}



