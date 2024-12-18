package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.beans.Hospital;

@SpringBootApplication
public class BootProj04ValueAnnotationApplication {
   
	public static void main(String[] args) {
		//Get IOC container
	ApplicationContext ctx=	SpringApplication.run(BootProj04ValueAnnotationApplication.class, args);

	//get spring bean class object
	Hospital hospital=ctx.getBean("hsptl",Hospital.class);
	//invoke the method
	System.out.println("Spring bean class obj data :: "+hospital);
	System.out.println("============================");
	
	//close container
	((ConfigurableApplicationContext) ctx).close();

	    Environment env=ctx.getEnvironment();
	    System.out.println(env.toString());
	    System.out.println("os name value="+env.getProperty("os.name"));
	    System.out.println("Hospital name value="+env.getProperty("hsptl.name"));
	    System.out.println("Hospital name value="+env.getProperty("Path"));
	
	}

}
