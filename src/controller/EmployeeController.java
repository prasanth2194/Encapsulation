package controller;

import java.util.List;

import model.Student;
import service.EmployeeService;
import service.StudentService;
import valueobject.EmployeeStudentResponseVO;

public class EmployeeController {
	
	 EmployeeService empService = new EmployeeService();
	    StudentService stuService = new StudentService();


	    public List<EmployeeStudentResponseVO> getEmployeeWhoAreStudents() {
	        return empService.getEmployeeStudents();
	    }

	    public EmployeeStudentResponseVO getEmployeeStudentDetailsById(Integer empId) {
	        return empService.getEmployeeStudentById(empId);
	    }

}
