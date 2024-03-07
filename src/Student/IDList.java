package Student;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import ConnectToUser.Cli;
import Courses.StudentData;

public class IDList {
    private static LinkedList<Id> idlist = new LinkedList<Id>();
    public void setIdlist(LinkedList<Id> idlist) {
        IDList.idlist = idlist;
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
        StudentData s = new StudentData();
        StudentData.usergencourselist.put(SN,new HashMap<>());
        StudentData.userprocourselist.put(SN,new HashMap<>());
        System.out.println("you successfully added to System!");
        Cli cli = new Cli();
        Cli.start();
    }
}