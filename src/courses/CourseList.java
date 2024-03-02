package courses;
import java.util.LinkedList;
public class CourseList {
    private static LinkedList<generalcourse> generallist = new LinkedList<generalcourse>();
    private static LinkedList<propercourse> properlist = new LinkedList<propercourse>();


    // initialize lists
    {
        properlist.add(new propercourse(22815, 120, 4, "Advanced Programming", "Hossein Boomari", "Saturday-Monday", "13:00-15:00", "Mathematics"));
        generallist.add(new generalcourse(22015, 260, 4, "General Mathematics I", "Mohsen Jamali", "Saturday-Monday", "13:00-15:00", "Mathematics"));
        generallist.add(new generalcourse(22016, 80, 4, "General Mathematics II", "Mohsen Jamali", "Saturday-Monday", "10:30-12:30", "Mathematics"));
        properlist.add(new propercourse(40424, 50, 3, "Operating System", "Rasool Jalili", "Sunday-Tuesday", "15:00-16:30", "Computer engineering"));
        properlist.add(new propercourse(40419, 60, 3, "Web Programming", "Yahya Poorsoltani", "Saturday-Monday", "13:30-15:00", "Computer engineering"));
        generallist.add(new generalcourse(40153, 70, 3, "Fundamentals of Programming", "Mohsen Kazemi", "Saturday-Monday", "13:30-15:00", "Computer engineering"));
        generallist.add(new generalcourse(31119, 55, 3, "Introduction To Persian Literature", "Maryam Seyyedan", "Sunday-Tuesday", "10:30-12:00", "Language Center"));
        generallist.add(new generalcourse(31123, 25, 3, "Foreign Language", "Ali Jahangard", "Sunday-Tuesday", "15:00-16:30", "Language Center"));
        generallist.add(new generalcourse(31109, 25, 3, "Introductory Spanish", "Homa Atashi", "Sunday-Tuesday", "15:00-16:30", "Language Center"));
        generallist.add(new generalcourse(24011, 11, 3, "Physics I", "Abdollah Langari", "Saturday-Monday", "07:30-09:00", "Physics"));
        properlist.add(new propercourse(24213, 0, 3, "ElectroMagnetics I", "Mariam Mirkamali", "Saturday-Monday", "10:30-12:00", "Physics"));
        properlist.add(new propercourse(24313, 1, 3, "Quantum Mechanics II", "Laleh Memarzadeh", "Sunday-Tuesday", "09:00-10:30", "Physics"));
    }


    //get & set course list
    public LinkedList<generalcourse> getGenerallist() {
        return generallist;
    }
    public void setGenerallist(LinkedList<generalcourse> generallist) {
        this.generallist = generallist;
    }

    public LinkedList<propercourse> getProperlist() {
        return properlist;
    }

    public void setProperlist(LinkedList<propercourse> properlist) {
        this.properlist = properlist;
    }


    //show course list to student
    public void showMath() {
        for (generalcourse course:generallist) {
            if (course.getDepartment().equals("Mathematics")){
                System.out.println("Course Code: "+course.getCode()+"*Unit worth: "+course.getWorth()+"*Course: "+course.getName()+"*Capacity: "+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+" "+course.getHour()+"Type: General"+"\n");
            }
        }
        for (propercourse course:properlist
             ) {
            if (course.getDepartment().equals("Mathematics")){
                System.out.println("Course Code:"+course.getCode()+" *Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+" "+course.getHour()+"*Type: Not General"+"\n");
            }
        }
    }
    public void showCE() {
        for (generalcourse course:generallist) {
            if (course.getDepartment().equals("Computer engineering")){
                System.out.println("Course Code: "+course.getCode()+"*Unit worth: "+course.getWorth()+"*Course: "+course.getName()+"*Capacity: "+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+" "+course.getHour()+"Type: General"+"\n");
            }
        }
        for (propercourse course:properlist
        ) {
            if (course.getDepartment().equals("Computer engineering")){
                System.out.println("Course Code:"+course.getCode()+" *Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+" "+course.getHour()+"*Type: Not General"+"\n");
            }
        }
    }
    public void showLang() {
        for (generalcourse course:generallist) {
            if (course.getDepartment().equals("Language Center")){
                System.out.println("Course Code: "+course.getCode()+"*Unit worth: "+course.getWorth()+"*Course: "+course.getName()+"*Capacity: "+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+" "+course.getHour()+"Type: General"+"\n");
            }
        }
        for (propercourse course:properlist
        ) {
            if (course.getDepartment().equals("Language Center")){
                System.out.println("Course Code:"+course.getCode()+" *Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+" "+course.getHour()+"*Type: Not General"+"\n");
            }
        }
    }
    public void showPhysic() {
        for (generalcourse course:generallist) {
            if (course.getDepartment().equals("Physics")){
                System.out.println("Course Code: "+course.getCode()+"*Unit worth: "+course.getWorth()+"*Course: "+course.getName()+"*Capacity: "+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+" "+course.getHour()+"Type: General"+"\n");
            }
        }
        for (propercourse course:properlist
        ) {
            if (course.getDepartment().equals("Physics")){
                System.out.println("Course Code:"+course.getCode()+" *Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+" "+course.getHour()+"*Type: Not General"+"\n");
            }
        }
    }
}
