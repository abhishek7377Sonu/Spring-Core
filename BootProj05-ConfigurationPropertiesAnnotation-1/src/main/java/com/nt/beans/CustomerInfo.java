package com.nt.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component("custinfo")
@ConfigurationProperties(prefix="cust.info")
@Setter
public class CustomerInfo {
 //spring bean properties
	private String name;
	private String age;
	private String addrs;
	private Float billAmt;
	@Override
	public String toString() {
		return "CustomerInfo [name=" + name + ", age=" + age + ", addrs=" + addrs + ", billAmt=" + billAmt + "]";
	}

	
	
	
	
	
	
}
