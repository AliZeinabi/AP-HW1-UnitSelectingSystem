import ConnectToUser.Cli;
import Courses.*;
import Student.Id;
import Student.IDList;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        InitialCourseList.InitialCourseList();
        IDList.idlist.add(new Id(111111111,"0000"));
        StudentData.usergencourselist.put(111111111,new HashMap<String , GeneralCourse>());
        StudentData.userprocourselist.put(111111111,new HashMap<String , ProperCourse>());
        StudentData.userlist.put(111111111,new HashMap<String , Course>());

        Cli.start();
    }
}