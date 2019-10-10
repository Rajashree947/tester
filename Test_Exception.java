package com.exception;

import java.util.Arrays;

// java test_exception 10 2
//java test_exception 10
//java test_exception 10 a 
//java test_exception 10 0
public class Test_Exception {
	
	
	public static void main(String[] args) {
		System.out.println("Test_Exception -- started");
		int num1, num2, result;
		System.out.println(Arrays.toString(args));
		
		try {
		num1= Integer.parseInt(args[0]);
		num2 = Integer.parseInt (args[1]);
		result=num1/num2;
		
		System.out.println("the result is "+result);
	}
catch (ArrayIndexOutOfBoundsException ex)  {
	System.err.println("2 arguements are needed" +ex.getMessage());
}
		catch(NumberFormatException ex)  {
			System.err.println("2 numeric arguements are needed" +ex.getMessage());
		}
		catch (ArithmeticException ex)  {
			System.err.println("2 numeric, 2nd non zero arguements are needed" + ex.getMessage());
		}
		catch (Exception ex) {
			System.err.println("general error occured" +ex.getMessage());
		}
		finally  {
			System.out.println("i will execute in all situations");
		}
		System.out.println("Test_Exception -- ended");
}
}
