package courses;

public class ShowAdmin extends ShowCourse {
    @Override
    public void showCE() {
            super.showCE();
            CourseEdit edit = new CourseEdit();
            }
    @Override
    public void showMath() {
        super.showMath();
        CourseEdit edit = new CourseEdit();

    }
    @Override
    public void showLang() {
        super.showLang();
        CourseEdit edit = new CourseEdit();

    }
    @Override
    public void showPhysic() {
        super.showPhysic();
        CourseEdit edit = new CourseEdit();

    }

}

