package Courses;
import java.util.HashMap;
import Student.IDList;
import Student.Id;
import Student.Studentcli;
import java.util.Scanner;
public class StudentData {
    ///this class is made to save list of courses for any student////
    IDList idlist = new IDList();
    CourseList courseList = new CourseList();
    public static Id currentuser = new Id(0, "");
//    public static Id getCurrentuser() {
//        return currentuser;
//    }
//    public static void setCurrentuser(Id currentuser) {
//        StudentData.currentuser = currentuser;
//    }

    //create a hashmap of students courses
    public static HashMap<Integer, HashMap<String, GeneralCourse>> usergencourselist = new HashMap<>();
    public static HashMap<Integer, HashMap<String, ProperCourse>> userprocourselist = new HashMap<>();
    public static HashMap<Integer, HashMap<String, Course>> userlist = new HashMap<>();



    public void add() {
        System.out.println("Enter 0 to back to previous page\nEnter CourseCode to add to your courses:");
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        for (Id id : idlist.getIdlist()) {
            if (command.equals("0")) {
                Studentcli studentcli = new Studentcli();
                studentcli.ChooseDep();
            } else if (id.getstudentnumber() == currentuser.getstudentnumber()) {
                boolean overlapNotFound = true;
                for (Course c:StudentData.userlist.get(currentuser.getstudentnumber()).values()){
                    String[] days1 = c.getday().split("-");
                    String[] days2 = CourseList.getList().get(command).getday().split("-");
                    String hours1 = c.getHour();
                    String hours2 = CourseList.getList().get(command).getHour();
                    boolean checker = Overlap.nooverlap(days1,days2,hours1,hours2);
                    if (!checker) {
                        overlapNotFound = false;
                        System.out.println("overlap found");
                        this.add();
                    }
                }
                if (overlapNotFound) {
                    System.out.println("course added");
                    if (CourseList.getList().get(command) instanceof GeneralCourse){
                        StudentData.userlist.get(currentuser.getstudentnumber()).put(command,CourseList.getList().get(command));
                        StudentData.usergencourselist.get(currentuser.getstudentnumber()).put(command,CourseList.getGenerallist().get(command));
                        this.add();
                    } else if (CourseList.getList().get(command) instanceof ProperCourse) {
                        StudentData.userlist.get(currentuser.getstudentnumber()).put(command, CourseList.getList().get(command));
                        StudentData.userprocourselist.get(currentuser.getstudentnumber()).put(command, CourseList.getProperlist().get(command));
                        this.add();
                    }
                }
            }
        }
        System.out.println("invalid input");
        add();
    }

    public void showuserlist() {
        for (GeneralCourse course : usergencourselist.get(currentuser.getstudentnumber()).values()) {
            System.out.println("Course Code:" + course.getCode() + "*Unit worth:" + course.getWorth() + "*Course:" + course.getName() + "*Capacity:" + course.getCapacity() + "*Instructor:" + course.getInstructor() + "*Date of Final Exam: " + course.getExamdate() + "*weekly Schedule: " + course.getday() + ">" + course.getHour() + "Type:General" + "\n");
        }
        for (ProperCourse course : userprocourselist.get(currentuser.getstudentnumber()).values()) {
            System.out.println("Course Code:" + course.getCode() + "*Unit worth:" + course.getWorth() + "*Course:" + course.getName() + "*Capacity:" + course.getCapacity() + "*Instructor:" + course.getInstructor() + "*Date of Final Exam: " + course.getExamdate() + "*weekly Schedule: " + course.getday() + ">" + course.getHour() + "Type:NotGeneral" + "\n");
        }
        System.out.println("Enter course code to remove it from your courses:\nEnter 0 to back to previous page:");
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        for (GeneralCourse course : usergencourselist.get(currentuser.getstudentnumber()).values()) {
            if (in.equals("0")) {
                Studentcli studentcli = new Studentcli();
                studentcli.studentpage();
            } else if (course.getCode().equals(in)) {
                usergencourselist.get(currentuser.getstudentnumber()).remove(in);
                System.out.println("course successfully removed!");
                this.showuserlist();
                break;
            }
        }
        for (ProperCourse course : userprocourselist.get(currentuser.getstudentnumber()).values()) {
            if (in.equals("0")) {
                Studentcli studentcli = new Studentcli();
                studentcli.studentpage();
            } else if (course.getCode().equals(in)) {
                userprocourselist.get(currentuser.getstudentnumber()).remove(in);
                System.out.println("course successfully removed!");
                this.showuserlist();
                break;
            }
        }
    }
}
