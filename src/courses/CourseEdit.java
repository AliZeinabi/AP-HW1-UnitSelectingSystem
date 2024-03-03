package courses;

import java.util.Scanner;
import Admin.ShowCourseToAdmin ;
public class CourseEdit {
    CourseList list = new CourseList();
    public void action() {
        while (true) {
            System.out.println("\n1-add a new course:\n2-see more details of each course:\n0-back");
            Scanner input = new Scanner(System.in);
            String choose = input.nextLine();
            if (Integer.parseInt(choose) == 1) {
                add();
                break;
            } else if (Integer.parseInt(choose) == 0) {
                ShowCourseToAdmin back = new ShowCourseToAdmin();
                back.Show();
                break;
            } else if (Integer.parseInt(choose)==2) {
                detail();
                break;
            } else{
                    System.out.println("your input is invalid!");
                }
            }
        }
        public void add () {
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
            System.out.println("class days(separate days by '-' sign):");
            String day = info.nextLine();
            System.out.println("class hour(time format must be HH:MM):");
            String time = info.nextLine();
            System.out.println("enter exam date(format=YYYY/MM/DD-HH:MM):");
            String exam = info.nextLine();
        }
        public void detail () {
            boolean check = false;
            while (!check) {
                System.out.println("enter course code:");
                Scanner input = new Scanner(System.in);
                String code = input.nextLine();
                for (generalcourse x : list.getGenerallist()) {
                    if (Integer.parseInt(code)==x.getCode()) {
                        System.out.println(":)");
                        check = true;
                        break;
                    } else {
                        System.out.println("there is no such a course with this code !");
                    }
                }
                for (propercourse x : list.getProperlist()) {
                    if (Integer.parseInt(code) == x.getCode()) {
                        System.out.println(":)");
                        check = true ;
                        break;
                    } else {
                        System.out.println("there is no such a course with this code!");
                    }
                }
            }
        }
}
