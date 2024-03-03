package courses;
import Student.Student;
public class ShowStu extends ShowCourse{
    Student stu = new Student();
    @Override
    public void showCE() {
        super.showCE();
        System.out.println("Enter CourseCode to add to your courses:");
        stu.option();
    }

    @Override
    public void showLang() {
        super.showLang();
        System.out.println("Enter CourseCode to add to your courses:");
        stu.option();
    }

    @Override
    public void showMath() {
        super.showMath();
        System.out.println("Enter CourseCode to add to your courses:");
        stu.option();
    }

    @Override
    public void showPhysic() {
        super.showPhysic();
        System.out.println("Enter CourseCode to add to your courses:");
        stu.option();
    }
}
