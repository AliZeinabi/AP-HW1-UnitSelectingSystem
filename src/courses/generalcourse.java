package courses;

public class generalcourse extends course{
    boolean is_general_course;
    public generalcourse(int code, int capacity, int worth, String name, String instructor, String day, String hour,String department) {
        super(code, capacity, worth, name, instructor, day, hour,department);
        is_general_course = true;
    }
}

