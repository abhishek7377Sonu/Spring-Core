package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.beans.CustomerInfo;
import com.nt.beans.Employee;

@SpringBootApplication
public class BootProj05ConfigurationPropertiesAnnotation1Application {

	public static void main(String[] args) {
		//get IOC container
	ApplicationContext ctx=	SpringApplication.run(BootProj05ConfigurationPropertiesAnnotation1Application.class, args);
//get Spring bean class object]
	CustomerInfo info=ctx.getBean("custinfo",CustomerInfo.class);
	
	//invoke the b.method
	
	System.out.println("CustomerInfo object data ::"+info);

	System.out.println("==========================================");
	Employee emp=ctx.getBean("emp", Employee.class);
	System.out.println("Employee object data ::"+emp);
	
	//close container
	((ConfigurableApplicationContext) ctx).close();
	
	}

}
