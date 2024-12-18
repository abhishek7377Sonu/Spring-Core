package com.nt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
	public List<Employee> getEmpsByDesgs(String desg1, String desg2, String desg3) throws Exception ;

	public List<Employee> fetchEmpDetailsByDesgs();

	public List<Employee> fetchEmpDetailsByDesgs(String desg1, String desg2, String desg3);
}
