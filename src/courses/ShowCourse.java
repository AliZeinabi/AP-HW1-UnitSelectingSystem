package courses;
public abstract class ShowCourse {
    public void showMath() {
        for (generalcourse course: CourseList.getGenerallist().values()) {
            if (course.getDepartment().equals("Mathematics")){
                System.out.println("Course Code:"+course.getCode()+"*Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+">"+course.getHour()+"*Type:general"+"\n");
            }
        }
        for (propercourse course: CourseList.getProperlist().values()) {
            if (course.getDepartment().equals("Mathematics")){
                System.out.println("Course Code:"+course.getCode()+"*Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+">"+course.getHour()+"*Type:Notgeneral"+"\n");
            }
        }
    }
    public void showCE() {
        for (generalcourse course: CourseList.getGenerallist().values()) {
            if (course.getDepartment().equals("Computer engineering")){
                System.out.println("Course Code:"+course.getCode()+"*Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+">"+course.getHour()+"Type:General");
            }
        }
        for (propercourse course: CourseList.getProperlist().values()) {
            if (course.getDepartment().equals("Computer engineering")){
                System.out.println("Course Code:"+course.getCode()+"*Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+">"+course.getHour()+"*Type:Notgeneral");
            }
        }
    }
    public void showLang() {
        for (generalcourse course: CourseList.getGenerallist().values()) {
            if (course.getDepartment().equals("Language Center")){
                System.out.println("Course Code:"+course.getCode()+"*Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule: "+course.getday()+">"+course.getHour()+"Type:general");
            }
        }
        for (propercourse course: CourseList.getProperlist().values()) {
            if (course.getDepartment().equals("Language Center")){
                System.out.println("Course Code:"+course.getCode()+" *Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+">"+course.getHour()+"*Type:Notgeneral");
            }
        }
    }
    public void showPhysic() {
        for (generalcourse course: CourseList.getGenerallist().values()) {
            if (course.getDepartment().equals("Physics")){
                System.out.println("Course Code: "+course.getCode()+"*Unit worth: "+course.getWorth()+"*Course: "+course.getName()+"*Capacity: "+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+" "+course.getHour()+"Type:general");
            }
        }
        for (propercourse course: CourseList.getProperlist().values()) {
            if (course.getDepartment().equals("Physics")){
                System.out.println("Course Code:"+course.getCode()+"*Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam:"+course.getExamdate()+"*weekly Schedule:"+course.getday()+">"+course.getHour()+"*Type:Notgeneral");
            }
        }
    }
}
