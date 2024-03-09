package Courses;

public class Check {
    private String coursecode;
    static boolean nooverlap;
    public static int sum;
    public static int prosum;
    public static boolean islimitreached(int courseworth){
        sum = courseworth;
        boolean check = false;
        for (Course course:StudentData.userlist.get(StudentData.currentuser.getstudentnumber()).values()){
            sum = sum+course.getWorth();
        }
        if (sum>20){
            check = true;
        }
    return check ;
    }
    public static boolean isgenlimitreached(int courseworth){
        prosum = courseworth;
        boolean check = false;
        for (GeneralCourse course:StudentData.usergencourselist.get(StudentData.currentuser.getstudentnumber()).values()){
            prosum = prosum+course.getWorth();
        }
        if (prosum>5){
            check = true;
        }
        return check ;
    }
}
