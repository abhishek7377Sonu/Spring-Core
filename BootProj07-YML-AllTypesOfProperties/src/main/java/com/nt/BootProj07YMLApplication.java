package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.beans.PersonInfo;


@SpringBootApplication
public class BootProj07YMLApplication {

	public static void main(String[] args) {
		//get IOC container
	ApplicationContext ctx=	SpringApplication.run(BootProj07YMLApplication.class, args);
//get Spring bean class object
	PersonInfo person=ctx.getBean("pInfo",PersonInfo.class);
	//invoke the methods
	System.out.println("PersonaInfo object details ::"+person);
	
	//close container
	((ConfigurableApplicationContext) ctx).close();
	
	}

}
