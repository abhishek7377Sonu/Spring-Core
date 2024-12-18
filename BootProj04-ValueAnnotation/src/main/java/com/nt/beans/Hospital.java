package com.nt.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component("hsptl")
@Data
@PropertySource("classpath:input.properties")
public class Hospital {

	@Value("KIIMS")
	private String name;   
	@Value("30")
	private int rank;

	@Value("${hsptl.name}")
	private String name1;
	@Value("${hsptl.age}")
	private int age;

	@Value("${Path}")
	private String pathData;
	
	@Value("${os.name")
	private String os;

	@Autowired
	@Value("#{lInfo}")
	private LabTestInfo Info;

	@Value("#{lInfo.bloodProfilePrice+lInfo.rtpcrPrice}") // SPEL based Arithmetic operation and injection
	private float labTestBillAmt;

}
