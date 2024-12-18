package com.nt.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component("emp")
@ConfigurationProperties(prefix="emp.details")
@Data

public class Employee {
 //spring bean properties
	private String name;
	private int age;
	

	
	
	
	
	
}
