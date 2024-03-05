package courses;
public abstract class ShowCourse {
    public void showMath() {
        CourseList CourseList1 = new CourseList();
        for (generalcourse course: CourseList1.getGenerallist().values()) {
            if (course.getDepartment().equals("Mathematics")){
                System.out.println("Course Code:"+course.getCode()+"*Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+">"+course.getHour()+"*Type:general"+"\n");
            }
        }
        for (propercourse course: CourseList1.getProperlist().values()) {
            if (course.getDepartment().equals("Mathematics")){
                System.out.println("Course Code:"+course.getCode()+"*Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+">"+course.getHour()+"*Type:Notgeneral"+"\n");
            }
        }
    }
    public void showCE() {
        CourseList C = new CourseList();
        for (generalcourse course: C.getGenerallist().values()) {
            if (course.getDepartment().equals("Computer engineering")){
                System.out.println("Course Code:"+course.getCode()+"*Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+">"+course.getHour()+"Type:General");
            }
        }
        for (propercourse course: C.getProperlist().values()) {
            if (course.getDepartment().equals("Computer engineering")){
                System.out.println("Course Code:"+course.getCode()+"*Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+">"+course.getHour()+"*Type:Notgeneral");
            }
        }
    }
    public void showLang() {
        CourseList L = new CourseList();
        for (generalcourse course: L.getGenerallist().values()) {
            if (course.getDepartment().equals("Language Center")){
                System.out.println("Course Code:"+course.getCode()+"*Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule: "+course.getday()+">"+course.getHour()+"Type:general");
            }
        }
        for (propercourse course: L.getProperlist().values()) {
            if (course.getDepartment().equals("Language Center")){
                System.out.println("Course Code:"+course.getCode()+" *Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+">"+course.getHour()+"*Type:Notgeneral");
            }
        }
    }
    public void showPhysic() {
        CourseList P = new CourseList();
        for (generalcourse course: P.getGenerallist().values()) {
            if (course.getDepartment().equals("Physics")){
                System.out.println("Course Code: "+course.getCode()+"*Unit worth: "+course.getWorth()+"*Course: "+course.getName()+"*Capacity: "+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+" "+course.getHour()+"Type:general");
            }
        }
        for (propercourse course: P.getProperlist().values()) {
            if (course.getDepartment().equals("Physics")){
                System.out.println("Course Code:"+course.getCode()+"*Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+">"+course.getHour()+"*Type:Notgeneral");
            }
        }
    }
}
