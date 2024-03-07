package Admin;
import java.util.Scanner;

public class Admincli {
    public void Admincli(){
        while (true){
            System.out.println("Enter Your UserName:");
            Scanner UserEnterd = new Scanner(System.in);
            String user = UserEnterd.nextLine();
            if (user.equals("Admin")){
                while (true) {
                    System.out.println("Enter Your Password:");
                    Scanner PassEntered = new Scanner(System.in);
                    String pass = PassEntered.nextLine();
                    if (pass.equals("Admin")) {
                        ShowCourseToAdmin Show = new ShowCourseToAdmin();
                        Show.Show();
                        break;
                    } else {
                        System.out.println("Your Password is invalid!");
                    }
                }
                break;
                }else {
                    System.out.println("Your UserName is invalid!");
            }
        }
    }
}
