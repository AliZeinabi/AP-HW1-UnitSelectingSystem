package courses;
import
public abstract class ShowCourse {
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
