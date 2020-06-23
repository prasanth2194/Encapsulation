package dao;

import model.Student;

public class StudentDAO {
	public Student getStudentById(int id) {

        // select * from student where studentId = ${id}

        Student stu = new Student();
        stu.sid = 23;
        stu.city = "Nellore";
        stu.college = "Narayana";
        return stu;
    }

}
