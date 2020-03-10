package com.capgemini.quiz.day3.friday;

public class Question09 {
	public static void main(String[] args) {
		Derived obj = new Derived("Test");
	}

	/*
	 * this() should always be the first line of constructor. ther should be atleast
	 * one constructor with this keyword it can be any order.
	 */
/* what is the output of progrm : 
 * a) HI4 HI3 HI2 HI1
 * b) HI 4 HI1
 * c) HI4 HI2 HI1 HI3
 * d) HI4 HI2
 */
}

class Base {
	String name;

	Base() {
		this(" ");
		System.out.println("HI 3");
	}

	Base(String name) {
		this.name = name;
		System.out.println("HI 4");

	}

}

class Derived extends Base {
	Derived() {
		System.out.println("HI 1");
	}

	Derived(String name) {
		super(name);
		System.out.println("HI 2");
	}

}