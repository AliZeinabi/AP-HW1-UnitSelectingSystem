package Courses;

public class GeneralCourse extends Course {
    boolean is_general_course;
    public GeneralCourse(String code, int capacity, int worth, String name, String instructor, String day, String hour, String department, String examdate) {
        super(code, capacity, worth, name, instructor, day, hour,department,examdate);
    }
}

