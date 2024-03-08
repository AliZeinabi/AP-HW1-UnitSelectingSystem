package Courses;

public class Check {
    private String coursecode;
    static boolean isoverlap;
    static int sum;
    static int prosum;
    public static void check(String coursecode) {
        try {
            sum = CourseList.getGenerallist().get(coursecode).getWorth();
            prosum = CourseList.getGenerallist().get(coursecode).getWorth();
        }catch (Exception e){
            sum = CourseList.getProperlist().get(coursecode).getWorth();
        }
        for (String g : StudentData.usergencourselist.get(StudentData.currentuser.getstudentnumber()).keySet()) {
            sum += CourseList.getGenerallist().get(g).getWorth();
            prosum += CourseList.getGenerallist().get(g).getWorth();

        }
        for (String p : StudentData.userprocourselist.get(StudentData.currentuser.getstudentnumber()).keySet()) {
            sum += CourseList.getProperlist().get(p).getWorth();
        }
        boolean run = false;
        boolean isoverlapday = false;
        try {
            for (GeneralCourse course:StudentData.usergencourselist.get(StudentData.currentuser.getstudentnumber()).values()){
                for (String day1:course.getday().split("-")){
                    for (String day2:CourseList.getGenerallist().get(coursecode).getday().split("-")){
                        if (day1.equals(day2)){
                            isoverlapday=true;
                            run = true;
                            break;
                        }
                    }
                    if (run){break;}
                }
                if (run){break;}
            }

        }catch (Exception e){
            for (ProperCourse course:StudentData.userprocourselist.get(StudentData.currentuser.getstudentnumber()).values()){
                for (String day1:course.getday().split("-")){
                    for (String day2:CourseList.getProperlist().get(coursecode).getday().split("-")){
                        if (day1.equals(day2)){
                            isoverlapday=true;
                            run = true;
                            break;
                        }
                    }
                    if (run){break;}
                }
                if (run){break;}
            }
        }
        isoverlap=false;
        try {
            if (isoverlapday){
                for (GeneralCourse course:StudentData.usergencourselist.get(StudentData.currentuser.getstudentnumber()).values()){
                    int coursestart = Integer.parseInt(course.getHour().split("-")[0].split(":")[0]);
                    int courseend = Integer.parseInt(course.getHour().split("-")[1].split(":")[1]);
                    int coursestartmin = Integer.parseInt(course.getHour().split("-")[0].split(":")[1]);
                    int courseendmin = Integer.parseInt(course.getHour().split("-")[1].split(":")[1]);
                    int newcoursestart = Integer.parseInt(CourseList.getGenerallist().get(coursecode).getHour().split("-")[0].split(":")[0]);
                    int newcoursestartmin = Integer.parseInt(CourseList.getGenerallist().get(coursecode).getHour().split("-")[0].split(":")[1]);
                    int newcourseend = Integer.parseInt(CourseList.getGenerallist().get(coursecode).getHour().split("-")[1].split(":")[0]);
                    int newcourseendmin = Integer.parseInt(CourseList.getGenerallist().get(coursecode).getHour().split("-")[1].split(":")[1]);
                    if (coursestart < newcoursestart && newcoursestart< courseend){
                        isoverlap=true;
                    } else if (coursestart==newcoursestart && newcoursestartmin>coursestartmin ) {
                        isoverlap=true;
                    } else if (newcoursestart==courseend && newcoursestartmin<courseendmin ) {
                        isoverlap=true;
                    } else if (coursestart < newcourseend && newcoursestart< courseend){
                        isoverlap=true;
                    } else if (coursestart==newcourseend && newcourseendmin>coursestartmin ) {
                        isoverlap=true;
                    } else if (newcourseend==courseend && newcourseendmin<courseendmin ) {
                        isoverlap=true;
                    } else if (newcoursestart==coursestart && newcoursestartmin==coursestartmin) {
                        isoverlap=true;
                    } else if (newcourseend==courseend && courseendmin==newcourseendmin) {
                        isoverlap=true;
                    }
                }
            }

        }catch (Exception e){
            if (isoverlapday){
                for (ProperCourse course:StudentData.userprocourselist.get(StudentData.currentuser.getstudentnumber()).values()){
                    int coursestart = Integer.parseInt(course.getHour().split("-")[0].split(":")[0]);
                    int courseend = Integer.parseInt(course.getHour().split("-")[1].split(":")[1]);
                    int coursestartmin = Integer.parseInt(course.getHour().split("-")[0].split(":")[1]);
                    int courseendmin = Integer.parseInt(course.getHour().split("-")[1].split(":")[1]);
                    int newcoursestart = Integer.parseInt(CourseList.getGenerallist().get(coursecode).getHour().split("-")[0].split(":")[0]);
                    int newcoursestartmin = Integer.parseInt(CourseList.getGenerallist().get(coursecode).getHour().split("-")[0].split(":")[1]);
                    int newcourseend = Integer.parseInt(CourseList.getGenerallist().get(coursecode).getHour().split("-")[1].split(":")[0]);
                    int newcourseendmin = Integer.parseInt(CourseList.getGenerallist().get(coursecode).getHour().split("-")[1].split(":")[1]);
                    if (coursestart < newcoursestart && newcoursestart< courseend){
                        isoverlap=true;
                    } else if (coursestart==newcoursestart && newcoursestartmin>coursestartmin ) {
                        isoverlap=true;
                    } else if (newcoursestart==courseend && newcoursestartmin<courseendmin ) {
                        isoverlap=true;
                    } else if (coursestart < newcourseend && newcoursestart< courseend){
                        isoverlap=true;
                    } else if (coursestart==newcourseend && newcourseendmin>coursestartmin ) {
                        isoverlap=true;
                    } else if (newcourseend==courseend && newcourseendmin<courseendmin ) {
                        isoverlap=true;
                    } else if (newcoursestart==coursestart && newcoursestartmin==coursestartmin) {
                        isoverlap=true;
                    } else if (newcourseend==courseend && courseendmin==newcourseendmin) {
                        isoverlap=true;
                    }
                }
            }

        }
    }
}
