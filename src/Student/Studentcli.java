package Student;
import ConnectToUser.Cli;
import java.util.Scanner;

import Courses.Check;
import Courses.StudentData;
import Courses.ShowStu;
public class Studentcli{
    IDList idlistforcheck = new IDList();
    StudentData defineuser = new StudentData();
    ShowStu showstu = new ShowStu();
    public void Studentcli() {
        boolean idchecker = false;
        int SNforCheck = 0;
        while (!idchecker) {
            try {
                System.out.println("0-back\nEnter Your Student Number:");
                Scanner SNEntered = new Scanner(System.in);
                SNforCheck = SNEntered.nextInt();
            }catch (Exception e){
                System.out.println("student id must consist of numbers only!\n");
                this.Studentcli();
            }
            for (Id id : idlistforcheck.getIdlist()) {
                if (id.getstudentnumber() == SNforCheck) {
                    idchecker = true ;
                    boolean passchecker = false;
                    while (!passchecker){
                        System.out.println("0-back\nEnter Your Password:");
                        Scanner PEntered = new Scanner(System.in);
                        String PforCheck = PEntered.nextLine();
                        for (Id idp : idlistforcheck.getIdlist()) {
                            if (id.getPassword().equals(PforCheck)) {
                                System.out.println("you have entered !");
                                StudentData.currentuser.setstudentnumber(SNforCheck);
                                this.studentpage();
                                passchecker = true ;
                                break;
                            } else if (SNforCheck==0) {
                                Cli.start();
                            }else {
                                System.out.println("incorrect password !");

                            }
                        }
                    }
                } else if (SNforCheck==0) {
                    Cli.start();
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
                this.ChooseDep();
                break;
            } else if (command.equals("0")) {
                Cli back = new Cli();
                Cli.start();
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
            System.out.println("choose Department:\n0-back\n1-Mathematics\n2-Physics\n3-Language Center\n4-Computer Engineering");
            Scanner input = new Scanner(System.in);
            String dep = input.nextLine();
            if (dep.equals("1")){
                showstu.showMath();
                break;
            } else if (dep.equals("2")) {
                showstu.showPhysic();
                break;
            } else if (dep.equals("3")) {
                showstu.showLang();
                break;
            } else if (dep.equals("4")) {
                showstu.showCE();
                break;
            } else if (dep.equals("0")) {
                this.studentpage();
                break;
            } else {
                System.out.println("your input is invalid !");
            }
        }
    }
}