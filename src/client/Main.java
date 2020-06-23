package client;

import controller.EmployeeController;

public class Main {

	public static void main(String[] args) {
		 EmployeeController control = new EmployeeController();

	        // printing the response
	        System.out.println(control.getEmployeeWhoAreStudents());
	        System.out.println(control.getEmployeeStudentDetailsById(2));
	    }

	}


