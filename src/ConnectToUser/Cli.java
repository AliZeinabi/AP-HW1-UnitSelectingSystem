package ConnectToUser;// this class is made for implementation all methods and information of start window!
import Student.IDList;
import Student.Studentcli;
import Admin.Admincli;
import java.util.Scanner ;
public class Cli {
    private Scanner input ;

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
    public static void start(){
        String role = "0" ;
        while (role.equals("0")) {
            System.out.println("this is unit selecting system!\nenter system as:\n1-Student\n2-Administrator\n3-sign up ");
            Scanner input = new Scanner(System.in);
            role = input.nextLine();
            if (role.equals("1")) {
                Studentcli studentcli = new Studentcli();
                studentcli.Studentcli();
            } else if (role.equals("2")) {
                Admincli Admincli = new Admincli();
                Admincli.Admincli();
            } else if (role.equals("3")) {
                //add a new student to students list !
                // make the studentadder method as soon as possible !!
                IDList idlist = new IDList();
                idlist.addID();
            } else {
                role = "0" ;
            }
        }
    }
}
