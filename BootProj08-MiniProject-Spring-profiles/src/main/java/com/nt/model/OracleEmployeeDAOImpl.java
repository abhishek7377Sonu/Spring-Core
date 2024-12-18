package com.nt.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nt.dao.IEmployeeDAO;
@Component
@Repository("oraEmpDAO")
//@Profile({"uat","prod","default"})
@Profile({"uat","prod"})
public class OracleEmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMP_DESGS = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?)ORDER BY JOB";

	@Autowired
	private DataSource ds;

	public OracleEmployeeDAOImpl() {
		System.out.println("OracleEmployeeDAOImpl.-0 param constructor");
	}
	@Override
	public List<Employee> getEmpsByDesgs(String desg1, String desg2, String desg3) throws Exception {
	System.out.println("OracleEmployeeDAOImpl.getEmpsByDesgs()"+ds.getClass());
		
		List<Employee> listEmps = null;
		// get pooled jdbc con object
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(GET_EMP_DESGS)// try with
																											// resources

		) {
			// set Query param values
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);

			// execute the query
			try (ResultSet rs = ps.executeQuery()) {
				listEmps = new ArrayList();
				// copy ResultSet object records to List collection as Employee class objects
				while (rs.next()) {
					Employee emp = new Employee();
					emp.setEmpno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSal(rs.getFloat(4));
					listEmps.add(emp);
				} // while

			} // try2

		} // try1
		catch (SQLException se) {
			se.printStackTrace();
			throw se; // exception rethrowing

		} catch (Exception e) {
			e.printStackTrace();
			throw e; // exception rethrowing

		}
		return listEmps;
	}// method

}// class
