package com.nt;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.beans.WishMessageGenerator;

@SpringBootApplication
public class BootProj1DependancyInjectionApplication {

	@Bean(name = "cal")
	public Calendar createCalendar() {
		System.out.println("BootProj1DependancyInjectionApplication.createCalendar()");
		return Calendar.getInstance(); // return GeorgianCalender class(sub class of calendar)object

	}

	public static void main(String[] args) {
		System.out.println("Main method");
		// get BootStrap boot application and get IOC container ref
		ApplicationContext ctx = SpringApplication.run(BootProj1DependancyInjectionApplication.class, args);

		// get Target class object
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		System.out.println("IOC container class Name :: " + ctx.getClass());

		// invoke b.method
		String result = generator.generateWishMessage("Abhishek Khandual");
		System.out.println("Wish Message is ::" + result);

		// close container
		((ConfigurableApplicationContext) ctx).close();
		System.out.println("main end");

	}

}
