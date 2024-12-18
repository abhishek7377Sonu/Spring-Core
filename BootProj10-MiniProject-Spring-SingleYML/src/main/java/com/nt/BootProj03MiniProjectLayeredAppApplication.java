package com.nt;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.controller.PayRollSystemController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj03MiniProjectLayeredAppApplication {

	@Bean(name = "c3p0Ds")
	@Profile("uat")
	public ComboPooledDataSource createC3POSDs() throws Exception {
		System.out.println("BootProj03MiniProjectLayeredAppApplication.createC3POSDs()");
		ComboPooledDataSource cds = new ComboPooledDataSource();
		cds.setDriverClass("oracle.jdbc.driver.OracleDriver");
		cds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		cds.setUser("abhishek");
		cds.setPassword("krishna");
		return cds;
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj03MiniProjectLayeredAppApplication.class, args);
		// get Controller class object
		PayRollSystemController controller = ctx.getBean("controller", PayRollSystemController.class);
		// gather inputs from end user
		Scanner sc = new Scanner(System.in);
		System.out.print("enter desg1 : ");
		String desg1 = sc.next().toUpperCase();
		System.out.print("enter desg2 : ");
		String desg2 = sc.next().toUpperCase();
		System.out.print("enter desg3 : ");
		String desg3 = sc.next().toUpperCase();
		sc.close();

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
			listEmps.forEach(System.out::println); // method reference operator
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("Internal DB problem");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Internal Unknown problem");
		}
//close container
		((ConfigurableApplicationContext) ctx).close();
	}// main

}// class
