package com.nt.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("pInfo")
@ConfigurationProperties(prefix="per.info")
public class PersonInfo {
//simple//wr type
	private Integer pid;
	private String pname;
	//array types
	private String[]favColors;
	//List-Collection types
	private List<String>studies;
	//Set-Collection type
	private Set<Long>phoneNumbers;
	//Map-collection type
	private Map<String,Object>idDetails;
	
	private JobDetails jobInfo;
	
	
	
}
