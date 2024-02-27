package courses;
import java.util.LinkedList ;

public class mathcourselist {
    public LinkedList<course> lecture = new LinkedList<course>();
    public LinkedList<course> getLecture() {
        return lecture;
    }

    public void setLecture(LinkedList<course> lecture) {
        this.lecture = lecture;
    }
    public void init(LinkedList<course> lecture){
        lecture.add(new propercourse(22815,120,4,"Advanced Programming","Hossein Boomari","Saturday-Monday","13:00-15:00"));
        lecture.add(new generalcourse(22015,260,4,"General Mathematics I","Mohsen Jamali","Saturday-Monday","13:00-15:00"));
        lecture.add(new generalcourse(22016,80,4,"General Mathematics II","Mohsen Jamali","Saturday-Monday","10:30-12:30"));

    }
}

