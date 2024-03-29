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
                boolean islimitreached = false;
                boolean isgenlimitreached = false;
                boolean isoverlapexam = false;
                for (Course c:StudentData.userlist.get(currentuser.getstudentnumber()).values()){
                    String[] days1 = c.getday().split("-");
                    String[] days2 = CourseList.getList().get(command).getday().split("-");
                    String hours1 = c.getHour();
                    String hours2 = CourseList.getList().get(command).getHour();
                    boolean checker = Overlap.nooverlap(days1,days2,hours1,hours2);
                    boolean limitcheck = Check.islimitreached(CourseList.getList().get(command).getWorth());
                    boolean genlimitcheck = false;
                    boolean isexamover = Overlap.isExamdateoverlap(c.getExamdate(),CourseList.getList().get(command).getExamdate());
                    if (c instanceof GeneralCourse){
                        try {
                            genlimitcheck = Check.isgenlimitreached(CourseList.getGenerallist().get(command).getWorth());
                        }catch (Exception e){}
                    }
                    if (!checker) {
                        overlapNotFound = false;
                        System.out.println("overlap found!");
                        this.add();
                    } else if (limitcheck) {
                        islimitreached = true;
                        System.out.println("unit limit is reached!");
                        this.add();
                    } else if (genlimitcheck) {
                        isgenlimitreached = true;
                        System.out.println("general unit limit is reached!");
                        this.add();
                    } else if (isexamover) {
                        isoverlapexam = true;
                        System.out.println("exam overlap with current courses!");
                    }
                }
                if (overlapNotFound && !isgenlimitreached && !islimitreached && !isoverlapexam) {
                    int imp = 0;
                    if (CourseList.getList().get(command) instanceof GeneralCourse){
                            imp = CourseList.getList().get(command).getCapacity()-1;
                            if(imp<0){
                                System.out.println("can't get because capacity is zero");
                                this.add();
                            }
                            CourseList.getGenerallist().get(command).setCapacity(imp);
                            CourseList.getList().get(command).setCapacity(imp);
                        StudentData.userlist.get(currentuser.getstudentnumber()).put(command,CourseList.getList().get(command));
                        StudentData.usergencourselist.get(currentuser.getstudentnumber()).put(command,CourseList.getGenerallist().get(command));
                        System.out.println("course added");
                        this.add();
                    } else if (CourseList.getList().get(command) instanceof ProperCourse) {
                        imp = CourseList.getList().get(command).getCapacity()-1;
                        if (imp<0){
                            System.out.println("can't get because capacity is zero");
                            this.add();
                        }
                            CourseList.getProperlist().get(command).setCapacity(imp);
                            CourseList.getList().get(command).setCapacity(imp);
                        StudentData.userlist.get(currentuser.getstudentnumber()).put(command, CourseList.getList().get(command));
                        StudentData.userprocourselist.get(currentuser.getstudentnumber()).put(command, CourseList.getProperlist().get(command));
                        System.out.println("course added");
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
                userlist.get(currentuser.getstudentnumber()).remove(in);
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
