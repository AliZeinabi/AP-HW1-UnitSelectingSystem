package Courses;

public class Check {
    private String coursecode;
    static boolean nooverlap;
    public static int sum;
    public static int prosum;
//    public static void check(String coursecode) {
//        try {
//            sum = CourseList.getGenerallist().get(coursecode).getWorth();
//            prosum = CourseList.getGenerallist().get(coursecode).getWorth();
//        }catch (Exception e){
//            sum = CourseList.getProperlist().get(coursecode).getWorth();
//        }
//        for (String g : StudentData.usergencourselist.get(StudentData.currentuser.getstudentnumber()).keySet()) {
//            sum += CourseList.getGenerallist().get(g).getWorth();
//            prosum += CourseList.getGenerallist().get(g).getWorth();
//
//        }
//        for (String p : StudentData.userprocourselist.get(StudentData.currentuser.getstudentnumber()).keySet()) {
//            sum += CourseList.getProperlist().get(p).getWorth();
//        }
//        boolean run = false;
//        boolean isoverlapday = false;
//        String[] daysOfCourse;
//        try {
//            daysOfCourse = CourseList.getGenerallist().get(coursecode).getday().split("-");
//        } catch (Exception e) {
//            daysOfCourse = CourseList.getProperlist().get(coursecode).getday().split("-");
//        }
//        for (GeneralCourse course:StudentData.usergencourselist.get(StudentData.currentuser.getstudentnumber()).values()){
//            for (String day1:course.getday().split("-")){
//                for (String day2:daysOfCourse){
//                    if (day1.equals(day2)){
//                        isoverlapday=true;
//                        run = true;
//                        break;
//                    }
//                }
//                if (run){break;}
//            }
//            if (run){break;}
//        }
//        for (ProperCourse course:StudentData.userprocourselist.get(StudentData.currentuser.getstudentnumber()).values()) {
//            for (String day1 : course.getday().split("-")) {
//                for (String day2 : daysOfCourse) {
//                    if (day1.equals(day2)) {
//                        isoverlapday = true;
//                        run = true;
//                        break;
//                    }
//                }
//                if (run) {
//                    break;
//                }
//            }
//            if (run) {
//                break;
//            }
//        }
//        String hour ;
//        try {
//            hour = CourseList.getGenerallist().get(coursecode).getHour();
//
//        }catch (Exception e){
//            hour = CourseList.getProperlist().get(coursecode).getHour();
//        }
//        isoverlap = true;
//            if (isoverlapday){
//                for (GeneralCourse course:StudentData.usergencourselist.get(StudentData.currentuser.getstudentnumber()).values()){
//                    int coursestart = Integer.parseInt(course.getHour().split("-")[0].split(":")[0]);
//                    int courseend = Integer.parseInt(course.getHour().split("-")[1].split(":")[0]);
//                    int coursestartmin = Integer.parseInt(course.getHour().split("-")[0].split(":")[1]);
//                    int courseendmin = Integer.parseInt(course.getHour().split("-")[1].split(":")[1]);
//                    int newcoursestart = Integer.parseInt(hour.split("-")[0].split(":")[0]);
//                    int newcoursestartmin = Integer.parseInt(hour.split("-")[0].split(":")[1]);
//                    int newcourseend = Integer.parseInt(hour.split("-")[1].split(":")[0]);
//                    int newcourseendmin = Integer.parseInt(hour.split("-")[1].split(":")[1]);
//                    if (newcourseend<coursestart){
//                       isoverlap = false;
//                       break;
//                    } else if (newcourseend==coursestart && newcourseendmin<coursestartmin) {
//                        isoverlap = false;
//                        break;
//                    } else if (newcoursestart>courseend) {
//                        isoverlap = false;
//                        break;
//                    } else if (newcoursestart==courseend && newcoursestartmin>courseendmin) {
//                        isoverlap = false;
//                        break;
//                    }
//                }
//                for (ProperCourse course:StudentData.userprocourselist.get(StudentData.currentuser.getstudentnumber()).values()){
//                    int coursestart = Integer.parseInt(course.getHour().split("-")[0].split(":")[0]);
//                    int courseend = Integer.parseInt(course.getHour().split("-")[1].split(":")[0]);
//                    int coursestartmin = Integer.parseInt(course.getHour().split("-")[0].split(":")[1]);
//                    int courseendmin = Integer.parseInt(course.getHour().split("-")[1].split(":")[1]);
//                    int newcoursestart = Integer.parseInt(hour.split("-")[0].split(":")[0]);
//                    int newcoursestartmin = Integer.parseInt(hour.split("-")[0].split(":")[1]);
//                    int newcourseend = Integer.parseInt(hour.split("-")[1].split(":")[0]);
//                    int newcourseendmin = Integer.parseInt(hour.split("-")[1].split(":")[1]);
//                    if (newcourseend<coursestart){
//                        isoverlap = false;
//                        break;
//                    } else if (newcourseend==coursestart && newcourseendmin<coursestartmin) {
//                        isoverlap = false;
//                        break;
//                    } else if (newcoursestart>courseend) {
//                        isoverlap = false;
//                        break;
//                    } else if (newcoursestart==courseend && newcoursestartmin>courseendmin) {
//                        isoverlap = false;
//                        break;
//                    }
//                }
//            } else isoverlap=false;
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
