package service;

import java.util.ArrayList;
import java.util.List;

import dao.EmployeeDAO;
import dao.StudentDAO;
import model.Employee;
import model.Student;
import valueobject.EmployeeStudentResponseVO;

public class EmployeeService {
	StudentService stuServ = new StudentService();

    EmployeeDAO empDao = new EmployeeDAO();
    StudentDAO stuDao=new StudentDAO();

    public List<EmployeeStudentResponseVO> getEmployeeStudents() {
        List<Employee> employeesWhoAreStudents = empDao.getEmployeeStudents();
        List<EmployeeStudentResponseVO> result = new ArrayList<>();
        for (Employee empS : employeesWhoAreStudents) {
            // populate response object
            EmployeeStudentResponseVO obj = new EmployeeStudentResponseVO();
            // setting the employee
            obj.emp = empS;
            // setting the student
            // we dont have student details. But we have student Id.
            // So I can ask student service to give me student details using the id I have.
            // I can also ask student dao. But I let my service talk to another service first rather than dao directly.
            obj.stu = stuServ.getStudentByStudentId(empS.sid);
            // add this employee to result list
            result.add(obj);
        }
        // return list of result objects
        return result;
    }

    public EmployeeStudentResponseVO getEmployeeStudentById(Integer empId) {
    	EmployeeStudentResponseVO empst = new EmployeeStudentResponseVO();
    	Employee em=empDao.getEmployeeById(empId);
    	Student st=stuDao.getStudentById(em.sid);
    	empst.emp=em;
    	empst.stu=st;
		return empst;
    	
}}



