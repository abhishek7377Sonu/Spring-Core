package com.nt.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import lombok.Data;
@Component("lInfo")
@Data
public class LabTestInfo {

@Value("${lab.bpPrice}")
	private float bloodProfilePrice;

@Value("${lab.rtpcrPrice}")
private float rtpcrPrice;

@Value("${lab.echo2DPrice}")
private float echo2DPrice;



	
}
