package service;

import model.Student;

public class StudentService {
	 public Object getStudents() {
	        return null;
	    }

	    public Student getStudentByStudentId(int sid) {

	        // select * from student where studentId = ${sid};

	        // populating dummy object intead of object that database will return
	        Student stu = new Student();
	        // fetched object will have same id obviously
	        stu.sid = sid;
	        stu.college = "Narayana";
	        stu.city = "Nellore";


	        return stu;
	    }
	}



