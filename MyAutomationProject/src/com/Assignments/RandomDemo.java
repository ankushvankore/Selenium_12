package com.Assignments;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n = rnd.nextInt(10);
		// Will generate any random value in the range of 0 to 9
		System.out.println(n);

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		String prvDate = s.format(new Date(cal.getTimeInMillis()));
		
		System.out.println(prvDate);
	}

}
