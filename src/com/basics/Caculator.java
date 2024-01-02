package com.basics;
import java.io.*;
//import javafx.application.Application;
 class Caculator {
	
  //variable declaration
	// Method/Function definition
	static int a = 10;
	
	int no1=10,no2=20;
	int result;
	
	 int add() {
		result = no1 + no2;
		System.out.println("the addition =" +result);
		return result;
		
	}
	static int addition()
	{
		System.out.println(a);
		return a;
	}
	
	public static void main(String args[]) {
		addition();
		Caculator calc = new Caculator();
		 calc.add();
		 //return 0;
	}
}
