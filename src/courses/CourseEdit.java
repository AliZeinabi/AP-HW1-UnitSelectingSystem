package courses;

import java.util.Scanner;
import Admin.ShowCourseToAdmin ;
public class CourseEdit {
    CourseList list = new CourseList();
    public void action(){
        while (true){
            System.out.println("\n1-add a new course:\npress course code to see more details:\n0-back");
            Scanner input = new Scanner(System.in);
            String choose = input.nextLine();
            if(choose.equals("1")){
                add();
                break;
            } else if (choose.equals("0")) {
                ShowCourseToAdmin back = new ShowCourseToAdmin();
                back.Show();
                break;
            } else {
                for (generalcourse x:list.getGenerallist()) {
                    if(x.getCode()== Integer.parseInt(choose)){
                        detail();
                        break;
                    }else {
                        System.out.println("your input is invalid !");
                    }
                }
            }
        }
    }
    public void add(){}
    public void detail(){}
}
