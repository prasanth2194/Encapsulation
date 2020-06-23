package model;

public class Employee {
	 public int eid;
	    public String name;
	    public String email;
	    public Integer sid;

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "eid=" + eid +
	                ", name='" + name + '\'' +
	                ", email='" + email + '\'' +
	                ", sid=" + sid +
	                '}';
	    }

}
