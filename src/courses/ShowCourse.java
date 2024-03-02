package courses;
public abstract class ShowCourse {
    public void showMath() {
        CourseList CourseList1 = new CourseList();
        for (generalcourse course: CourseList1.getGenerallist()) {
            if (course.getDepartment().equals("Mathematics")){
                System.out.println("Course Code: "+course.getCode()+"*Unit worth: "+course.getWorth()+"*Course: "+course.getName()+"*Capacity: "+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+" "+course.getHour()+"Type: General"+"\n");
            }
        }
        for (propercourse course: CourseList1.getProperlist()
        ) {
            if (course.getDepartment().equals("Mathematics")){
                System.out.println("Course Code:"+course.getCode()+" *Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+" "+course.getHour()+"*Type: Not General"+"\n");
            }
        }
    }
    public void showCE() {
        CourseList C = new CourseList();
        for (generalcourse course: C.getGenerallist()) {
            if (course.getDepartment().equals("Computer engineering")){
                System.out.println("Course Code: "+course.getCode()+"*Unit worth: "+course.getWorth()+"*Course: "+course.getName()+"*Capacity: "+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+" "+course.getHour()+"Type: General"+"\n");
            }
        }
        for (propercourse course: C.getProperlist()
        ) {
            if (course.getDepartment().equals("Computer engineering")){
                System.out.println("Course Code:"+course.getCode()+" *Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+" "+course.getHour()+"*Type: Not General"+"\n");
            }
        }
    }
    public void showLang() {
        CourseList L = new CourseList();
        for (generalcourse course: L.getGenerallist()) {
            if (course.getDepartment().equals("Language Center")){
                System.out.println("Course Code: "+course.getCode()+"*Unit worth: "+course.getWorth()+"*Course: "+course.getName()+"*Capacity: "+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+" "+course.getHour()+"Type: General"+"\n");
            }
        }
        for (propercourse course: L.getProperlist()
        ) {
            if (course.getDepartment().equals("Language Center")){
                System.out.println("Course Code:"+course.getCode()+" *Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+" "+course.getHour()+"*Type: Not General"+"\n");
            }
        }
    }
    public void showPhysic() {
        CourseList P = new CourseList();
        for (generalcourse course: P.getGenerallist()) {
            if (course.getDepartment().equals("Physics")){
                System.out.println("Course Code: "+course.getCode()+"*Unit worth: "+course.getWorth()+"*Course: "+course.getName()+"*Capacity: "+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+" "+course.getHour()+"Type: General"+"\n");
            }
        }
        for (propercourse course: P.getProperlist()
        ) {
            if (course.getDepartment().equals("Physics")){
                System.out.println("Course Code:"+course.getCode()+" *Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+" "+course.getHour()+"*Type: Not General"+"\n");
            }
        }
    }
}
