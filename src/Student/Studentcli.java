package Student;
import java.util.Scanner;
public class Studentcli{
    IDList idlistforcheck = new IDList();
    public void Studentcli() {
        boolean idchecker = false;
        while (!idchecker) {
            System.out.println("Enter Your Student Number:\n");
            Scanner SNEntered = new Scanner(System.in);
            int SNforCheck = SNEntered.nextInt();
            for (Id id : idlistforcheck.idlist) {
                if (id.getstudentnumber() == SNforCheck) {
                    idchecker = true ;
                    boolean passchecker = false;
                    while (!passchecker){
                        System.out.println("Enter Your Password:\n");
                        Scanner PEntered = new Scanner(System.in);
                        String PforCheck = PEntered.nextLine();
                        for (Id idp : idlistforcheck.idlist) {
                            if (id.getPassword().equals(PforCheck)) {
                                System.out.println("you have entered !");
                                passchecker = true ;
                            } else {
                                System.out.println("the password you have entered is invalid!\n");
                            }
                        }
                    }
                }
                else {
                    System.out.println("the student number you hve entered is invalid!\n");
                }
            }
        }
    }
}



