package courses;
import Admin.CourseEdit;
import java.util.Scanner;

public class ShowAdmin extends ShowCourse {
    @Override
    public void showCE() {
            super.showCE();
            System.out.println("\nPress 1 to add a new course:\npress course code to see more details:\n0-back");
            CourseEdit edit = new CourseEdit();
            }
    @Override
    public void showMath() {
        super.showMath();
        System.out.println("\nPress 1 to add a new course:\npress course code to see more details:\n0-back");
    }
    @Override
    public void showLang() {
        super.showLang();
        System.out.println("\nPress 1 to add a new course:\npress course code to see more details:\n0-back");
    }
    @Override
    public void showPhysic() {
        super.showPhysic();
        System.out.println("\nPress 1 to add a new course:\npress course code to see more details:\n0-back");
    }

}

