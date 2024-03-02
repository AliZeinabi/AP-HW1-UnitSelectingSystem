package Admin;
import java.util.Scanner;
import courses.CourseList;
public class ShowCourseToAdmin {
    public void Show() {
        while (true) {
            System.out.println("You have Entered!\n what Department?\n1-Mathematics\n2-Physics\n3-Computer Engineering\n4-Language Center\n5-Back");
            Scanner Depin = new Scanner(System.in);
            String Dep = Depin.nextLine();
            if (Dep.equals("1")) {
                CourseList math = new CourseList();
                math.showMath();
                break;
            } else if (Dep.equals("2")) {
                CourseList ph = new CourseList();
                ph.showPhysic();
                break;
            } else if (Dep.equals("3")) {
                CourseList CE = new CourseList();
                CE.showCE();
                break;
            } else if (Dep.equals("4")) {
                CourseList lang = new CourseList();
                lang.showLang();
                break;
            } else {
                System.out.println("You ");
            }
        }
    }
}
