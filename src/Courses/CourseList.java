package Courses;
import java.util.HashMap;

public class CourseList {
    private static HashMap<String, GeneralCourse> generallist = new HashMap<>();
    private static HashMap<String, ProperCourse> properlist = new HashMap<>();
    public static HashMap<String,Course> list = new HashMap<>();
    //get & set course list
    public static HashMap<String, GeneralCourse> getGenerallist() {
        return generallist;
    }
    public static void setGenerallist(HashMap<String, GeneralCourse> generallist) {
        CourseList.generallist = generallist;
    }
    public static HashMap<String, ProperCourse> getProperlist() {
        return properlist;
    }
    public static void setProperlist(HashMap<String, ProperCourse> properlist) {
        CourseList.properlist = properlist;
    }
    public static HashMap<String,Course> getList() {
        return list;
    }
    public static void setList(HashMap<String,Course> list) {
        CourseList.list = list;
    }
}
