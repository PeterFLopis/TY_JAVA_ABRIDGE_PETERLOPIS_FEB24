package com.capgemini.quiz.day3.friday;

/* what is output of : */

public class Question08 {

}


class T{
	public static void main(String[] args) {
		T t =new T(8,10);
	}
	T(){
		System.out.println("Default");
	}
	T(int a,int b){
		this(5);
		System.out.println(a*b);
	}
	T(int x){
		this();
		System.out.println(x);
	}
}
