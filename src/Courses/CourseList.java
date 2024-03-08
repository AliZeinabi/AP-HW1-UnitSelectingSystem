package Courses;
import java.util.HashMap;

public class CourseList {
    private static HashMap<String, GeneralCourse> generallist = new HashMap<>();
    private static HashMap<String, ProperCourse> properlist = new HashMap<>();
    public static HashMap<String,Course> list = new HashMap<>();


    // initialize list
//    {
////        list.add(new propercourse(22815, 120, 4, "Advanced Programming", "Hossein Boomari", "Saturday-Monday", "13:00-15:00", "Mathematics"));
////        list.add(new generalcourse(22015, 260, 4, "General Mathematics I", "Mohsen Jamali", "Saturday-Monday", "13:00-15:00", "Mathematics"));
////        list.add(new generalcourse(22016, 80, 4, "General Mathematics II", "Mohsen Jamali", "Saturday-Monday", "10:30-12:30", "Mathematics"));
////        list.add(new propercourse(40424, 50, 3, "Operating System", "Rasool Jalili", "Sunday-Tuesday", "15:00-16:30", "Computer engineering"));
////        list.add(new propercourse(40419, 60, 3, "Web Programming", "Yahya Poorsoltani", "Saturday-Monday", "13:30-15:00", "Computer engineering"));
////        list.add(new generalcourse(40153, 70, 3, "Fundamentals of Programming", "Mohsen Kazemi", "Saturday-Monday", "13:30-15:00", "Computer engineering"));
////        list.add(new generalcourse(31119, 55, 3, "Introduction To Persian Literature", "Maryam Seyyedan", "Sunday-Tuesday", "10:30-12:00", "Language Center"));
////        list.add(new generalcourse(31123, 25, 3, "Foreign Language", "Ali Jahangard", "Sunday-Tuesday", "15:00-16:30", "Language Center"));
////        list.add(new generalcourse(31109, 25, 3, "Introductory Spanish", "Homa Atashi", "Sunday-Tuesday", "15:00-16:30", "Language Center"));
////        list.add(new generalcourse(24011, 11, 3, "Physics I", "Abdollah Langari", "Saturday-Monday", "07:30-09:00", "Physics"));
////        list.add(new propercourse(24213, 0, 3, "ElectroMagnetics I", "Mariam Mirkamali", "Saturday-Monday", "10:30-12:00", "Physics"));
////        list.add(new propercourse(24313, 1, 3, "Quantum Mechanics II", "Laleh Memarzadeh", "Sunday-Tuesday", "09:00-10:30", "Physics"));
//
//        generallist.put("31119",new generalcourse("31119", 55, 3, "Introduction To Persian Literature", "Maryam Seyyedan", "Sunday-Tuesday", "10:30-12:00", "Language Center"));
//        generallist.put("31123",new generalcourse("31123", 25, 3, "Foreign Language", "Ali Jahangard", "Sunday-Tuesday", "15:00-16:30", "Language Center"));
//        generallist.put("31109",new generalcourse("31109", 25, 3, "Introductory Spanish", "Homa Atashi", "Sunday-Tuesday", "15:00-16:30", "Language Center"));
//        generallist.put("24011",new generalcourse("24011", 11, 3, "Physics I", "Abdollah Langari", "Saturday-Monday", "07:30-09:00", "Physics"));
//        generallist.put("22015",new generalcourse("22015", 260, 4, "General Mathematics I", "Mohsen Jamali", "Saturday-Monday", "13:00-15:00", "Mathematics"));
//        generallist.put("40153",new generalcourse("40153", 70, 3, "Fundamentals of Programming", "Mohsen Kazemi", "Saturday-Monday", "13:30-15:00", "Computer engineering"));
//        generallist.put("22016",new generalcourse("22016", 80, 4, "General Mathematics II", "Mohsen Jamali", "Saturday-Monday", "10:30-12:30", "Mathematics"));
//        properlist.put("22815",new propercourse("22815", 120, 4, "Advanced Programming", "Hossein Boomari", "Saturday-Monday", "13:00-15:00", "Mathematics"));
//        properlist.put("40424",new propercourse("40424", 50, 3, "Operating System", "Rasool Jalili", "Sunday-Tuesday", "15:00-16:30", "Computer engineering"));
//        properlist.put("40419",new propercourse("40419", 60, 3, "Web Programming", "Yahya Poorsoltani", "Saturday-Monday", "13:30-15:00", "Computer engineering"));
//        properlist.put("24213",new propercourse("24213", 0, 3, "ElectroMagnetics I", "Mariam Mirkamali", "Saturday-Monday", "10:30-12:00", "Physics"));
//        properlist.put("24313",new propercourse("24313", 1, 3, "Quantum Mechanics II", "Laleh Memarzadeh", "Sunday-Tuesday", "09:00-10:30", "Physics"));
//
//    }

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
    //show course list to student
//    public void showMath() {
//        for (generalcourse course:generallist) {
//            if (course.getDepartment().equals("Mathematics")){
//                System.out.println("Course Code: "+course.getCode()+"*Unit worth: "+course.getWorth()+"*Course: "+course.getName()+"*Capacity: "+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+" "+course.getHour()+"Type: General"+"\n");
//            }
//        }
//        for (propercourse course:properlist
//             ) {
//            if (course.getDepartment().equals("Mathematics")){
//                System.out.println("Course Code:"+course.getCode()+" *Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+" "+course.getHour()+"*Type: Not General"+"\n");
//            }
//        }
//    }
//    public void showCE() {
//        for (generalcourse course:generallist) {
//            if (course.getDepartment().equals("Computer engineering")){
//                System.out.println("Course Code: "+course.getCode()+"*Unit worth: "+course.getWorth()+"*Course: "+course.getName()+"*Capacity: "+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+" "+course.getHour()+"Type: General"+"\n");
//            }
//        }
//        for (propercourse course:properlist
//        ) {
//            if (course.getDepartment().equals("Computer engineering")){
//                System.out.println("Course Code:"+course.getCode()+" *Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+" "+course.getHour()+"*Type: Not General"+"\n");
//            }
//        }
//    }
//    public void showLang() {
//        for (generalcourse course:generallist) {
//            if (course.getDepartment().equals("Language Center")){
//                System.out.println("Course Code: "+course.getCode()+"*Unit worth: "+course.getWorth()+"*Course: "+course.getName()+"*Capacity: "+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+" "+course.getHour()+"Type: General"+"\n");
//            }
//        }
//        for (propercourse course:properlist
//        ) {
//            if (course.getDepartment().equals("Language Center")){
//                System.out.println("Course Code:"+course.getCode()+" *Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+" "+course.getHour()+"*Type: Not General"+"\n");
//            }
//        }
//    }
//    public void showPhysic() {
//        for (generalcourse course:generallist) {
//            if (course.getDepartment().equals("Physics")){
//                System.out.println("Course Code: "+course.getCode()+"*Unit worth: "+course.getWorth()+"*Course: "+course.getName()+"*Capacity: "+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+" "+course.getHour()+"Type: General"+"\n");
//            }
//        }
//        for (propercourse course:properlist
//        ) {
//            if (course.getDepartment().equals("Physics")){
//                System.out.println("Course Code:"+course.getCode()+" *Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+" "+course.getHour()+"*Type: Not General"+"\n");
//            }
//        }
//    }
}
