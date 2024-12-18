package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public List<Employee> getEmpsByDesgs(String desg1, String desg2, String desg3) throws Exception {
		// use DAO
		List<Employee> listEmps = dao.getEmpsByDesgs(desg1, desg2, desg3);

		return listEmps;
	}

	@Override
	public List<Employee> fetchEmpDetailsByDesgs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> fetchEmpDetailsByDesgs(String desg1, String desg2, String desg3) {
		// TODO Auto-generated method stub
		List<Employee> listEmps = null;
		try {
			listEmps = dao.getEmpsByDesgs(desg1, desg2, desg3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listEmps;
	}
}