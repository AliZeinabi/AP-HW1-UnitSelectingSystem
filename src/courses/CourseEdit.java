package courses;

import java.util.Scanner;
import Admin.ShowCourseToAdmin ;
public class CourseEdit {
    CourseList list = new CourseList();
    StudentData students = new StudentData();

    public void action() {
        while (true) {
            System.out.println("\n1-add a new course:\n2-see course students:\n0-back");
            Scanner input = new Scanner(System.in);
            String choose = input.nextLine();
            if (Integer.parseInt(choose) == 1) {
                add();
                break;
            } else if (Integer.parseInt(choose) == 0) {
                ShowCourseToAdmin back = new ShowCourseToAdmin();
                back.Show();
                break;
            } else if (Integer.parseInt(choose) == 2) {
                detail();
                break;
            } else {
                System.out.println("your input is invalid!");
            }
        }
    }

    public void add() {
        Scanner info = new Scanner(System.in);
        System.out.println("enter course identity:\n1-general\n2-proper");
        String gen = info.nextLine();
        System.out.println("course name:");
        String name = info.nextLine();
        System.out.println("course code :");
        int code = info.nextInt();
        System.out.println("instructor's name:");
        String ins = info.nextLine();
        System.out.println("capacity:");
        int cap = info.nextInt();
        System.out.println("unit worth:");
        int unit = info.nextInt();
        System.out.println("class days(format: Day-Day):");
        String day = info.nextLine();
        System.out.println("class hour(time format must be HH:MM):");
        String time = info.nextLine();
        System.out.println("enter exam date(format=YYYY/MM/DD-HH:MM):");
        String exam = info.nextLine();
    }

    public void detail() {
        System.out.println("enter course code to see students who got the course\nenter 0 to back");
        Scanner codein = new Scanner(System.in);
        String code = codein.nextLine();
        for (int sn : StudentData.usergencourselist.keySet()) {
            for (String cc : StudentData.usergencourselist.get(sn).keySet()) {
                if (cc.equals(code)) {
                    System.out.println(sn);
                }
            }
        }
        for (int sn : StudentData.userprocourselist.keySet()) {
            for (String cc : StudentData.userprocourselist.get(sn).keySet()) {
                if (cc.equals(code)) {
                    System.out.println(sn);
                    //continue to remove course from student course list
                } else if (code.equals("0")) {
                    action();
                }
            }
        }
    }
}