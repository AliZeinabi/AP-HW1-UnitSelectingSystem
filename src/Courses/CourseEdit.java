package Courses;

import java.util.Scanner;
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
        String gen = info.nextLine();
        System.out.println("course name:");
        String name = info.nextLine();
        System.out.println("course code :");
        String code = info.nextLine();
        int codea=Integer.parseInt(code);
        System.out.println("instructor's name:");
        String ins = info.nextLine();
        System.out.println("capacity:");
        String cap = info.nextLine();
        int capa=Integer.parseInt(cap);
        System.out.println("unit worth:");
        String unit = info.nextLine();
        int unita=Integer.parseInt(unit);
        System.out.println("class days(format: Day-Day):");
        String day = info.nextLine();
        System.out.println("class hour(time format must be HH:MM):");
        String time = info.nextLine();
        System.out.println("enter exam date(format=YYYY/MM/DD-HH:MM):");
        String exam = info.nextLine();

    }

    public void detail() {
        System.out.println("enter course code:\nenter 0 to back");
        Scanner codein = new Scanner(System.in);
        String code = codein.nextLine();
        for (String c : CourseList.getGenerallist().keySet()) {
            if (c.equals(code)) {
                System.out.println("Course Code:" + CourseList.getGenerallist().get(c).getCode() + "*Unit worth:" + CourseList.getGenerallist().get(c).getWorth() + "*Course:" + CourseList.getGenerallist().get(c).getName() + "*Capacity:" + CourseList.getGenerallist().get(c).getCapacity() + "*Instructor:" + CourseList.getGenerallist().get(c).getInstructor() + "*Date of Final Exam:" + CourseList.getGenerallist().get(c).getExamdate() + "*weekly Schedule:" + CourseList.getGenerallist().get(c).getday() + ">" + CourseList.getGenerallist().get(c).getHour() + "Type:General");
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
