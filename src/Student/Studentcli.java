package Student;
import ConnectToUser.cli;
import java.util.Scanner;
import courses.StudentData;
import courses.ShowStu;
public class Studentcli{
    IDList idlistforcheck = new IDList();
    StudentData defineuser = new StudentData();
    ShowStu showstu = new ShowStu();
    public void Studentcli() {
        boolean idchecker = false;
        while (!idchecker) {
            System.out.println("Enter Your Student Number:");
            Scanner SNEntered = new Scanner(System.in);
            int SNforCheck = SNEntered.nextInt();
            for (Id id : idlistforcheck.getIdlist()) {
                if (id.getstudentnumber() == SNforCheck) {
                    idchecker = true ;
                    boolean passchecker = false;
                    while (!passchecker){
                        System.out.println("Enter Your Password:");
                        Scanner PEntered = new Scanner(System.in);
                        String PforCheck = PEntered.nextLine();
                        for (Id idp : idlistforcheck.getIdlist()) {
                            if (id.getPassword().equals(PforCheck)) {
                                System.out.println("you have entered !");
                                StudentData.currentuser.setstudentnumber(SNforCheck);
                                studentpage();
                                passchecker = true ;
                                break;
                            } else {
                                System.out.println("the password you have entered is invalid!");
                            }
                        }
                    }
                }

            }
            if (!idchecker)
                System.out.println("the student number you hve entered is invalid!");
        }
    }
    public void studentpage(){
        while (true){
            System.out.println("what do you want to do now?\n1-show list of courses\n2-show list of your courses\n0-back");
            Scanner input = new Scanner(System.in);
            String command = input.nextLine();
            if (command.equals("1")){
                ChooseDep();
                break;
            } else if (command.equals("0")) {
                cli back = new cli();
                cli.start();
                break;
            } else if (command.equals("2")) {
                defineuser.showuserlist();
            } else {
                System.out.println("Your input is invalid!");
            }

        }
    }
    public void ChooseDep(){
        while (true){
            System.out.println("choose Department:\n1-Mathematics\n2-Physics\n3-Language Center\n4-Computer Engineering");
            Scanner input = new Scanner(System.in);
            String dep = input.nextLine();
            if (Integer.parseInt(dep)==1){
                showstu.showMath();
                break;
            } else if (Integer.parseInt(dep)==2) {
                showstu.showPhysic();
                break;
            } else if (Integer.parseInt(dep)==3) {
                showstu.showLang();
                break;
            } else if (Integer.parseInt(dep)==4) {
                showstu.showCE();
                break;
            }else {
                System.out.println("your input is invalid !");
            }
        }
    }
}