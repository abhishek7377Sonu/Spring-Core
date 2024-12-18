package com.nt.test;

import com.nt.service.Arithmetic;

public class LambdaTest {

	public static void main(String[] args) {
		// Style 1
		/*	Arithmetic ar=(int a,int b)->{
				int c=a+b;
				return c;
			};
			System.out.println(ar.add(10, 20));	
		*/
		// Style 2
		/*
		Arithmetic ar=(int a,int b)-> a+b;
		
		System.out.println(ar.add(20,45));
		*/
		// Style 3
/*Arithmetic ar=( a, b)-> a+b;
		
		System.out.println(ar.add(10,45)); 
		*/
		//Style 4
/*  Arithmetic ar=( x, y)-> x+y;
		
		System.out.println(ar.add(12,45)); 
		*/ 
		//style 5
Arithmetic ar=(int a,int b)-> {return a+b;
};
		System.out.println(ar.add(20,45));
	}
}