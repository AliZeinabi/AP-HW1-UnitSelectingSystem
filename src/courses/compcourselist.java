package courses;
import java.util.LinkedList ;

public class compcourselist {
    public LinkedList<course> lecture = new LinkedList<course>() ;
    public LinkedList<course> getLecture() {
        return lecture;
    }

    public void setLecture(LinkedList<course> lecture) {
        this.lecture = lecture;
    }
    public void init(LinkedList<course> lecture){
        lecture.add(new propercourse(40424,50,3, "Operating System","Rasool Jalili", "Sunday-Tuesday","15:00-16:30"));
        lecture.add(new propercourse(40414,32,3, "Compiler Design","Gholamreza Ghasem Tha'ni","Saturday-Monday","15:00-16:30"));
        lecture.add(new propercourse(40419,60,3,"Web Programming","Yahya Poorsoltani","Saturday-Monday","13:30-15:00"));
    }
}

