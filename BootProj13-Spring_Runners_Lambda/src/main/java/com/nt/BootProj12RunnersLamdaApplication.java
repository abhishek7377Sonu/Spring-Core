package com.nt;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootProj12RunnersLamdaApplication {
	@Bean
	public CommandLineRunner createCLRunner() {
		/*
		 // LAMBDA impl for functional interface
		  * ==================================
		  * 
		CommandLineRunner clr = (String... args) -> {
			System.out.println("from CommndlineRunner : :"+Arrays.toString(args));
		};
		return clr;
		
		       //LAMBDA impl for functional interface    (Improvisation)
		        * =================================================
		CommandLineRunner clr = args -> System.out.println("from CommandLineRunner:" + Arrays.toString(args));
		return clr;
		
		 //      Using     Method Reference
		CommandLineRunner clr = args -> System.out::println;
		return clr;
		
		
		
		//LAMBDA impl for functional interface with enhanced for loop
		 
		CommandLineRunner clr=args->{
			System.out.println("CommandLineRunner");
			 for(String arg:args) {
				 System.out.println(arg);	
			 }
		};
		return clr;
		*/
		
		// *LAMBDA impl for functional interface +Stream API+static method reference
		// *=======================================
		CommandLineRunner clr=args->{
			System.out.println("CommandLineRunner");
		
			Stream.of(args).forEach(System.out::println);  
		};
		return clr;
	}
	
		/// LAMBDA impl for functional interface +Stream API+static method
			// reference(Improvisation)

		/*CommandLineRunner clr=args->{Stream.of(args).forEach(System.out::println);  
		};
		return clr;
		*/
		// LAMBDA impl for functional interface +Stream API+static method
		// reference(Improvisation)
		
		/*
		return args -> Stream.of(args).forEach(System.out::println);

	}
*/
	@Bean
	public ApplicationRunner createAppRuner() {
		
		return aargs->{
			System.out.println("application runner");
	System.out.println("non -option arg value :"+aargs.getNonOptionArgs());
	System.out.println("option arg names and values");
	Set<String>optionArgs=aargs.getOptionNames();
	optionArgs.forEach(name->{
		System.out.println(name);
		System.out.println(aargs.getOptionValues(name));
	});
		};
		
	}

	public static void main(String[] args) {
		SpringApplication.run(BootProj12RunnersLamdaApplication.class, args);
	}

}
