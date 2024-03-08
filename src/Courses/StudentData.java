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
    public static Id currentuser = new Id(0,"");
//    public static Id getCurrentuser() {
//        return currentuser;
//    }
//    public static void setCurrentuser(Id currentuser) {
//        StudentData.currentuser = currentuser;
//    }

    //create a hashmap of students courses
    public static HashMap<Integer,HashMap<String, GeneralCourse>> usergencourselist = new HashMap<>();
    public static HashMap<Integer, HashMap<String, ProperCourse>> userprocourselist = new HashMap<>();
    public void add() {
        System.out.println("Enter 0 to back to previous page\nEnter CourseCode to add to your courses:");
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        for (Id id : idlist.getIdlist()) {
            if (command.equals("0")) {
                Studentcli studentcli = new Studentcli();
                studentcli.ChooseDep();
            } else if (id.getstudentnumber() == currentuser.getstudentnumber()) {
                for (GeneralCourse g : CourseList.getGenerallist().values()) {
                    if (g.getCode().equals(command)) {
                        Check.check(command);
                        if (!Check.isoverlap && Check.sum < 21 && Check.prosum < 6)
                            usergencourselist.get(currentuser.getstudentnumber()).put(command, g);
                        int newcap = g.getCapacity() - 1;
                        g.setCapacity(newcap);
                        System.out.println("course successfully added!");
                        this.add();
                        break;
                    } else if (Check.isoverlap) {
                        System.out.println("this course has time overlap with your courses!");
                        this.add();
                        break;
                    } else if (Check.sum > 20) {
                        System.out.println("can't get this course because of maximum unit limit!");
                        this.add();
                        break;
                    } else if (Check.prosum > 5) {
                        System.out.println("can't get this course because of maximum general unit limit!");
                        this.add();
                        break;
                    }
                }
                for (ProperCourse p : CourseList.getProperlist().values()) {
                    if (p.getCode().equals(command)) {
                        Check.check(command);
                        if (!Check.isoverlap && Check.sum < 21 && Check.prosum < 6)
                            userprocourselist.get(currentuser.getstudentnumber()).put(command, p);
                        int newcap = p.getCapacity() - 1;
                        p.setCapacity(newcap);
                        System.out.println("course successfully added!");
                        this.add();
                        break;
                    } else if (Check.isoverlap) {
                        System.out.println("this course has time overlap with your courses!");
                        this.add();
                        break;
                    } else if (Check.sum > 20) {
                        System.out.println("can't get this course because of maximum unit limit!");
                        this.add();
                        break;
                    }
                }
            }
            System.out.println("invalid input!");
            add();
        }
    }
        public void showuserlist () {
            for (GeneralCourse course : usergencourselist.get(currentuser.getstudentnumber()).values()) {
                System.out.println("Course Code:" + course.getCode() + "*Unit worth:" + course.getWorth() + "*Course:" + course.getName() + "*Capacity:" + course.getCapacity() + "*Instructor:" + course.getInstructor() + "*Date of Final Exam: " + course.getExamdate() + "*weekly Schedule: " + course.getday() + ">" + course.getHour() + "Type:General" + "\n");

            }
            for (ProperCourse course : userprocourselist.get(currentuser.getstudentnumber()).values()) {
                System.out.println("Course Code:" + course.getCode() + "*Unit worth:" + course.getWorth() + "*Course:" + course.getName() + "*Capacity:" + course.getCapacity() + "*Instructor:" + course.getInstructor() + "*Date of Final Exam: " + course.getExamdate() + "*weekly Schedule: " + course.getday() + ">" + course.getHour() + "Type:NotGeneral" + "\n");

            }
            while (true) {
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
                    }
                }
                for (ProperCourse course : userprocourselist.get(currentuser.getstudentnumber()).values()) {
                    if (in.equals("0")) {
                        Studentcli studentcli = new Studentcli();
                        studentcli.studentpage();
                    } else if (course.getCode().equals(in)) {
                        userprocourselist.get(currentuser.getstudentnumber()).remove(in);
                        System.out.println("course successfully removed!");
                    }
                }

            }
        }
    }