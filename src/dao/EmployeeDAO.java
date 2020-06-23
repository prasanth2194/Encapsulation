package dao;


import java.util.*;

import model.Employee;

public class EmployeeDAO {
	 public Employee getEmployeeById(int id) {

	        // select * from employee where eid = ${id}

	        Employee emp = new Employee();
	        emp.eid = 2;
	        emp.email = "p@com";
	        emp.name = "Prasanth";
	        emp.sid = 23;
	        return emp;
	    }

	    // all employees who are students also
	    public List<Employee> getEmployeeStudents() {

	        // method 1
	        // select * from employee where studentid is not null

	        // method 2
	        // select * from employee;
	        // iterate and filter employees who are not students

	        // method 2

	        // data population to simulate database result
	        Employee emp1 = new Employee();
	        emp1.eid = 2;
	        emp1.email = "p@com";
	        emp1.name = "Prasanth";
	        emp1.sid = 23;

	        Employee emp2 = new Employee();
	        emp2.eid = 2;
	        emp2.email = "st@com";
	        emp2.name = "Someone";
	        emp2.sid = null;

	        // say this is what database returns for select * from employee;
	        // all employees
	        List<Employee> emps = new ArrayList<>();
	        emps.add(emp1);
	        emps.add(emp2);

	        List<Employee> result = new ArrayList<>();
	        for(Employee emp: emps) {
	            if(emp.sid != null) {
	                result.add(emp);
	            }
	        }

	        return result;
	    }
	}



