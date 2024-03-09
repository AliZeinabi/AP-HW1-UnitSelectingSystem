package Courses;

import java.util.Scanner;
import java.util.Set;

import Admin.ShowCourseToAdmin ;
public class CourseEdit {
    CourseList list = new CourseList();
    StudentData students = new StudentData();

    public void action() {
        while (true) {
            System.out.println("\n1-add a new course:\n2-see more details on a course::\n0-back");
            Scanner input = new Scanner(System.in);
            String choose = input.nextLine();
            if (Integer.parseInt(choose) == 1) {
                add();
                break;
            } else if (Integer.parseInt(choose) == 0) {
                ShowCourseToAdmin back = new ShowCourseToAdmin();
                back.Show();
                break;
            } else if (Integer.parseInt(choose) == 2) {
                detail();
                break;
            } else {
                System.out.println("your input is invalid!");
            }
        }
    }

    public void add() {
        Scanner info = new Scanner(System.in);
        System.out.println("enter course identity:\n1-general\n2-proper");
//        String gen = info.nextLine();
        String gen = "";
        try {
            gen = info.nextLine();
            if (gen.equals("1")){
            } else if (gen.equals("2")) {
            }else {            System.out.println("invalid input for course type!");this.add();}
        }catch (Exception e){
            System.out.println("input should be 1 or 2");
            this.add();
        }
        String dep = "";
        try {
            System.out.println("Department:\n1-Math\n2-Physics\n3-Language Center\n4-Computer Engineering");
            String depchoose = info.nextLine();
            if (depchoose.equals("1")){
                dep = "Mathematics";
            } else if (depchoose.equals("2")) {
                dep = "Physics";
            } else if (depchoose.equals("3")) {
                dep = "Language Center";
            } else if (depchoose.equals("4")) {
                dep = "Computer engineering";
            }else {            System.out.println("invalid input for department!");this.add();}
        }catch (Exception e){
            System.out.println("invalid input for department!");
            this.add();
        }
        System.out.println("course name:");
        String name = info.nextLine();
        System.out.println("course code :");
        String code = info.nextLine();
        try{
            int codea=Integer.parseInt(code);
        }catch (Exception e){
            System.out.println("invalid input for course code!it must be a sequence of numbers!!");
            this.add();
        }
        System.out.println("instructor's name:");
        String ins = info.nextLine();
        System.out.println("capacity:");
        String cap = info.nextLine();
        int capa = 0;
        try {
            capa=Integer.parseInt(cap);

        }catch (Exception e){
            System.out.println("capacity of a course must be integer!");
            this.add();
        }
        System.out.println("unit worth:");
        String unit = info.nextLine();
        int unita = 0;
        try {
             unita=Integer.parseInt(unit);

        }catch (Exception e){
            System.out.println("unit worth must be a number!");
        }
        System.out.println("class days(format: Day-Day):");
        String day = "";
        try {
            day = info.nextLine();
            String[] days = day.split("-");
            String[] asghar = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
            for (String rooz:asghar){
                for (String Day:days) {
                    if (rooz.equals(Day)){}else {System.out.println("invalid input for department!");this.add();}
                }
            }
        }catch (Exception e){
            System.out.println("something wrong with your day format\nfirst letter must be capital!\nsplit days with '-' and nothing else");
            this.add();
        }
        System.out.println("class hour(time format must be HH:MM-HH:MM):");
        String time = "";
        try {
            time=info.nextLine();
            String[] generalasghar = time.split("-");
            String[] asghar1 = generalasghar[0].split(":");
            String[] asghar2 = generalasghar[1].split(":");
            if (Integer.parseInt(asghar1[0])==24){} else if (Integer.parseInt(asghar1[1])==60) {}
            if (Integer.parseInt(asghar2[0])==24){} else if (Integer.parseInt(asghar2[1])==60) {}
            if(Integer.parseInt(asghar1[0])>23){
                System.out.println("incorrect time class input!");
                this.add();
            } else if (Integer.parseInt(asghar1[1])>59) {
                System.out.println("incorrect time class input!");
                this.add();
            }
            if(Integer.parseInt(asghar2[0])>23){
                System.out.println("incorrect time class input!");
                this.add();
            } else if (Integer.parseInt(asghar2[1])>59) {
                System.out.println("incorrect time class input!");
                this.add();
            }
        }catch (Exception e){
            System.out.println("incorrect format for time input!");
            this.add();
        }
        System.out.println("enter exam date(format=YYYY/MM/DD-HH:MM):");
        String exam = "";
        try {
            exam = info.nextLine();
            String[] asghar1 = exam.split("-");
            String[] asghar2 = asghar1[0].split("/");
            String[] asghar3 = asghar1[1].split(":");
            if (Integer.parseInt(asghar2[0])==0){} else if (Integer.parseInt(asghar2[1])==0){}else if (Integer.parseInt(asghar2[2])==0){}
            if (Integer.parseInt(asghar3[0])==0){}else if(Integer.parseInt(asghar3[1])==0){}
        }catch (Exception e){
            System.out.println("wrong input!use provided format exactly!!");
            this.add();
        }
        if (gen.equals("1")){
            CourseList.getGenerallist().put(code,new GeneralCourse(code,capa,unita,name,ins,day,time,dep,exam));
            CourseList.getList().put(code,new GeneralCourse(code,capa,unita,name,ins,day,time,dep,exam));
            System.out.println("course successfully added!");
            this.action();
        } else if (gen.equals("2")) {
            CourseList.getProperlist().put(code,new ProperCourse(code,capa,unita,name,ins,day,time,dep,exam));
            CourseList.getList().put(code,new ProperCourse(code,capa,unita,name,ins,day,time,dep,exam));
            System.out.println("course successfully added!");
            this.action();
        }
    }
    public void detail() {
        System.out.println("enter course code:\nenter 0 to back");
        Scanner codein = new Scanner(System.in);
        String code = codein.nextLine();
        if (code.equals("0")){this.action();}
        for (String c : CourseList.getList().keySet()) {
            if (c.equals(code)) {
                System.out.println("Course Code:" + CourseList.getList().get(c).getCode() + "*Unit worth:" + CourseList.getList().get(c).getWorth() + "*Course:" + CourseList.getList().get(c).getName() + "*Capacity:" + CourseList.getList().get(c).getCapacity() + "*Instructor:" + CourseList.getList().get(c).getInstructor() + "*Date of Final Exam:" + CourseList.getList().get(c).getExamdate() + "*weekly Schedule:" + CourseList.getList().get(c).getday() + ">" + CourseList.getList().get(c).getHour() + "Type:"+CourseList.getList().get(c).getClass().getSimpleName());
                System.out.println("what do you want to do now?\n1-see students:\n2-change capacity:\n0-back");
                String in2 = codein.nextLine();
                if (in2.equals("0")) {
                    this.detail();
                } else if (in2.equals("1")) {
                    for (int sn : StudentData.usergencourselist.keySet()) {
                        for (String cc:StudentData.usergencourselist.get(sn).keySet()) {
                            if (cc.equals(code)) {
                                System.out.println(sn);
                            }
                        }
                    }
                    for (int sn : StudentData.userprocourselist.keySet()) {
                        for (String cc:StudentData.userprocourselist.get(sn).keySet()){
                            if (cc.equals(code)){
                                System.out.println(sn);
                            }
                        }
                    }
                    System.out.println("enter student id to remove or add to this course or enter 0 to back:");
                    int removeid = codein.nextInt();
                    if (removeid==0){
                        this.detail();
                    }
                    boolean isstudentregisteredincourse = true;
                    // next for loop is removing registered id
                    try {
                        StudentData.userlist.get(removeid).get(code).getWorth();
                    }catch (Exception e){
                        isstudentregisteredincourse = false;
                    }
                    if(isstudentregisteredincourse){
                        for (String gotcourse:StudentData.userlist.get(removeid).keySet()){
                            if (gotcourse.equals(code)){
                                if (CourseList.getList().get(code) instanceof GeneralCourse){
                                    StudentData.usergencourselist.get(removeid).remove(code);
                                    StudentData.userlist.get(removeid).remove(code);
                                    System.out.println("id successfully removed!");
                                    this.detail();
                                } else if (CourseList.getList().get(code) instanceof ProperCourse) {
                                    StudentData.userprocourselist.get(removeid).remove(code);
                                    StudentData.userlist.get(removeid).remove(code);
                                    System.out.println("id successfully removed!");
                                    this.detail();
                                }
                            }
                        }
                    }else {
                        if (CourseList.getList().get(code) instanceof GeneralCourse){
                            StudentData.usergencourselist.get(removeid).put(code,CourseList.getGenerallist().get(code));
                            StudentData.userlist.get(removeid).put(code,CourseList.getGenerallist().get(code));
                            System.out.println("id successfully added!");
                            this.detail();
                        } else if (CourseList.getList().get(code) instanceof ProperCourse) {
                            StudentData.userprocourselist.get(removeid).put(code,CourseList.getProperlist().get(code));
                            StudentData.userlist.get(removeid).put(code,CourseList.getProperlist().get(code));
                            System.out.println("id successfully added!");
                            this.detail();
                        }
                    }
                    System.out.println("unknown input");
                    this.detail();
                    //
                } else if (in2.equals("2")) {
                    System.out.println("enter new capacity:");
                    int amount = codein.nextInt();
                    for (String g:CourseList.getGenerallist().keySet()) {
                        if (g.equals(code)) {
                            CourseList.getGenerallist().get(g).setCapacity(amount);
                            System.out.println("capacity of course successfully changed!");
                            ShowCourseToAdmin show = new ShowCourseToAdmin();
                            show.Show();
                        }
                    }
                    for (String p:CourseList.getProperlist().keySet()){
                        if (p.equals(code)){
                            CourseList.getProperlist().get(p).setCapacity(amount);
                            System.out.println("capacity of course successfully changed!");
                            ShowCourseToAdmin show = new ShowCourseToAdmin();
                        }
                    }
                }
            }
        }
    }
    public void increasecapacity(){
        System.out.println("enter the course code you want to change it's capacity:");
        Scanner codeinput = new Scanner(System.in);
        String code = codeinput.nextLine();
        System.out.println("enter new capacity:");
        int amount = codeinput.nextInt();
        for (String g:StudentData.usergencourselist.get(StudentData.currentuser.getstudentnumber()).keySet()) {
            if (g.equals(code)) {
                StudentData.usergencourselist.get(StudentData.currentuser.getstudentnumber()).get(g).setCapacity(amount);
                System.out.println("capacity of course successfully changed!");
                ShowCourseToAdmin show = new ShowCourseToAdmin();
                show.Show();

            }
        }
        }
    }
