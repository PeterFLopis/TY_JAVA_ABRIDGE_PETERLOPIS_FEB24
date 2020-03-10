package com.capgemini.quiz.day6.monday;

import java.util.Locale;

public class Question02 {
	public static void main(String[] args) {
		String s = "HI";
		String s1 = "WOrld";
		System.out.println(s.toUpperCase() + " " + s1.toLowerCase());
	}
}
/*
 * @return the {@code String}, converted to uppercase.
 * 
 * @see java.lang.String#toUpperCase(Locale)
 */
/*
 * what is the output:
 * 
 * a)HI world 
 * b) Hi World
 *  c) Hi wORLD
 *   d) HI wORLD
 */