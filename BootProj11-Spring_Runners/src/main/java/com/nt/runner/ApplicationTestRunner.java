package com.nt.runner;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(1) 
public class ApplicationTestRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
System.out.println("ApplicationTestRunner.run()");

		System.out.println("Option Arguments"+args.getNonOptionArgs());
		//System.out.println("Non-Option Arguments"+args.getNonOptionArgs());
	
		System.out.println("option args names and values");
		for(String name:args.getOptionNames()) {
		System.out.println(name+ "----->"+args.getOptionValues(name));
	}
	
	}

}
