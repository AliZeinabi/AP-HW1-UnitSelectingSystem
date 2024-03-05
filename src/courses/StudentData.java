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
    public static Id currentuser = new Id(0,"");
//    public static Id getCurrentuser() {
//        return currentuser;
//    }
//    public static void setCurrentuser(Id currentuser) {
//        StudentData.currentuser = currentuser;
//    }

    //create a hashmap of students courses
    public static HashMap<Integer,LinkedList<generalcourse>> usergencourselist = new HashMap<>();
    public static HashMap<Integer, LinkedList<propercourse>> userprocourselist = new HashMap<>();
        {
        usergencourselist.put(111111111,new LinkedList<>());
        userprocourselist.put(111111111,new LinkedList<>());
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
                        usergencourselist.get(currentuser.getstudentnumber()).add(g);
                    }
                }
                for (propercourse p:courseList.getProperlist()){
                    if (p.getCode()==Integer.parseInt(command)){
                        userprocourselist.get(currentuser.getstudentnumber()).add(p);
                    }
                }
                break;
            }else {
                System.out.println("your input is invalid!" );
                add();
            }
        }
    }
    public void showuserlist(){
        for (generalcourse course:usergencourselist.get(currentuser.getstudentnumber())){
            System.out.println("Course Code: "+course.getCode()+"*Unit worth: "+course.getWorth()+"*Course: "+course.getName()+"*Capacity: "+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+" "+course.getHour()+"Type: General"+"\n");

        }
        for (propercourse course:userprocourselist.get(currentuser.getstudentnumber())){
            System.out.println("Course Code: "+course.getCode()+"*Unit worth: "+course.getWorth()+"*Course: "+course.getName()+"*Capacity: "+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+" "+course.getHour()+"Type: General"+"\n");

        }
        while (true){
            System.out.println("Enter course code to remove it from your courses:\nEnter 0 to back to previous page:");
            Scanner input = new Scanner(System.in);
            String in = input.nextLine();
            for (generalcourse course:usergencourselist.get(currentuser.getstudentnumber())) {
                if (in.equals("0")) {
                    Studentcli studentcli = new Studentcli();
                    studentcli.studentpage();
                } else if () {
                    
                }
            }
        }

    }
}
