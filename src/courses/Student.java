package courses;
import java.util.LinkedList;

public class Student {
    private static LinkedList stulist = new LinkedList<>() ;

    public static LinkedList getStulist() {
        return stulist;
    }

    public static void setStulist(LinkedList stulist) {
        Student.stulist = stulist;
    }

    public void add(){

    }
}
