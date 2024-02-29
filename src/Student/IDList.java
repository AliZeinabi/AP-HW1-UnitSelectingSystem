package Student;
import java.util.LinkedList;
import java.util.Scanner;
import ConnectToUser.cli;
public class IDList {
    public LinkedList<Id> idlist = new LinkedList<Id>();
    public void setIdlist(LinkedList<Id> idlist) {
        this.idlist = idlist;
    }
    public LinkedList<Id> getIdlist() {
        return idlist;
    }
    {
        idlist.add(new Id(111111111,"0000"));
    }
    public void addID(){
        System.out.println("Enter Your Student Number: ");
        Scanner EnteredSN = new Scanner(System.in);
        int SN = EnteredSN.nextInt();
        System.out.println("Enter Your Password:");
        Scanner EnteredPass = new Scanner(System.in);
        String Password = EnteredPass.nextLine();
        idlist.add(new Id(SN,Password));
        System.out.println("you successfully added to System!");
        cli cli = new cli();
        ConnectToUser.cli.start();
    }
}