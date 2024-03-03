package Student;
import ConnectToUser.cli;
import java.util.Scanner;
import courses.StudentData;
public class Studentcli{
    IDList idlistforcheck = new IDList();
    StudentData defineuser = new StudentData();
    public void Studentcli() {
        boolean idchecker = false;
        while (!idchecker) {
            System.out.println("Enter Your Student Number:\n");
            Scanner SNEntered = new Scanner(System.in);
            int SNforCheck = SNEntered.nextInt();
            for (Id id : idlistforcheck.getIdlist()) {
                if (id.getstudentnumber() == SNforCheck) {
                    idchecker = true ;
                    boolean passchecker = false;
                    while (!passchecker){
                        System.out.println("Enter Your Password:\n");
                        Scanner PEntered = new Scanner(System.in);
                        String PforCheck = PEntered.nextLine();
                        for (Id idp : idlistforcheck.getIdlist()) {
                            if (id.getPassword().equals(PforCheck)) {
                                System.out.println("you have entered !");
                                defineuser
                                passchecker = true ;
                                break;
                            } else {
                                System.out.println("the password you have entered is invalid!\n");
                            }
                        }
                    }
                }

            }
            if (!idchecker)
                System.out.println("the student number you hve entered is invalid!\n");
        }
        System.out.println("what do you want to do now?\n1-show list of courses\n2-show list of your courses\n3-back");
        while (true){
            Scanner input = new Scanner(System.in);
            String command = input.nextLine();
            if (command.equals("1")){
                System.out.println("choose Department:\n1-Mathematics\n2-Physics\n3-Language Center\n4-Computer Engineering");
                break;
            } else if (command.equals("3")) {
                cli back = new cli();
                cli.start();
                break;
            } else {
                System.out.println("Your input is invalid!\nchoose Department:\n1-Mathematics\n2-Physics\n3-Language Center\n4-Computer Engineering");
            }
            

        }
    }
}