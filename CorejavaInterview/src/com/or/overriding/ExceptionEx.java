package com.or.overriding;

import java.util.logging.Logger;

public class ExceptionEx {

	public static void main(String[] args) {
		System.out.println("55");
		System.out.println("55");
		System.out.println("55");
		System.out.println("55");
		try{
			System.out.println(10/0);
		}catch (ArithmeticException e) {
			System.out.println(10/2);
		}
		System.out.println("fghj");
		System.out.println("tyui");
		System.out.println("gfd");
	}

}
