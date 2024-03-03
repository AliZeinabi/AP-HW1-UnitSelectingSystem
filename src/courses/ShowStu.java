package courses;

public class ShowStu extends ShowCourse{
    StudentData stu = new StudentData();
    @Override
    public void showCE() {
        super.showCE();
        System.out.println("Enter 0 to back to previous page\nEnter CourseCode to add to your courses:");
        stu.add();
    }

    @Override
    public void showLang() {
        super.showLang();
        System.out.println("Enter 0 to back to previous page\nEnter CourseCode to add to your courses:");
        stu.add();
    }

    @Override
    public void showMath() {
        super.showMath();
        System.out.println("Enter 0 to back to previous page\nEnter CourseCode to add to your courses:");
        stu.add();
    }
    @Override
    public void showPhysic() {
        super.showPhysic();
        System.out.println("Enter 0 to back to previous page\nEnter CourseCode to add to your courses:");
        stu.add();
    }
}
