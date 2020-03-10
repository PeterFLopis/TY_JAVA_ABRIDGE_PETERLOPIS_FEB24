package com.capgemini.quiz.day5.sunday;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question10 {
	public static void main(String[] args) {

		LocalDateTime mu = LocalDateTime.now();
		System.out.println("Before formaing: " + mu);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("DD=YY=MMM hh:ss:ss");

		String formattedDate = mu.format(myFormatObj);
		System.out.println("After format" + formattedDate);
	}

}

/*
 * output is : a) error
 *  b) Before formaing: 2020-03-09T10:39:32.849 After
 * 			format69=20=Mar 10:32:32
 *c) current formatted version
 *
 *d) blank
 * 
 */