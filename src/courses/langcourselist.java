package courses;
import java.util.LinkedList ;
public class langcourselist {
    public LinkedList<course> lecture = new LinkedList<course>();
    public LinkedList<course> getLecture() {
        return lecture;
    }
    public void setLecture(LinkedList<course> lecture) {
        this.lecture = lecture;
    }
 {
        lecture.add(new generalcourse(31119,55,3, "Introduction To Persian Literature","Maryam Seyyedan","Sunday-Tuesday","10:30-12:00"));
        lecture.add(new generalcourse(31123,25,3,"Foreign Language","Ali Jahangard","Sunday-Tuesday","15:00-16:30"));
        lecture.add(new generalcourse(31109,25,3, "Introductory Spanish","Homa Atashi", "Sunday-Tuesday","15:00-16:30"));
    }

}

