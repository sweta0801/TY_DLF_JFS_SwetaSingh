package com.tyss.forestry.controller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	 Scanner sc = new Scanner(System.in);
	 
	 public static boolean checkEmail(String email) {
			String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
					+ "A-Z]{2,7}$";

			Pattern pattern = Pattern.compile(emailRegex);
			if (email == null)
				return false;
			Boolean bool = pattern.matcher(email).matches();
			if (bool == true) {
				return true;
			} else {
				System.out.println("Incorrect Email,please try again");
				return false;
			}
		}
	 
	 public static boolean checkDateFormat(String s) {
			Pattern p = Pattern.compile("^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$");
			Matcher matcher = p.matcher(s);
			Boolean bool = (matcher.find() && matcher.group().equals(s));
			if (bool == true) {
				return true;
			} else {
				System.out.println("Incorrect date format,please try again");
				return false;
			}
		}
	
}
