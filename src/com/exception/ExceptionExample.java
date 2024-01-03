package com.exception;

public class ExceptionExample {
	public static void main(String[] args)throws Exception {
		try {
		System.out.println("100");
		System.out.println("200");
		System.out.println("300");
		System.out.println(400/0);
		System.out.println("500");
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
			//System.exit(0);
		}
		catch(NullPointerException ex1)
		{
			System.out.println(ex1);
		}
		finally {
			System.out.println("releases the resources!");
		}
	}

}
//exception object -> name of the exception , description of the exception,line number
