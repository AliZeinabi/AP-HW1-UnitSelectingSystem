// this class is made for implementation all methods and information of start window!
import Student.Studentcli;
import Admin.Admincli;
import java.util.Scanner ;
public class cli {
    private Scanner input ;

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
    public void start(){
        int role = 0 ;
        while (role == 0) {
            System.out.println("this is unit system!\nenter system as:\n1-Student\n2-Administrator\n3-sign up ");
            role = input.nextInt();
            if (role == 1) {
                Studentcli Studentcli = new Studentcli();
            } else if (role == 2) {
                Admincli Admincli = new Admincli();
            } else if (role == 3) {
                //add a new student to students list !
                // make the studentadder method as soon as possible !!
            } else {
                role = 0 ;
            }
        }
    }
}
