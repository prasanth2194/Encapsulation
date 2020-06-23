package model;

public class Student {
	public Integer sid;

    public String college;

    public String city;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", college='" + college + '\'' +
                ", city='" + city + '\'' +
                '}';
    }


}
