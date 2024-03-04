package courses;
import javax.jws.Oneway;
import java.util.LinkedList;
import java.util.HashMap;
import Student.IDList;
import Student.Id;
import Student.Studentcli;
import java.util.Scanner;
public class StudentData {
                  ///this class is made to save list of courses for any student////
    IDList idlist = new IDList();
    CourseList courseList = new CourseList();
    
    
    private static Id currentuser = new Id(0,"");
    public static Id getCurrentuser() {
        return currentuser;
    }
    public static void setCurrentuser(Id currentuser) {
        StudentData.currentuser = currentuser;
    }

    //create a hashmap of students courses
    private static HashMap<Integer,LinkedList<Object>> usercourselist = new HashMap<>();
    public HashMap<Integer, LinkedList<Object>> getusercourselist() {
        return usercourselist;
    }
    public void setGencou(HashMap<Integer, LinkedList<Object>> gencou) {
        this.usercourselist = usercourselist;
    }
    {
        usercourselist.put(111111111,new LinkedList<>());
    }


    public void add(){
        System.out.println("Enter 0 to back to previous page\nEnter CourseCode to add to your courses:");
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        for (Id id:idlist.getIdlist()) {
            if (command.equals("0")){
                Studentcli studentcli = new Studentcli();
                studentcli.studentpage();
            } else if (id.getstudentnumber()==currentuser.getstudentnumber()) {
                for (generalcourse g:courseList.getGenerallist()){
                    if(g.getCode()==Integer.parseInt(command)){
                        usercourselist.get(currentuser.getstudentnumber()).add(g);
                        add();
                    }
                }
                for (propercourse p:courseList.getProperlist()){
                    if (p.getCode()==Integer.parseInt(command)){
                        usercourselist.get(currentuser.getstudentnumber()).add(p);
                        add();
                    }
                }
            }else {
                System.out.println("your input is invalid!" );
                add();
            }
        }
    }
}
