package courses;
import javax.jws.Oneway;
import java.util.LinkedList;
import java.util.HashMap;
import Student.IDList;
import Student.Id;
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
    private static HashMap<Integer,LinkedList<generalcourse>> gencou = new HashMap<>();
    private static HashMap<Integer,LinkedList<propercourse>> procou = new HashMap<>();
    public HashMap<Integer, LinkedList<generalcourse>> getGencou() {
        return gencou;
    }
    public void setGencou(HashMap<Integer, LinkedList<generalcourse>> gencou) {
        this.gencou = gencou;
    }
    public HashMap<Integer, LinkedList<propercourse>> getProcou() {
        return procou;
    }
    public void setProcou(HashMap<Integer, LinkedList<propercourse>> procou) {
        this.procou = procou;
    }
    {
        gencou.put(111111111,new LinkedList<>());
        procou.put(111111111,new LinkedList<>());
    }


    public void add(){

        for (Id id:idlist.getIdlist()) {
            if (id.getstudentnumber()==currentuser.getstudentnumber()){ //condition to edit current user courselist!
                for (:) {

                }
            }
        }
    }

}
