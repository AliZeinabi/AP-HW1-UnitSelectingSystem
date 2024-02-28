import java.util.LinkedList;
import java.util.Scanner;
import Student.Id;
import courses.*;
public class main {
    public static void main(String[] args) {
        LinkedList<generalcourse> generalcourselist = new LinkedList<generalcourse>();
        LinkedList<propercourse> propercourselist = new LinkedList<propercourse>();
        propercourselist.add(new propercourse(22815,120,4,"Advanced Programming","Hossein Boomari","Saturday-Monday","13:00-15:00","Mathematics"));
        generalcourselist.add(new generalcourse(22015,260,4,"General Mathematics I","Mohsen Jamali","Saturday-Monday","13:00-15:00","Mathematics"));
        generalcourselist.add(new generalcourse(22016,80,4,"General Mathematics II","Mohsen Jamali","Saturday-Monday","10:30-12:30","Mathematics"));
        propercourselist.add(new propercourse(40424,50,3, "Operating System","Rasool Jalili", "Sunday-Tuesday","15:00-16:30","Computer engineering"));
        propercourselist.add(new propercourse(40419,60,3,"Web Programming","Yahya Poorsoltani","Saturday-Monday","13:30-15:00","Computer engineering"));
        generalcourselist.add(new generalcourse(40153,70,3,"Fundamentals of Programming","Mohsen Kazemi","Saturday-Monday","13:30-15:00","Computer engineering"));
        generalcourselist.add(new generalcourse(31119,55,3, "Introduction To Persian Literature","Maryam Seyyedan","Sunday-Tuesday","10:30-12:00","Language Center"));
        generalcourselist.add(new generalcourse(31123,25,3,"Foreign Language","Ali Jahangard","Sunday-Tuesday","15:00-16:30","Language Center"));
        generalcourselist.add(new generalcourse(31109,25,3, "Introductory Spanish","Homa Atashi", "Sunday-Tuesday","15:00-16:30","Language Center"));
        generalcourselist.add(new generalcourse(24011,11,3,"Physics I","Abdollah Langari","Saturday-Monday","07:30-09:00","Physics"));
        propercourselist.add(new propercourse(24213,0,3,"ElectroMagnetics I","Mariam Mirkamali","Saturday-Monday","10:30-12:00","Physics"));
        propercourselist.add(new propercourse(24313,1,3,"Quantum Mechanics II","Laleh Memarzadeh","Sunday-Tuesday","09:00-10:30","Physics"));
        //create a list of students
        LinkedList<Id> users = new LinkedList<Id>();
        users.add(new Id(123456789,"0000"));
        System.out.println("this is unit system!\nenter system as:\n1-Student\n2-Adminastor\n3-sign up ");
        Scanner input = new Scanner(System.in);

    }
}