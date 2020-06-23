package valueobject;

import model.Employee;
import model.Student;

public class EmployeeStudentResponseVO {
	 public Employee emp;
	    public Student stu;

	    @Override
	    public String toString() {
	        return "EmployeeStudentResponseVO{" +
	                "emp=" + emp +
	                ", stu=" + stu +
	                '}';
	    }

}
