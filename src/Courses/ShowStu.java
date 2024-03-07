package Courses;

public class ShowStu extends ShowCourse{
    StudentData stu = new StudentData();
    @Override
    public void showCE() {
        super.showCE();
        stu.add();
    }

    @Override
    public void showLang() {
        super.showLang();
        stu.add();
    }

    @Override
    public void showMath() {
        super.showMath();
        stu.add();
    }
    @Override
    public void showPhysic() {
        super.showPhysic();
        stu.add();
    }
}
