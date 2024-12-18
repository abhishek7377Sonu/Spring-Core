package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller("controller")
public class PayRollSystemController {
	@Autowired
	private IEmployeeMgmtService service;
	
	public PayRollSystemController() {
		System.out.println("PayRollSystemController :: 0-param constructor");
		
	}

	public List<Employee> showEmpsDetailsByDesgs(String desg1, String desg2, String desg3) throws Exception {

		List<Employee>listEmps=service.fetchEmpDetailsByDesgs(desg1,desg2,desg3);
		return listEmps;
	}
}
