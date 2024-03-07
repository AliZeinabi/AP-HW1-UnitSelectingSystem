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
        {
        usergencourselist.put(111111111,new HashMap<String , GeneralCourse>());
        userprocourselist.put(111111111,new HashMap<String , ProperCourse>());
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
                for (GeneralCourse g: CourseList.getGenerallist().values()){
                    if(g.getCode().equals(command)){
                        usergencourselist.get(currentuser.getstudentnumber()).put(command,g);
                        this.add();
                        return;
                    }
                }
                for (ProperCourse p: CourseList.getProperlist().values()){
                    if (p.getCode().equals(command)){
                        userprocourselist.get(currentuser.getstudentnumber()).put(command,p);
                        this.add();
                        return;
                    }
                }
            }
        }
        System.out.println("your input is invalid!" );
    }
    public void showuserlist(){
        for (GeneralCourse course:usergencourselist.get(currentuser.getstudentnumber()).values()){
            System.out.println("Course Code:"+course.getCode()+"*Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+">"+course.getHour()+"Type:General"+"\n");

        }
        for (ProperCourse course:userprocourselist.get(currentuser.getstudentnumber()).values()){
            System.out.println("Course Code:"+course.getCode()+"*Unit worth:"+course.getWorth()+"*Course:"+course.getName()+"*Capacity:"+course.getCapacity()+"*Instructor:"+course.getInstructor()+"*Date of Final Exam: "+course.getExamdate()+"*weekly Schedule: "+course.getday()+">"+course.getHour()+"Type:NotGeneral"+"\n");

        }
        while (true){
            System.out.println("Enter course code to remove it from your courses:\nEnter 0 to back to previous page:");
            Scanner input = new Scanner(System.in);
            String in = input.nextLine();
            for (GeneralCourse course:usergencourselist.get(currentuser.getstudentnumber()).values()) {
                if (in.equals("0")) {
                    Studentcli studentcli = new Studentcli();
                    studentcli.studentpage();
                } else if (course.getCode().equals(in)) {
                    usergencourselist.get(currentuser.getstudentnumber()).remove(in);
                    System.out.println("course successfully removed!");
                }
            }
            for (ProperCourse course:userprocourselist.get(currentuser.getstudentnumber()).values()) {
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