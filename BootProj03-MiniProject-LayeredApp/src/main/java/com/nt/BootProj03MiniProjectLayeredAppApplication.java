package com.nt;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PayRollSystemController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj03MiniProjectLayeredAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj03MiniProjectLayeredAppApplication.class, args);
		// get Controller class object
		PayRollSystemController controller = ctx.getBean("controller", PayRollSystemController.class);
		// gather inputs from end user
		Scanner sc = new Scanner(System.in);
		System.out.println("enter desg1");
		String desg1 = sc.next().toUpperCase();
		System.out.println("enter desg2");
		String desg2 = sc.next().toUpperCase();
		System.out.println("enter desg3");
		String desg3 = sc.next().toUpperCase();

		// invoke method
		try {
			List<Employee> listEmps = controller.showEmpsDetailsByDesgs(desg1, desg2, desg3);
		/*	for (Employee e : listEmps) { //enhanced for loop
				System.out.println(e);
			}*/
			/*
			listEmps.forEach(emp->     //java 8 forEach 
			        System.out.println(emp));
			        */
			listEmps.forEach(System.out::println); //method reference operator
		} 
		catch (SQLException se) {
			se.printStackTrace();
			System.out.println("Internal DB problem");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Internal Unknown problem");
		}
//close container
		 ((ConfigurableApplicationContext) ctx).close();
	}//main

}//class
