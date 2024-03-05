package Admin;
import java.util.Scanner;

import ConnectToUser.cli;
import courses.CourseList;
import courses.ShowAdmin;
public class ShowCourseToAdmin {
    public void Show() {
        while (true) {
            System.out.println("You have Entered!\n what Department?\n1-Mathematics\n2-Physics\n3-Computer Engineering\n4-Language Center\n0-Back");
            Scanner Depin = new Scanner(System.in);
            String Dep = Depin.nextLine();
            if (Dep.equals("1")) {
                ShowAdmin math = new ShowAdmin();
                math.showMath();
                break;
            } else if (Dep.equals("2")) {
                ShowAdmin ph = new ShowAdmin();
                ph.showPhysic();
                break;
            } else if (Dep.equals("3")) {
                ShowAdmin CE = new ShowAdmin();
                CE.showCE();
                break;
            } else if (Dep.equals("4")) {
                ShowAdmin lang = new ShowAdmin();
                lang.showLang();
                break;
            } else if (Dep.equals("0")) {
                ConnectToUser.cli.start();
            } else {
                System.out.println("You have entered unknown input!\n");
            }
        }

    }
}
